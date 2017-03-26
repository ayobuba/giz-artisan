package com.infocell.giz.gizart.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infocell.giz.gizart.model.NewsUpdate;

@Controller
@RequestMapping("/newsupdate")
public class NewsUpdateController {

	@RequestMapping(value = "/training", method = RequestMethod.GET)
	public String makeTrainingNews(Model model, HttpSession session) {
		return null;
	}

	@RequestMapping(value = "/upcoming-events", method = RequestMethod.GET)
	public String makeUpComingEventsNews(Model model, HttpSession session) {
		return null;
	}

	@RequestMapping(value = "/ongoing-projects", method = RequestMethod.GET)
	public String makeOngoingProjectsNews(Model model, HttpSession session) {
		return null;
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String makeTrainingNews(@ModelAttribute() NewsUpdate newsUpdate, HttpSession session) {
		return null;
	}

}
