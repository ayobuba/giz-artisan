package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {

	@Id
	@GeneratedValue
	@Column(name = "language_id")
	private int languageId;

	@Column(name = "language")
	private String language;

	@ManyToMany(mappedBy = "artisanLanguageList", cascade = CascadeType.ALL)
	private List<Artisan> languageArtisanList = new ArrayList<>();

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Artisan> getLanguageArtisanList() {
		return languageArtisanList;
	}

	public void setLanguageArtisanList(List<Artisan> languageArtisanList) {
		this.languageArtisanList = languageArtisanList;
	}

}
