package com.infocell.giz.gizart.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.infocell.giz.gizart.email.MailService;
import com.infocell.giz.gizart.model.Artisan;
import com.infocell.giz.gizart.model.Gender;
import com.infocell.giz.gizart.model.Lga;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.State;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.model.Title;
import com.infocell.giz.gizart.service.AddressService;
import com.infocell.giz.gizart.service.ArtisanService;
import com.infocell.giz.gizart.service.EmailService;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.StateService;
import com.infocell.giz.gizart.service.SubSkillService;
import com.infocell.giz.gizart.service.TitleService;

@Controller
@RequestMapping("/artisan")
@SessionAttributes("artisanList")
public class ArtisanController {

	@Autowired
	private GenderService genderService;

	@Autowired
	private MailService mailService;

	@Autowired
	private TitleService titleService;

	@Autowired
	private StateService stateService;

	@Autowired
	private LgaService lgaService;

	@Autowired
	private SubSkillService subSkillService;

	@Autowired
	private Sid sid;

	@Autowired
	private EmailService emailService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private ArtisanService artisanService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String create(Model model) {

		return "createArtisan";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String create(@ModelAttribute Artisan artisan) {

		artisanService.create(artisan);

		return "createArtisan";

	}

	@RequestMapping(value = "/delete/{sid}")
	public String delete(@PathVariable("sid") String sid, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				artisanService.delete(sid);
				return "redirect:/artisan/manage";
			} else {
				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody String handleUpload(@RequestParam("file") MultipartFile file, Model model) {
		if (!file.isEmpty()) {

			model.addAttribute("fileUpload", file);
			return "the file size is " + file.getSize();

		}
		return "empty file";

	}

	@RequestMapping("/manage")
	public String manage(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				model.addAttribute("artisanList", artisanService.getList());
				return "allArtisans";
			} else {
				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@ModelAttribute("artisanCommand")
	public Artisan artisanModel() {
		return new Artisan();
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

	@ModelAttribute("artisanList")
	public List<Artisan> artisanList() {
		return artisanService.getList();
	}

	@ModelAttribute("subSkillList")
	public List<SubSkill> subSkillList() {
		return subSkillService.getList();
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

	}

}
