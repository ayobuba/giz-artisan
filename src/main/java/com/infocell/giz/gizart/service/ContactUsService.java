package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.ContactUs;

public interface ContactUsService {

	void create(ContactUs s);

	ContactUs get(int id);

	ContactUs getWithSid(String sid);

	List<ContactUs> getList();

	void update(ContactUs s);

	void delete(int id);

}
