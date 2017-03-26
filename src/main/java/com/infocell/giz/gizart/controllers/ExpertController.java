package com.infocell.giz.gizart.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.service.ExpertService;

@Controller
@RequestMapping("/experts")
public class ExpertController {

	@Autowired
	private ExpertService expertService;

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

}
