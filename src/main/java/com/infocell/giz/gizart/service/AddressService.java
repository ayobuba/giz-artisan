package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Address;

public interface AddressService {

	void create(Address s);

	Address get(int id);

	Address getWithSid(String sid);

	List<Address> getList();

	void update(Address s);

	void delete(String id);

}
