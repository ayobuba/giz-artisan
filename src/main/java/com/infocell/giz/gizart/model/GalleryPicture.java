package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gallery_pictures")
public class GalleryPicture {

	@Id
	@GeneratedValue
	@Column(name = "gallery_id")
	private int galleryId;

	@Column(name = "image")
	private String image;

	@ManyToOne
	@JoinColumn(name = "album_id")
	private PictureAlbum pictureAlbum;

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

	public PictureAlbum getPictureAlbum() {
		return pictureAlbum;
	}

	public void setPictureAlbum(PictureAlbum pictureAlbum) {
		this.pictureAlbum = pictureAlbum;
	}

}
