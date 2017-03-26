package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "biodata")
public class BioData {

	@Id
	@GeneratedValue
	@Column(name = "bio_id")
	private int bioId;

	@Column(name = "firstname", nullable = false)
	private String firstName;

	@Column(name = "lastname", nullable = false)
	private String lastName;

	@Column(name = "image")
	private String image;

	@Transient
	private String confirmPassword;

	@OneToOne(mappedBy = "bioData")
	private ClientIndividual clientIndividual;

	@ManyToOne
	@JoinColumn(name = "gender_id")
	private Gender gender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "email_id")
	private Email email;

	@ManyToOne
	@JoinColumn(name = "title_id")
	private Title title;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToOne(mappedBy = "bioData")
	private Admin admin;

	@OneToOne(mappedBy = "artisanBioData")
	private Artisan artisan;

	@OneToOne(mappedBy = "bioData")
	private Guarantor guarantor;

	@OneToOne(mappedBy = "bioData")
	private NextOfKin nextOfKin;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "phone_id")
	private PhoneNumber phoneNumber;

	@OneToMany(mappedBy = "bioData", cascade = CascadeType.ALL)
	private List<Comment> commentList = new ArrayList<>();

	@OneToMany(mappedBy = "bioData", cascade = CascadeType.ALL)
	private List<CommentReply> commentReplyList = new ArrayList<>();

	public int getBioId() {
		return bioId;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public void setBioId(int bioId) {
		this.bioId = bioId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ClientIndividual getClientIndividual() {
		return clientIndividual;
	}

	public void setClientIndividual(ClientIndividual clientIndividual) {
		this.clientIndividual = clientIndividual;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public List<CommentReply> getCommentReplyList() {
		return commentReplyList;
	}

	public void setCommentReplyList(List<CommentReply> commentReplyList) {
		this.commentReplyList = commentReplyList;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public NextOfKin getNextOfKin() {
		return nextOfKin;
	}

	public void setNextOfKin(NextOfKin nextOfKin) {
		this.nextOfKin = nextOfKin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bioId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BioData other = (BioData) obj;
		if (bioId != other.bioId)
			return false;
		return true;
	}

}
