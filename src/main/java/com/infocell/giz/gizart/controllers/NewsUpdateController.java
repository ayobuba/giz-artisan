package com.infocell.giz.gizart.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infocell.giz.gizart.model.GalleryNews;
import com.infocell.giz.gizart.model.NewsAlbum;
import com.infocell.giz.gizart.model.NewsType;
import com.infocell.giz.gizart.model.NewsUpdate;
import com.infocell.giz.gizart.service.GalleryNewsService;
import com.infocell.giz.gizart.service.NewsAlbumService;
import com.infocell.giz.gizart.service.NewsTypeService;
import com.infocell.giz.gizart.service.NewsUpdateService;

@Controller
@RequestMapping("/newsupdate")
public class NewsUpdateController {

	@Autowired
	private NewsTypeService newsTypeService;

	@Autowired
	private NewsAlbumService newsAlbumService;

	@Autowired
	private NewsUpdateService newsUpdateService;

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private GalleryNewsService galleryNewsService;

	@RequestMapping(value = "/training", method = RequestMethod.GET)
	public String makeTrainingNews(Model model, HttpSession session) {
		return "training";
	}

	@RequestMapping(value = "/upcoming-events", method = RequestMethod.GET)
	public String makeUpComingEventsNews(Model model, HttpSession session) {
		return "event";
	}

	@RequestMapping(value = "/ongoing-projects", method = RequestMethod.GET)
	public String makeOngoingProjectsNews(Model model, HttpSession session) {
		return "projects";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String makeTrainingNews(@RequestParam("file") MultipartFile file,
			@RequestParam("newsTitle") String newsTitle, @RequestParam("content") String content,
			@RequestParam("album") String album, @RequestParam("category") String category, RedirectAttributes rd) {

		String fileName = null;
		String webappRoot = servletContext.getRealPath("/");
		String relativeFolder = File.separator + "resources" + File.separator + "gallery" + File.separator;
		if (!file.isEmpty()) {
			try {
				fileName = webappRoot + relativeFolder + file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
				buffStream.write(bytes);
				NewsType newsType = newsTypeService.getWithSid(category);
				NewsAlbum newsAlbum = newsAlbumService.getWithSid(album);
				GalleryNews galleryNews = new GalleryNews();
				List<GalleryNews> list = new ArrayList<>();

				galleryNews.setImage(file.getOriginalFilename());

				newsAlbum.setGalleryNewsList(list);

				galleryNews.setNewsAlbum(newsAlbum);
				galleryNewsService.create(galleryNews);

				System.out.println("the orignal file name is " + file.getOriginalFilename());

				NewsUpdate newsUpdate = new NewsUpdate();

				newsUpdate.setNewsAlbum(newsAlbum);
				newsUpdate.setNewsType(newsType);
				newsUpdate.setNewsTitle(newsTitle);
				newsUpdate.setNewsDescription(content);
				newsUpdate.setPostedDate(LocalDate.now());

				buffStream.close();
				newsUpdateService.create(newsUpdate);
				rd.addFlashAttribute("msg", "Successfully Added");

				return "redirect:/newsupdate/post";
			} catch (Exception e) {
				e.printStackTrace();
				rd.addFlashAttribute("errMsg", "You failed to upload file");
				return "redirect:/newsupdate/post";
			}
		} else {
			rd.addFlashAttribute("errMsg", "File is empty");
			return "redirect:/newsupdate/post";
		}

	}

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String makeNews(Model model, HttpSession session) {
		model.addAttribute("albumList", newsAlbumService.getList());
		model.addAttribute("newsTypeList", newsTypeService.getList());
		model.addAttribute("newsUpdateCommand", new NewsUpdate());
		return "news";
	}

}
