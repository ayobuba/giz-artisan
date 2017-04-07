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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.Expert;
import com.infocell.giz.gizart.model.ExpertRequested;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.ServiceRequestMade;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.AvailabilityStatusService;
import com.infocell.giz.gizart.service.ExpertRequestedService;
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

	@Autowired
	private ExpertRequestedService expertRequestedService;

	@Autowired
	private AvailabilityStatusService availabilityStatusService;

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
	public String doApproval(Model model, HttpSession session, @PathVariable("sid") int sid, RedirectAttributes rd) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				ServiceRequestMade srm = service.get(sid);
				srm.setRequestStatus(requestStatusService.getWithSid("Approved"));
				service.update(srm);

				System.out.println("srm request status is " + srm.getRequestStatus().getName());
				rd.addFlashAttribute("msg", "Successfully Approved. Go to the Approved List to Check");
				return "redirect:/service/pending-request";

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/disapproval/{sid}")
	public String disApproval(Model model, HttpSession session, @PathVariable("sid") int sid, RedirectAttributes rd) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				ServiceRequestMade srm = service.get(sid);
				List<ExpertRequested> eRequested = expertRequestedService.getListBySrm(srm);

				if (eRequested.size() > 0) {
					rd.addFlashAttribute("msg",
							"Sorry Boss, This request has already been assigned Expert. You cannot disapprove");
					return "redirect:/service/approved-request";
				} else {
					srm.setRequestStatus(requestStatusService.getWithSid("Pending"));
					service.update(srm);

					System.out.println("srm request status is " + srm.getRequestStatus().getName());
					rd.addFlashAttribute("msg",
							"Successfully Disapproved. You can see that request in the Pending request List");
					return "redirect:/service/approved-request";
				}

			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/assign-expert/{expertId}", method = RequestMethod.GET)
	public String assignExpertToRequest(Model model, @PathVariable("expertId") int expertId, HttpSession session,
			RedirectAttributes rd) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				System.out.println("positive");
				if (expertService.get(expertId).getAvailabilityStatus().getAvailability().equals("Available")) {
					Expert e = expertService.get(expertId);

					model.addAttribute("requestList",
							service.getListByServiceAndApproved(
									e.getInterview().getEnrolment().getArtisan().getSubSkill(),
									requestStatusService.getWithSid("Approved")));
					model.addAttribute("expertAssigned", e);

					System.out.println("inside");
					return "assign-request";
				}

				else {
					rd.addFlashAttribute("msg", "This Expert is not available");
					return "redirect:/experts/manage";
				}

			} else {
				rd.addFlashAttribute("msg", "Please log in");
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			rd.addFlashAttribute("errMsg", "something went wrong");
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/assign-request/{requestMadeId}", method = RequestMethod.GET)
	public String assignExpertFromRequest(Model model, @PathVariable("requestMadeId") int requestMadeId,
			HttpSession session, RedirectAttributes rd) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				System.out.println("positive");
				System.out.println("the service id is " + requestMadeId);
				ServiceRequestMade srm = service.get(requestMadeId);
				System.out.println("experts required " + srm.getNumOfExpertRequest());
				System.out.println("expert requested is  " + srm.getNumOfExpertRequest());
				List<ExpertRequested> er = expertRequestedService.getListBySrm(srm);
				System.out.println("the size of expert already assigned for this request is " + er.size());

				if (srm.getNumOfExpertRequest() > er.size()) {

					model.addAttribute("expertList", expertService.getWithSkillAndAvailable(srm.getSubSkill(),
							availabilityStatusService.getWithSid("Available")));
					model.addAttribute("request", srm);

					System.out.println("inside");
					return "assign-experts";
				}

				else {
					rd.addFlashAttribute("msg", "The required number of experts has been assigned to that request");
					return "redirect:/service/allrequest";
				}

			} else {
				rd.addFlashAttribute("msg", "Please log in");
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			rd.addFlashAttribute("errMsg", "something went wrong");
			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/a")
	public String doAssign(Model model) {

		return "assign-experts";
	}

	@RequestMapping(value = "/assign/{expert}", method = RequestMethod.GET)
	public String assignExpertToRequest(Model model, HttpSession session, RedirectAttributes rd,
			@RequestParam("request") int request, @PathVariable("expert") int expert) {
		Login l = (Login) session.getAttribute("admin");

		int count = 0;
		try {

			System.out.println("inside try");
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				System.out.println("inside first if");
				ExpertRequested er = new ExpertRequested();
				ServiceRequestMade srm = service.get(request);
				Expert e = expertService.get(expert);
				er.setExpert(e);
				er.setSrm(srm);

				List<ExpertRequested> expertRequested = expertRequestedService.getListBySrm(srm);
				System.out.println("the size of experts requested is " + expertRequested.size());

				System.out.println("inside second if");

				count = expertRequested.size();
				if (count < er.getSrm().getNumOfExpertRequest() && (er.getSrm().getEndDate().isAfter(LocalDate.now())
						|| er.getSrm().getEndDate().isEqual(LocalDate.now()))) {

					System.out.println("inside third if");

					expertRequestedService.create(er);
					count++;
					int remaining = er.getSrm().getNumOfExpertRequest() - count;
					rd.addFlashAttribute("msg", "successfully assigned,");
					rd.addFlashAttribute("remaining", remaining);
					rd.addFlashAttribute("msg1", "left to be assigned to that request");

					e.setAvailabilityStatus(availabilityStatusService.getWithSid("Not Available"));
					expertService.update(e);
					if (remaining == 0) {
						return "redirect:/experts/manage";
					}
					return "redirect:/service/assign/" + expert;
				} else {
					rd.addFlashAttribute("errMsg",
							"Either you cannot assign any more expert to this request Or the due date is past");
					return "redirect:/service/assign-expert/" + expert;

				}

			} else {
				return "redirect:/admin/login";

			}

		} catch (NullPointerException e) {
			e.printStackTrace();
			return "redirect:/admin/login";

		}

	}

	/*
	 * @RequestMapping(value = "/assign/{requestMadeId}", method =
	 * RequestMethod.GET) public String assignExpertFromRequest(Model model,
	 * HttpSession session, RedirectAttributes rd,
	 * 
	 * @RequestParam("expert") int expert, @PathVariable("requestMadeId") int
	 * requestMadeId) { Login l = (Login) session.getAttribute("admin"); int
	 * count = 0; try {
	 * 
	 * System.out.println("inside try"); if (l != null &&
	 * l.getRole().getRoleName().equalsIgnoreCase("admin")) {
	 * 
	 * System.out.println("inside first if"); ExpertRequested er = new
	 * ExpertRequested(); ServiceRequestMade srm = service.get(requestMadeId);
	 * Expert e = expertService.get(expert); er.setExpert(e); er.setSrm(srm);
	 * 
	 * List<ExpertRequested> expertRequested =
	 * expertRequestedService.getListBySrm(srm);
	 * System.out.println("the size of experts requested is " +
	 * expertRequested.size());
	 * 
	 * System.out.println("inside second if");
	 * 
	 * count = expertRequested.size(); if (count <
	 * er.getSrm().getNumOfExpertRequest() &&
	 * (er.getSrm().getEndDate().isAfter(LocalDate.now()) ||
	 * er.getSrm().getEndDate().isEqual(LocalDate.now()))) {
	 * 
	 * System.out.println("inside third if");
	 * 
	 * expertRequestedService.create(er); count++; int remaining =
	 * er.getSrm().getNumOfExpertRequest() - count; rd.addFlashAttribute("msg",
	 * "successfully assigned,"); rd.addFlashAttribute("remaining", remaining);
	 * rd.addFlashAttribute("msg1", "left to be assigned to that request");
	 * 
	 * e.setAvailabilityStatus(availabilityStatusService.
	 * getWithSid("Not Available")); expertService.update(e); return
	 * "redirect:/experts/manage"; } else { rd.addFlashAttribute("errMsg",
	 * "Either you cannot assign any more expert to this request Or the due date is past"
	 * ); return "redirect:/service/assign-expert/" + expert;
	 * 
	 * }
	 * 
	 * } else { return "redirect:/admin/login";
	 * 
	 * }
	 * 
	 * } catch (NullPointerException e) { e.printStackTrace(); return
	 * "redirect:/admin/login";
	 * 
	 * }
	 * 
	 * }
	 */

	@ModelAttribute("subSkillList")
	public List<SubSkill> getSubSkillList() {
		return subSkillService.getList();

	}

	@ModelAttribute("request")
	public ServiceRequestMade getServiceRequest() {
		return new ServiceRequestMade();
	}

}
