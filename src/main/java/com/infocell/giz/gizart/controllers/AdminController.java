package com.infocell.giz.gizart.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.Admin;
import com.infocell.giz.gizart.model.Gender;
import com.infocell.giz.gizart.model.Lga;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.State;
import com.infocell.giz.gizart.model.Title;
import com.infocell.giz.gizart.service.AddressService;
import com.infocell.giz.gizart.service.AdminService;
import com.infocell.giz.gizart.service.BioDataService;
import com.infocell.giz.gizart.service.EmailService;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.LoginService;
import com.infocell.giz.gizart.service.RoleService;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.StateService;
import com.infocell.giz.gizart.service.TitleService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private GenderService genderService;

	@Autowired
	private BioDataService bioDataService;

	@Autowired
	private EmailService emailService;

	@Autowired
	private TitleService titleService;

	@Autowired
	private StateService stateService;

	@Autowired
	private LgaService lgaService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private Sid sid;

	@Autowired
	private AddressService addressService;

	@Autowired
	private LoginService loginService;

	@Autowired
	private RoleService roleService;

	/*
	 * @Autowired private SubjectService subjectService;
	 */

	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String adminLogin(Model model) {

		Admin a = new Admin();
		LocalDate ld = LocalDate.now();
		model.addAttribute("currentYear", ld.getYear());
		model.addAttribute("adminLog", a);
		return "adminLogin";

	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String adminLogin(@ModelAttribute("adminLog") Admin admin, HttpSession session, RedirectAttributes rd) {
		Login l = loginService.getWithSid(admin.getLogin().getUsername(), admin.getLogin().getPassword());

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				session.setAttribute("admin", l);
				return "redirect:/admin/dashboard";

			} else {
				rd.addFlashAttribute("msg", "wrong username or password!");
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			rd.addFlashAttribute("msg", "Only administrators please");
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String createAdmin(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				return "createAdmin";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String createAdmin(@ModelAttribute Admin admin, RedirectAttributes rd, HttpSession session) {

		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				if (admin.getAdminId() == 0) {
					admin.getLogin().setRole(roleService.getWithSid("admin"));
					adminService.create(admin);
					rd.addFlashAttribute("adminCreate", "Successfully added..");
					return "redirect:/admin/add";

				} else {
					adminService.update(admin);
					return "redirect:/admin/view";
				}
			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String adminDashboard(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
			return "adminIndex";

		} else {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping("/view")
	public String viewAdmin(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				return "allAdmin";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping("/delete/{sid}")
	public String delete(@PathVariable("sid") int sid, HttpSession session, RedirectAttributes rd) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin") && l.getAdmin().getAdminId() == sid) {

				adminService.delete(sid);

				return "redirect:/admin/logout";

			} else {
				rd.addFlashAttribute("msg", "You cannot do that");
				return "redirect:/admin/view";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/edit/{sid}", method = RequestMethod.GET)
	public String edit(@PathVariable("sid") int sid, Model model, HttpSession session, RedirectAttributes rd) {

		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin") && l.getAdmin().getAdminId() == sid) {

				model.addAttribute("adminCommandObject", adminService.get(sid));
				return "createAdmin";

			} else {
				rd.addFlashAttribute("msg", "You cannot do that");
				return "redirect:/admin/view";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute("editObj") Admin admin, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				// adminService.update(admin);
				return "redirect:/admin/view";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping("/add/expert")
	public String manageExperts() {
		return "";

	}

	@ModelAttribute("titleList")
	public List<Title> titleList() {
		return titleService.getList();
	}

	@ModelAttribute("genderList")
	public List<Gender> genderList() {
		return genderService.getList();
	}

	@ModelAttribute("stateList")
	public List<State> stateList() {
		return stateService.getList();
	}

	@ModelAttribute("lgaList")
	public List<Lga> lgaList() {
		return lgaService.getList();

	}

	@ModelAttribute("adminCommandObject")
	public Admin getBioDataCommand() {
		return new Admin();
	}

	@RequestMapping(value = "/logout")
	public String adminLogOut(RedirectAttributes rd, HttpSession session) {
		if (session.getAttribute("admin") != null) {
			session.removeAttribute("admin");
			rd.addFlashAttribute("logout", "successfully logged out!");
			return "redirect:/admin/login";

		} else {
			return "redirect:/";
		}

	}

	@ModelAttribute("adminList")
	public List<Admin> getAdminList() {
		return adminService.getList();

	}

	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// binder.addValidators(new AdminValidator());
	//
	// }
	//
	// @ExceptionHandler(AdminException.class)
	// public String exceptionHandler() {
	// return "adminException";
	//
	// }

}
