package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Training;

public interface TrainingService {

	void create(Training s);

	Training get(int id);

	Training getWithSid(String sid);

	List<Training> getList();

	void update(Training s);

	void delete(String id);

}
