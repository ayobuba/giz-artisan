package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gallery_news")
public class GalleryNews {

	@Id
	@GeneratedValue
	@Column(name = "gallery_id")
	private int galleryId;

	@Column(name = "image")
	private String image;

	@ManyToOne
	@JoinColumn(name = "album_id")
	private NewsAlbum newsAlbum;

	public int getGalleryId() {
		return galleryId;
	}

	public void setGalleryId(int galleryId) {
		this.galleryId = galleryId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public NewsAlbum getNewsAlbum() {
		return newsAlbum;
	}

	public void setNewsAlbum(NewsAlbum newsAlbum) {
		this.newsAlbum = newsAlbum;
	}

}
