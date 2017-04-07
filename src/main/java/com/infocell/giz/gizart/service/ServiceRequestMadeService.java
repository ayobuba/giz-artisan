package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.ClientIndividual;
import com.infocell.giz.gizart.model.RequestStatus;
import com.infocell.giz.gizart.model.ServiceRequestMade;
import com.infocell.giz.gizart.model.SubSkill;

public interface ServiceRequestMadeService {

	void create(ServiceRequestMade s);

	ServiceRequestMade get(int id);

	ServiceRequestMade getWithSid(String sid);

	List<ServiceRequestMade> getList();

	List<ServiceRequestMade> getPendingList();

	List<ServiceRequestMade> getApprovedList();

	List<ServiceRequestMade> getDisapprovedList();

	List<ServiceRequestMade> getListByClientIndividual(ClientIndividual s);

	List<ServiceRequestMade> getListByServiceAndApproved(SubSkill s, RequestStatus r);

	void update(ServiceRequestMade s);

	void delete(int id);

}
