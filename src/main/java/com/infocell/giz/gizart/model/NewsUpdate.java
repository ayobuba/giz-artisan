package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "news_update")
public class NewsUpdate {

	@Id
	@GeneratedValue
	@Column(name = "news_update_id")
	private int newsUpdateId;

	@Column(name = "news_description")
	private String newsDescription;

	@Column(name = "news_title")
	private String newsTitle;

	@ManyToOne
	@JoinColumn(name = "news_type_id")
	private NewsType newsType;

	public int getNewsUpdateId() {
		return newsUpdateId;
	}

	public void setNewsUpdateId(int newsUpdateId) {
		this.newsUpdateId = newsUpdateId;
	}

	public String getNewsDescription() {
		return newsDescription;
	}

	public void setNewsDescription(String newsDescription) {
		this.newsDescription = newsDescription;
	}

	public NewsType getNewsType() {
		return newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

}
