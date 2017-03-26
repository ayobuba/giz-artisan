package com.infocell.giz.gizart.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.SkillService;
import com.infocell.giz.gizart.service.SubSkillService;

@Controller
@RequestMapping(value = "/subSkill")
public class SubSkillController {

	@Autowired
	private SubSkillService subSkillService;

	private SkillService skillService;

	@RequestMapping(value = "/add/{skillId}")
	public String getSubSkillList(Model model, @PathVariable("skillId") int skillId, RedirectAttributes rd,
			HttpSession session) {

		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				rd.addFlashAttribute("skillId", skillId);
				return "redirect:/subSkill/manage/" + skillId;

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/manage/{skillId}", method = RequestMethod.POST)
	public String create(@ModelAttribute("subSkillCommand") SubSkill subSkill, @PathVariable("skillId") int skillId,
			HttpSession session) {

		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				System.out.println("the returned skillId is " + skillId);
				System.out.println("the subskill name is " + subSkill.getName());
				subSkillService.create(subSkill);

				return "redirect:/subSkill/add/" + skillId;

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/manage/{skillId}", method = RequestMethod.GET)
	public String create(Model model, @PathVariable("skillId") int skillId, RedirectAttributes rd,
			HttpSession session) {

		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				rd.addFlashAttribute("skillSubSkillList", subSkillService.getListFromSkill(skillId));
				return "createSubSkill";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@ModelAttribute("subSkillCommand")
	public SubSkill subSkillList() {
		return new SubSkill();
	}

}
