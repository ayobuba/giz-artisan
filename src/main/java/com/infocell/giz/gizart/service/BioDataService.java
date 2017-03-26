package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.exceptions.NotFound;
import com.infocell.giz.gizart.model.BioData;

public interface BioDataService {

	void create(BioData s);

	BioData get(int id);

	BioData getWithSid(String username, String password) throws NotFound;

	List<BioData> getList();

	void update(BioData s);

	void delete(int id);

}
