package com.infocell.giz.gizart.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.email.AdminEnrolmentNotification;
import com.infocell.giz.gizart.email.NewEnrolmentMail;
import com.infocell.giz.gizart.model.Enrolment;
import com.infocell.giz.gizart.model.Expert;
import com.infocell.giz.gizart.model.ExpertImage;
import com.infocell.giz.gizart.model.Gender;
import com.infocell.giz.gizart.model.Interview;
import com.infocell.giz.gizart.model.Lga;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.MaritalStatus;
import com.infocell.giz.gizart.model.State;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.AdminService;
import com.infocell.giz.gizart.service.AvailabilityStatusService;
import com.infocell.giz.gizart.service.EnrolmentService;
import com.infocell.giz.gizart.service.EnrolmentStatusService;
import com.infocell.giz.gizart.service.ExpertImageService;
import com.infocell.giz.gizart.service.ExpertService;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.InterviewService;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.LoginService;
import com.infocell.giz.gizart.service.MaritalStatusService;
import com.infocell.giz.gizart.service.StateService;
import com.infocell.giz.gizart.service.SubSkillService;

@Controller
@RequestMapping("/enrol")
public class EnrolmentController {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private EnrolmentService enrolmentService;

	@Autowired
	private MaritalStatusService maritalStatusService;

	@Autowired
	private StateService stateService;

	@Autowired
	private LgaService lgaService;

	@Autowired
	private GenderService genderService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private InterviewService interviewService;

	@Autowired
	private SubSkillService subSkillService;

	@Autowired
	private ExpertService expertService;

	@Autowired
	private LoginService loginService;

	@Autowired
	private EnrolmentStatusService enrolmentStatusService;

	@Autowired
	private AvailabilityStatusService availabilityStatusService;

	@Autowired
	private ExpertImageService expertImageService;

	private NewEnrolmentMail newEnrolmentMail = new NewEnrolmentMail();

	private AdminEnrolmentNotification adminEnrolmentNotification = new AdminEnrolmentNotification();

	@RequestMapping(value = "/new")
	public String newRegistration(Model model) {

		return "Enrol";

	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String newRegistration(@ModelAttribute("enrollee") Enrolment enrolment, RedirectAttributes rd) {

		enrolment.setEnrolmentStatus(enrolmentStatusService.getWithSid("Enrolled"));

		enrolmentService.create(enrolment);
		// newEnrolmentMail.sendEmail(enrolment);
		// adminEnrolmentNotification.sendToAllAdmins(adminService.getList());
		rd.addFlashAttribute("msg", "successfully added");

		return "redirect:/enrol/new";
	}

	@RequestMapping(value = "/manage/enrolments", method = RequestMethod.GET)
	public String manageEnrolments(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("enrolledList", enrolmentService.getPendingList());
				return "ManageEnrolments";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}
	}

	@RequestMapping(value = "/manage/interviewees", method = RequestMethod.GET)
	public String manageInterviewees(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("invitedList", interviewService.getList());
				return "ManageInterviewees";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/manage/experts", method = RequestMethod.GET)
	public String manageExperts(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("expertList", enrolmentService.getAbsorbedList());
				return "ManageExperts";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/update")
	public String updateRegistration() {
		return null;
	}

	@RequestMapping(value = "/invite/{enrolmentId}")
	public String invite(@PathVariable("enrolmentId") int enrolmentId, HttpSession session, RedirectAttributes rd) {

		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				Enrolment e = enrolmentService.get(enrolmentId);

				Interview inter = interviewService.getWithEnrolment(e);
				e.setEnrolmentStatus(enrolmentStatusService.getWithSid("Invited"));
				enrolmentService.update(e);
				Interview i = new Interview();

				i.setEnrolment(e);
				i.setDate(new Date());

				interviewService.create(i);
				rd.addFlashAttribute("msg", "successfully invited");

				return "redirect:/enrol/manage/enrolments";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		} catch (DataIntegrityViolationException e) {

			rd.addFlashAttribute("errMsg", "This artisan is already invited");
			return "redirect:/enrol/manage/enrolments";

		}

	}

	@RequestMapping(value = "/promote/{interviewId}")
	public String promote(@PathVariable("interviewId") int interviewId, HttpSession session, RedirectAttributes rd,
			Model model) {

		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("interviewee", interviewService.get(interviewId));
				return "make-expert";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/promote", method = RequestMethod.POST)
	public String promote(HttpSession session, RedirectAttributes rd, @RequestParam("image") MultipartFile file,
			@RequestParam("interviewee") int interviewee) {

		Expert expert = new Expert();
		ExpertImage ei = new ExpertImage();
		String fileName = null;
		String webappRoot = servletContext.getRealPath("/");
		String relativeFolder = File.separator + "resources" + File.separator + "gallery" + File.separator;
		Login l = (Login) session.getAttribute("admin");

		try {

			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				System.out.println("interview id is " + interviewee);
				fileName = webappRoot + relativeFolder + file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
				buffStream.write(bytes);
				expert.setInterview(interviewService.get(interviewee));
				expert.setAvailabilityStatus(availabilityStatusService.getWithSid("Available"));

				final DateTimeZone fromTimeZone = DateTimeZone.forID("Africa/Lagos");

				LocalDate ld = new LocalDate(LocalDate.now(), fromTimeZone);
				expert.setDate(ld);
				expert.setImage(file.getOriginalFilename());
				ei.setImageName(file.getOriginalFilename());
				ei.setExpert(expert);

				System.out.println("original file name is " + file.getOriginalFilename());

				buffStream.close();

				expertService.create(expert);
				rd.addFlashAttribute("msg", "successfully made an expert");
				return "redirect:/enrol/manage/interviewees";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		} catch (DataIntegrityViolationException e) {
			rd.addFlashAttribute("errMsg", "This artisan is already an expert");
			return "redirect:/enrol/manage/interviewees";

		}

		catch (Exception e) {
			rd.addFlashAttribute("errMsg", "something went wrong");
			e.printStackTrace();
			return "redirect:/enrol/manage/interviewees";

		}
	}

	@RequestMapping(value = "/expert/{interviewId}")
	public String promote(@PathVariable("interviewId") int interviewId, @RequestParam("file") MultipartFile file,
			RedirectAttributes rd) {

		String fileName = null;
		String webappRoot = servletContext.getRealPath("/");
		String relativeFolder = File.separator + "resources" + File.separator + "gallery" + File.separator;

		if (!file.isEmpty()) {
			try {
				fileName = webappRoot + relativeFolder + file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
				buffStream.write(bytes);

				buffStream.close();
				Interview i = interviewService.get(interviewId);
				Expert e = new Expert();

				e.setInterview(i);
				e.setImage(file.getOriginalFilename());
				expertService.create(e);
				rd.addFlashAttribute("upload", "successfully uploaded");
				return "redirect:/enrol/manage/interviewees";
			} catch (Exception e) {
				rd.addFlashAttribute("upload", "upload unsuccessful");

				return "redirect:/enrol/manage/interviewees";
				// e.getMessage();
			}
		} else {
			return "redirect:/enrol/manage/interviewees";
		}

	}

	@RequestMapping(value = "/view/{enrolmentId}", method = RequestMethod.GET)
	public String viewDetails(@PathVariable("enrolmentId") int enrolmentId, Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("artisan", enrolmentService.get(enrolmentId));
				return "artisanProfile";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@ModelAttribute("enrollee")
	public Enrolment enrolCommandObject() {
		return new Enrolment();
	}

	@ModelAttribute("maritalStatusList")
	public List<MaritalStatus> listOfMaritalStatus() {
		return maritalStatusService.getList();
	}

	@ModelAttribute("stateList")
	public List<State> listOfStates() {
		return stateService.getList();
	}

	@ModelAttribute("lgaList")
	public List<Lga> listOfLgas() {
		return lgaService.getList();
	}

	@ModelAttribute("genderList")
	public List<Gender> listOfGender() {
		return genderService.getList();
	}

	@ModelAttribute("enrolledList")
	public List<Enrolment> getEnrolledList() {
		return enrolmentService.getPendingList();
	}

	@ModelAttribute("interviewList")
	public List<Interview> getInterviewList() {
		return interviewService.getList();
	}

	@ModelAttribute("subSkillList")
	public List<SubSkill> subSkillList() {
		return subSkillService.getList();
	}

	@ModelAttribute("expertList")
	public List<Expert> expertList() {
		return expertService.getList();
	}

}
