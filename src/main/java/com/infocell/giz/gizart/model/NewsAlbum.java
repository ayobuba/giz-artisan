package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "news_album")
public class NewsAlbum {

	@Id
	@GeneratedValue
	@Column(name = "album_id")
	private int albumId;

	@Column(name = "album_title")
	private String albumTitle;

	@OneToMany(mappedBy = "newsAlbum", cascade = CascadeType.ALL)
	private List<GalleryNews> galleryNewsList = new ArrayList<>();

	@OneToOne(mappedBy = "newsAlbum")
	private NewsUpdate newsUpdate;

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public List<GalleryNews> getGalleryNewsList() {
		return galleryNewsList;
	}

	public void setGalleryNewsList(List<GalleryNews> galleryNewsList) {
		this.galleryNewsList = galleryNewsList;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public NewsUpdate getNewsUpdate() {
		return newsUpdate;
	}

	public void setNewsUpdate(NewsUpdate newsUpdate) {
		this.newsUpdate = newsUpdate;
	}

}
