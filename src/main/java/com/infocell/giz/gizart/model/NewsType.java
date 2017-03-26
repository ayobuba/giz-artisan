package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "news_type")
public class NewsType {

	@Id
	@GeneratedValue
	@Column(name = "news_type_id")
	private int newsTypeId;

	@Column(name = "news_type")
	private String newsType;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "newsType")
	private List<NewsUpdate> newsUpdateList = new ArrayList<>();

	public int getNewsTypeId() {
		return newsTypeId;
	}

	public void setNewsTypeId(int newsTypeId) {
		this.newsTypeId = newsTypeId;
	}

	public String getNewsType() {
		return newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	public List<NewsUpdate> getNewsUpdateList() {
		return newsUpdateList;
	}

	public void setNewsUpdateList(List<NewsUpdate> newsUpdateList) {
		this.newsUpdateList = newsUpdateList;
	}

}
