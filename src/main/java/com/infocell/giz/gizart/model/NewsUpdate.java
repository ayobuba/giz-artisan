package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

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

	@OneToOne
	@JoinColumn(name = "album_id")
	private NewsAlbum newsAlbum;

	@DateTimeFormat(pattern = "yyyy-mmm-dd")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name = "posted_date")
	private LocalDate postedDate;

	public int getNewsUpdateId() {
		return newsUpdateId;
	}

	public void setNewsUpdateId(int newsUpdateId) {
		this.newsUpdateId = newsUpdateId;
	}

	public LocalDate getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
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

	public NewsAlbum getNewsAlbum() {
		return newsAlbum;
	}

	public void setNewsAlbum(NewsAlbum newsAlbum) {
		this.newsAlbum = newsAlbum;
	}

}
