package com.infocell.giz.gizart.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.service.ExpertRequestedService;
import com.infocell.giz.gizart.service.ExpertService;
import com.infocell.giz.gizart.service.ServiceRequestMadeService;

@Controller
@RequestMapping("/experts")
public class ExpertController {

	@Autowired
	private ExpertService expertService;

	@Autowired
	private ExpertRequestedService expertRequestedService;

	@Autowired
	private ServiceRequestMadeService serviceRequestMadeService;

	@RequestMapping(value = "/manage", method = RequestMethod.GET)
	public String addExpert(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("expertList", expertService.getList());
				return "ManageExperts";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/view/{expertId}", method = RequestMethod.GET)
	public String viewExpert(Model model, HttpSession session, @PathVariable("expertId") int expertId) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("expert", expertService.get(expertId));
				return "expert-profile";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/view-assigned/{requestId}")
	public String viewExpertAssigned(Model model, HttpSession session, @PathVariable("requestId") int requestId) {

		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("expertList",
						expertRequestedService.getListBySrm(serviceRequestMadeService.get(requestId)));
				return "ExpertsAssigned";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

}
