package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Comment;

public interface CommentService {

	void create(Comment s);

	Comment get(int id);

	Comment getWithSid(String sid);

	List<Comment> getList();

	List<Comment> getApprovedList();

	List<Comment> getDisapprovedList();

	void update(Comment s);

	void delete(int id);

}
