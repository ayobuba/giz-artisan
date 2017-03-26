package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.CommentStatus;

public interface CommentStatusDao {

	void create(CommentStatus s);

	CommentStatus get(int id);

	CommentStatus getWithSid(String sid);

	List<CommentStatus> getList();

	List<CommentStatus> getApprovedList();

	List<CommentStatus> getDisapprovedList();

	void update(CommentStatus s);

	void delete(int id);

}
