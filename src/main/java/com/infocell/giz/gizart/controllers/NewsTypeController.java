package com.infocell.giz.gizart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.NewsType;
import com.infocell.giz.gizart.service.NewsTypeService;

@Controller
@RequestMapping("/newsType")
public class NewsTypeController {

	@Autowired
	private NewsTypeService newsTypeService;

	@RequestMapping(value = "/manage", method = RequestMethod.GET)
	public String ManageNewsTypePage(Model model) {

		return "ManageNewsType";
	}

	@RequestMapping(value = "/manage", method = RequestMethod.POST)
	public String ManageNewsTypePage(@ModelAttribute("newsTypeCommand") NewsType newsType, RedirectAttributes rd) {

		newsTypeService.create(newsType);
		rd.addFlashAttribute("msg", "Successfully Added");
		return "redirect:/newsType/manage";

	}

	@RequestMapping(value = "/delete/{newsTypeId}")
	public String remove(@PathVariable("newsTypeId") int newsTypeId, RedirectAttributes rd) {

		rd.addFlashAttribute("msg", "Deleted Successfully");

		newsTypeService.delete(newsTypeId);
		return "redirect:/newsType/manage";

	}

	@ModelAttribute("newsTypeCommand")
	public NewsType newsTypeCommand() {
		return new NewsType();

	}

	@ModelAttribute("newsTypeList")
	public List<NewsType> newsTypeList() {
		return newsTypeService.getList();

	}

}
