package com.infocell.giz.gizart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.email.ContactUsNotification;
import com.infocell.giz.gizart.email.MailService;
import com.infocell.giz.gizart.model.ContactUs;
import com.infocell.giz.gizart.service.AddressService;
import com.infocell.giz.gizart.service.AdminService;
import com.infocell.giz.gizart.service.BioDataService;
import com.infocell.giz.gizart.service.ContactUsService;
import com.infocell.giz.gizart.service.EmailService;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.StateService;
import com.infocell.giz.gizart.service.TitleService;

@Controller
public class AppController {

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
	private MailService mailService;

	@Autowired
	private ContactUsService contactUsService;

	private ContactUsNotification contactUsNotification = new ContactUsNotification();

	@RequestMapping(value = { "/", "/home" })
	public String getHomePage() {

		return "index2";

	}

	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String aboutUs() {

		return "about-us";

	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactUsPage(Model model) {

		model.addAttribute("contactUs", new ContactUs());
		return "contact";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String contactUsPage(@ModelAttribute("contactUs") ContactUs contactUs, RedirectAttributes rd) {

		contactUsService.create(contactUs);
		contactUsNotification.sendToAllAdmins(adminService.getList());

		rd.addFlashAttribute("msg", "Thank you. We will get back to you ASAP!");
		return "redirect:/contact";
	}

	@RequestMapping(value = "/accessdenied")
	public String accessDenied() {
		return "500";

	}

	@RequestMapping(value = "/services")
	public String getServices() {
		return "services";
	}

	@RequestMapping("/experts")
	public String ourExperts() {
		return "our-experts";
	}

	@RequestMapping("/gallery")
	public String ourGallery() {
		return "gallery";
	}

}
