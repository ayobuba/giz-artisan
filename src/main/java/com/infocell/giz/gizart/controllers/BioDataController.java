package com.infocell.giz.gizart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infocell.giz.gizart.model.BioData;
import com.infocell.giz.gizart.model.Gender;
import com.infocell.giz.gizart.model.Lga;
import com.infocell.giz.gizart.model.State;
import com.infocell.giz.gizart.model.Title;
import com.infocell.giz.gizart.service.AddressService;
import com.infocell.giz.gizart.service.AdminService;
import com.infocell.giz.gizart.service.BioDataService;
import com.infocell.giz.gizart.service.EmailService;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.StateService;
import com.infocell.giz.gizart.service.TitleService;

@Controller
@RequestMapping("/biodata")
public class BioDataController {

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

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String createAdmin(Model model) {
		return "createAdmin";
	}

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public String createClient(@RequestParam("firstname") String firstName) {
		return null;

	}

	@RequestMapping(value = "/enrol")
	public String createEnrol() {
		return null;
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

	@ModelAttribute("bioDataCommand")
	public BioData getBioDataCommand() {
		return new BioData();
	}

}
