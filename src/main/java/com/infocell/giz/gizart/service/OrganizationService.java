package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Organization;

public interface OrganizationService {

	void create(Organization s);

	Organization get(int id);

	Organization getWithSid(String sid);

	List<Organization> getList();

	void update(Organization s);

	void delete(int id);

}
