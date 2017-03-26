package com.infocell.giz.gizart.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.email.AdminEnrolmentNotification;
import com.infocell.giz.gizart.email.NewEnrolmentMail;
import com.infocell.giz.gizart.model.Client;
import com.infocell.giz.gizart.model.ClientIndividual;
import com.infocell.giz.gizart.model.ClientType;
import com.infocell.giz.gizart.model.Gender;
import com.infocell.giz.gizart.model.Lga;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.Organization;
import com.infocell.giz.gizart.model.Role;
import com.infocell.giz.gizart.model.State;
import com.infocell.giz.gizart.service.AdminService;
import com.infocell.giz.gizart.service.ClientIndividualService;
import com.infocell.giz.gizart.service.ClientService;
import com.infocell.giz.gizart.service.ClientTypeService;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.LoginService;
import com.infocell.giz.gizart.service.MaritalStatusService;
import com.infocell.giz.gizart.service.OrganizationService;
import com.infocell.giz.gizart.service.RoleService;
import com.infocell.giz.gizart.service.StateService;

@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientIndividualService clientIndividualService;

	@Autowired
	private MaritalStatusService maritalStatusService;

	@Autowired
	private ClientTypeService clientTypeService;

	@Autowired
	private StateService stateService;

	@Autowired
	private LgaService lgaService;

	@Autowired
	private GenderService genderService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private OrganizationService organizationService;

	@Autowired
	private ClientService clientService;

	@Autowired
	private LoginService loginService;

	@Autowired
	private RoleService roleService;

	private NewEnrolmentMail newEnrolmentMail = new NewEnrolmentMail();
	private AdminEnrolmentNotification adminEnrolmentNotification = new AdminEnrolmentNotification();

	@RequestMapping("/search")
	public void getClientForm() {

	}

	@RequestMapping(value = "/register/individual", method = RequestMethod.GET)
	public String registerIndividual(Model model) {

		return "RegisterClientIndividual";

	}

	@RequestMapping(value = "/register/individual", method = RequestMethod.POST)
	public String registerIndividual(@ModelAttribute ClientIndividual clientIndividual, RedirectAttributes rd) {
		ClientType c = clientTypeService.getWithSid("individual");
		Role r = roleService.getWithSid("client");
		clientIndividual.getClient().setClientType(c);
		clientIndividual.getClient().getLogin().setRole(r);
		clientIndividualService.create(clientIndividual);
		rd.addFlashAttribute("msg", "successfully added");

		return "redirect:/client/register/individual";

	}

	@RequestMapping(value = "/register/organization", method = RequestMethod.GET)
	public String registerOrganization(Model model) {
		return "RegisterClientOrganization";

	}

	@RequestMapping(value = "/register/organization", method = RequestMethod.POST)
	public String registerOrganization(@ModelAttribute("orgCommand") Organization organization, RedirectAttributes rd) {
		ClientType c = clientTypeService.getWithSid("organization");
		Role r = roleService.getWithSid("client");
		organization.getClient().setClientType(c);
		organization.getClient().getLogin().setRole(r);
		organizationService.create(organization);
		rd.addFlashAttribute("msg", "successfully registered");

		return "redirect:/client/register/organization";

	}

	@RequestMapping(value = "/manage/individuals", method = RequestMethod.GET)
	public String manageIndividuals(Model model) {
		return "allIndividuals";

	}

	@RequestMapping(value = "/manage/organizations", method = RequestMethod.GET)
	public String manageOrganizations(Model model) {
		return "allOrganizations";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "login";

	}

	@RequestMapping(value = "/organization/login", method = RequestMethod.POST)
	public String organizationLogin(@ModelAttribute("organizationCommand") Organization organization,
			RedirectAttributes rd, HttpSession session, Model model) {
		Login l = loginService.getWithSid(organization.getClient().getLogin().getUsername(),
				organization.getClient().getLogin().getPassword());

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("client")
					&& l.getClient().getClientType().getClientTypeName().equalsIgnoreCase("organization")) {
				session.setAttribute("client", l);
				model.addAttribute("result", true);
				model.addAttribute("cl", l);
				return "redirect:/service/request";

			} else {
				rd.addFlashAttribute("msg", "wrong username or password");
				return "redirect:/client/login";
			}
		} catch (NullPointerException e) {
			rd.addFlashAttribute("msg", "Clients only!");
			return "redirect:/client/login";

		}

	}

	@RequestMapping(value = "/individual/login", method = RequestMethod.POST)
	public String individualLogin(@ModelAttribute("individualCommand") ClientIndividual clientIndividual,
			RedirectAttributes rd, Model model, HttpSession session) {
		Login l = loginService.getWithSid(clientIndividual.getClient().getLogin().getUsername(),
				clientIndividual.getClient().getLogin().getPassword());

		if (l != null && l.getRole().getRoleName().equalsIgnoreCase("client")
				&& l.getClient().getClientType().getClientTypeName().equalsIgnoreCase("individual")) {
			model.addAttribute("result", true);
			model.addAttribute("client", l);
			session.setAttribute("client", l);

			return "redirect:/service/request";

		} else {
			rd.addFlashAttribute("msg", "wrong username or password");
			return "redirect:/client/login";
		}
	}

	@RequestMapping(value = "/logout")
	public String logOut(HttpSession session) {
		if (session.getAttribute("client") != null) {
			session.removeAttribute("client");
		}
		return "redirect:/";

	}

	@ModelAttribute("individualCommand")
	public ClientIndividual getCommand() {
		return new ClientIndividual();

	}

	@ModelAttribute("organizationCommand")
	public Organization getClientLoginCommand() {
		return new Organization();

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

	@ModelAttribute("orgCommand")
	public Organization getOrganizationCommand() {
		return new Organization();

	}

	@ModelAttribute("clientList")
	public List<Client> getClientCommand() {
		return clientService.getList();

	}

	@ModelAttribute("clientIndividualList")
	public List<ClientIndividual> getClientIndividual() {
		return clientIndividualService.getList();

	}

}
