package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Lga;

public interface LgaService {

	void create(Lga s);

	Lga get(int id);

	Lga getWithSid(String sid);

	List<Lga> getList();

	void update(Lga s);

	void delete(String id);

}
