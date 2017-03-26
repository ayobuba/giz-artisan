package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Rating;

public interface RatingService {

	void create(Rating s);

	Rating get(int id);

	Rating getWithSid(String sid);

	List<Rating> getList();

	void update(Rating s);

	void delete(String id);

}
