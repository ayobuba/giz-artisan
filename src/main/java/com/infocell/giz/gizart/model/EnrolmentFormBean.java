package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EnrolmentFormBean {

	private List<BioData> compositeListOfBioData = new ArrayList<>();

	public List<BioData> getCompositeListOfBioData() {
		return compositeListOfBioData;
	}

	public void setCompositeListOfBioData(List<BioData> compositeListOfBioData) {
		this.compositeListOfBioData = compositeListOfBioData;
	}

}
