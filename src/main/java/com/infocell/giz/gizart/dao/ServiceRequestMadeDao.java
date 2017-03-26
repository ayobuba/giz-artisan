package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.ServiceRequestMade;

public interface ServiceRequestMadeDao {

	void create(ServiceRequestMade s);

	ServiceRequestMade get(int id);

	ServiceRequestMade getWithSid(String sid);

	List<ServiceRequestMade> getList();

	List<ServiceRequestMade> getPendingList();

	List<ServiceRequestMade> getApprovedList();

	List<ServiceRequestMade> getDisapprovedList();

	void update(ServiceRequestMade s);

	void delete(int id);

}
