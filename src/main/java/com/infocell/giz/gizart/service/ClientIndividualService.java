package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.ClientIndividual;

public interface ClientIndividualService {

	void create(ClientIndividual s);

	ClientIndividual get(int id);

	ClientIndividual getWithSid(String sid);

	List<ClientIndividual> getList();

	void update(ClientIndividual s);

	void delete(int id);

}
