package com.infocell.giz.gizart.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.ServiceRequestMade;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.ExpertService;
import com.infocell.giz.gizart.service.LoginService;
import com.infocell.giz.gizart.service.RequestStatusService;
import com.infocell.giz.gizart.service.ServiceRequestMadeService;
import com.infocell.giz.gizart.service.SubSkillService;

@Controller
@RequestMapping("/service")
public class ServiceRequestController {

	@Autowired
	private ServiceRequestMadeService service;

	@Autowired
	private SubSkillService subSkillService;

	@Autowired
	private LoginService loginService;

	@Autowired
	private RequestStatusService requestStatusService;

	@Autowired
	private ExpertService expertService;

	@RequestMapping(value = "/request", method = RequestMethod.GET)
	public String doRequest(Model model, HttpSession session) {

		Login l = (Login) session.getAttribute("client");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("client")) {

				return "hire-artisan";

			} else {

				return "redirect:/client/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/client/login";

		}

	}

	@RequestMapping(value = "/request", method = RequestMethod.POST)
	public String doRequest(@ModelAttribute("requestForm") ServiceRequestMade s, RedirectAttributes rd,
			HttpSession session) {
		s.setDateOfRequest(LocalDate.now());
		Login l = (Login) session.getAttribute("client");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("client")) {
				System.out.println("start date is " + s.getStartDate());
				System.out.println("end date is " + s.getEndDate());
				System.out.println("is start date before end date " + s.getStartDate().isBefore(s.getEndDate()));
				System.out.println("is start date before today " + s.getStartDate().isBefore(s.getDateOfRequest()));
				System.out.println("today date is " + LocalDate.now());
				System.out.println("is state date equal today " + s.getStartDate().isEqual(LocalDate.now()));

				if ((s.getStartDate().isBefore(LocalDate.now()) && !s.getStartDate().isEqual(LocalDate.now()))
						|| s.getStartDate().isAfter(s.getEndDate())) {
					rd.addFlashAttribute("errorMsg", "please check the dates");
					return "redirect:/service/request";

				} else {

					s.setRequestStatus(requestStatusService.getWithSid("Pending"));
					s.setClient(l.getClient());

					service.create(s);
					rd.addFlashAttribute("msg", "Thank you for your patronage. You can make more request");

					return "redirect:/service/request";
				}

			} else {

				return "redirect:/client/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/client/login";

		}

	}

	@RequestMapping(value = "/allrequest")
	public String getAllServiceRequest(Model model, HttpSession session) {

		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("allRequestList", service.getList());
				return "allRequest";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/pending-request")
	public String getPendingRequest(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("pendingRequestList", service.getPendingList());
				return "pendingRequest";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/disapproved-request")
	public String getDisapprovedRequest(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("pendingRequestList", service.getPendingList());
				return "disapprovedRequest";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping("/approved-request")
	public String getApprovedRequest(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("approvedRequestList", service.getApprovedList());
				return "approvedRequest";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/approval/{sid}")
	public String doApproval(Model model, HttpSession session, @PathVariable("sid") int sid) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("expertList", expertService.getWithSkill(service.get(sid).getSubSkill()));
				return "approvedRequest";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";

		}

	}

	@ModelAttribute("subSkillList")
	public List<SubSkill> getSubSkillList() {
		return subSkillService.getList();

	}

	@ModelAttribute("request")
	public ServiceRequestMade getServiceRequest() {
		return new ServiceRequestMade();
	}

}
