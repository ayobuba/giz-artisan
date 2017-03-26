package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Organization;

public interface OrganizationDao {

	void create(Organization s);

	Organization get(int id);

	Organization getWithSid(String sid);

	List<Organization> getList();

	void update(Organization s);

	void delete(int id);

}
