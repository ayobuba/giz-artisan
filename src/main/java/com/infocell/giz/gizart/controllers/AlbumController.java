package com.infocell.giz.gizart.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.NewsAlbum;
import com.infocell.giz.gizart.model.PictureAlbum;
import com.infocell.giz.gizart.service.AlbumService;
import com.infocell.giz.gizart.service.NewsAlbumService;
import com.infocell.giz.gizart.service.PictureAlbumService;

@Controller
@RequestMapping("/album")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@Autowired
	private NewsAlbumService newsAlbumService;

	@Autowired
	private PictureAlbumService pictureAlbumService;

	@RequestMapping(value = "/manage/news")
	public String manageNewsAlbum(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("albumList", newsAlbumService.getList());
				return "ManageNewsAlbum";
			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/not-found";
		}

	}

	@RequestMapping("/not-found")
	@ResponseBody
	public String notFound() {
		return "not found";
	}

	@RequestMapping(value = "/manage/gallery")
	public String manageGalleryAlbum(Model model, HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("pictureAlbum", new PictureAlbum());
				model.addAttribute("albumList", pictureAlbumService.getList());
				return "ManageGalleryAlbum";
			} else {
				return "redirect:/admin/login";

			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";
		}

	}

	@RequestMapping(value = "/create/news", method = RequestMethod.POST)
	public String createAlbum(@ModelAttribute("albumCommand") NewsAlbum album, RedirectAttributes redirectAttribute,
			HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				newsAlbumService.create(album);

				redirectAttribute.addFlashAttribute("album", album);
				redirectAttribute.addFlashAttribute("message", "Created successfully");

				return "redirect:/album/manage/news";
			} else {
				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";
		}

	}

	@RequestMapping(value = "/create/gallery", method = RequestMethod.POST)
	public String createAlbum(@ModelAttribute("pictureAlbum") PictureAlbum album, RedirectAttributes redirectAttribute,
			HttpSession session) {
		Login l = (Login) session.getAttribute("admin");
		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {
				pictureAlbumService.create(album);

				redirectAttribute.addFlashAttribute("album", album);
				redirectAttribute.addFlashAttribute("message", "Created successfully");

				return "redirect:/album/manage/gallery";
			} else {
				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {
			return "redirect:/admin/login";
		}

	}

	@ModelAttribute("albumCommand")
	public NewsAlbum getAlbumCommand() {
		return new NewsAlbum();
	}

}
