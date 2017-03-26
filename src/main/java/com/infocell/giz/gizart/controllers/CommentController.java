package com.infocell.giz.gizart.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infocell.giz.gizart.model.Comment;
import com.infocell.giz.gizart.service.CommentService;

@Controller
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;

	@RequestMapping(value = { "/", "/add" }, method = RequestMethod.GET)
	public String newComment(Model model, HttpSession session) {
		return "comments";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String newComment(@ModelAttribute("commentCommand") Comment comment) {
		commentService.create(comment);
		return "redirect:/comments/";

	}

	@ModelAttribute("commentList")
	public List<Comment> getComments() {
		return commentService.getList();

	}

	@ModelAttribute("commentCommand")
	public Comment getCommand() {
		return new Comment();
	}

}
