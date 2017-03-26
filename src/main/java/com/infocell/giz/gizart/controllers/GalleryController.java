package com.infocell.giz.gizart.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.GalleryNews;
import com.infocell.giz.gizart.model.GalleryPicture;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.model.NewsAlbum;
import com.infocell.giz.gizart.model.PictureAlbum;
import com.infocell.giz.gizart.service.AlbumService;
import com.infocell.giz.gizart.service.GalleryNewsService;
import com.infocell.giz.gizart.service.GalleryPictureService;
import com.infocell.giz.gizart.service.GalleryService;
import com.infocell.giz.gizart.service.NewsAlbumService;
import com.infocell.giz.gizart.service.PictureAlbumService;

@Controller
@RequestMapping("/gallery")
public class GalleryController {

	@Autowired
	private GalleryService galleryService;

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private AlbumService albumService;

	@Autowired
	private NewsAlbumService newsAlbumService;

	@Autowired
	private GalleryNewsService galleryNewsService;

	@Autowired
	private PictureAlbumService pictureAlbumService;

	@Autowired
	private GalleryPictureService galleryPictureService;

	@RequestMapping(value = "/add-news-image/{albumId}", method = RequestMethod.GET)
	public String addImage(Model model, @PathVariable("albumId") int albumId, HttpSession session,
			RedirectAttributes rd) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("album", newsAlbumService.get(albumId));
				model.addAttribute("pictureList", galleryNewsService.getListByAlbum(newsAlbumService.get(albumId)));

				return "photo";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping("/add-gallery-image/{albumId}")
	public String addGalleryImage(@PathVariable("albumId") int albumId, HttpSession session,
			@PathVariable("albumId") int album, Model model) {
		Login l = (Login) session.getAttribute("admin");

		try {
			if (l != null && l.getRole().getRoleName().equalsIgnoreCase("admin")) {

				model.addAttribute("album", pictureAlbumService.get(album));
				model.addAttribute("pictureList", galleryPictureService.getListByAlbum(pictureAlbumService.get(album)));

				return "GalleryPicture";
			} else {

				return "redirect:/admin/login";
			}
		} catch (NullPointerException e) {

			return "redirect:/admin/login";

		}

	}

	@RequestMapping(value = "/add-gallery-image/{albumId}", method = RequestMethod.POST)
	public String addGalleryImage(@RequestParam("file") MultipartFile file, @RequestParam("desc") String desc,
			@PathVariable("albumId") int albumId, @ModelAttribute("album") PictureAlbum n) {
		PictureAlbum a = pictureAlbumService.get(albumId);
		GalleryPicture g = new GalleryPicture();
		System.out.println("File Description:" + desc);
		String fileName = null;
		String webappRoot = servletContext.getRealPath("/");
		String relativeFolder = File.separator + "resources" + File.separator + "gallery" + File.separator;
		if (!file.isEmpty()) {
			try {
				fileName = webappRoot + relativeFolder + file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
				buffStream.write(bytes);
				g.setPictureAlbum(n);
				System.out.println("original file name is " + file.getOriginalFilename());
				g.setImage(file.getOriginalFilename());
				galleryPictureService.create(g);

				buffStream.close();
				return "redirect:/gallery/add-gallery-image/" + n.getAlbumId();
			} catch (Exception e) {
				e.printStackTrace();
				return "You failed to upload " + fileName + ": " + e.getMessage();
			}
		} else {
			return "Unable to upload. File is empty.";
		}

	}

	@RequestMapping(value = "/add-news-image/{albumId}", method = RequestMethod.POST)
	public String addImage(@RequestParam("file") MultipartFile file, @RequestParam("desc") String desc,
			@PathVariable("albumId") int albumId, @ModelAttribute("album") NewsAlbum n) {
		NewsAlbum a = newsAlbumService.get(albumId);
		GalleryNews g = new GalleryNews();
		System.out.println("File Description:" + desc);
		String fileName = null;
		String webappRoot = servletContext.getRealPath("/");
		String relativeFolder = File.separator + "resources" + File.separator + "gallery" + File.separator;
		if (!file.isEmpty()) {
			try {
				fileName = webappRoot + relativeFolder + file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
				buffStream.write(bytes);
				g.setNewsAlbum(n);
				System.out.println("original file name is " + file.getOriginalFilename());
				g.setImage(file.getOriginalFilename());
				galleryNewsService.create(g);

				buffStream.close();
				return "redirect:/gallery/add-news-image/" + n.getAlbumId();
			} catch (Exception e) {
				e.printStackTrace();
				return "You failed to upload " + fileName + ": " + e.getMessage();
			}
		} else {
			return "Unable to upload. File is empty.";
		}

	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String updateImage() {
		return null;

	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String updateImage(@ModelAttribute GalleryPicture gallery) {
		return null;

	}

}
