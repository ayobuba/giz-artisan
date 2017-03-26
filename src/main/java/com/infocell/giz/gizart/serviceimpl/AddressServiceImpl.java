package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.AddressDao;
import com.infocell.giz.gizart.model.Address;
import com.infocell.giz.gizart.service.AddressService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Address s) {

		addressDao.create(s);
	}

	@Override
	public Address get(int id) {
		return addressDao.get(id);
	}

	@Override
	public Address getWithSid(String sid) {
		return addressDao.getWithSid(sid);
	}

	@Override
	public List<Address> getList() {
		return addressDao.getList();
	}

	@Override
	public void update(Address s) {
		addressDao.update(s);
	}

	@Override
	public void delete(String id) {
		addressDao.delete(id);
	}

}
