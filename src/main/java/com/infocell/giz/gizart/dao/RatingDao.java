package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Rating;

public interface RatingDao {

	void create(Rating s);

	Rating get(int id);

	Rating getWithSid(String sid);

	List<Rating> getList();

	void update(Rating s);

	void delete(String id);

}
