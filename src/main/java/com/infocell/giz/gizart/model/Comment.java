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

@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue
	@Column(name = "comment_id")
	private int commentId;

	@Column(name = "comment_title")
	private String commentTitle;

	@Column(name = "comment_body")
	private String commentBody;

	@ManyToOne
	@JoinColumn(name = "bio_id")
	private BioData bioData;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "comment")
	private List<CommentReply> commentReplyList = new ArrayList<>();

	@OneToOne(mappedBy = "comment")
	private ServiceRequestMade serviceRequestMade;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private CommentStatus commentStatus;

	public List<CommentReply> getCommentReplyList() {
		return commentReplyList;
	}

	public void setCommentReplyList(List<CommentReply> commentReplyList) {
		this.commentReplyList = commentReplyList;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getCommentTitle() {
		return commentTitle;
	}

	public void setCommentTitle(String commentTitle) {
		this.commentTitle = commentTitle;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}

	public BioData getBioData() {
		return bioData;
	}

	public void setBioData(BioData bioData) {
		this.bioData = bioData;
	}

	public ServiceRequestMade getServiceRequestMade() {
		return serviceRequestMade;
	}

	public void setServiceRequestMade(ServiceRequestMade serviceRequestMade) {
		this.serviceRequestMade = serviceRequestMade;
	}

	public CommentStatus getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(CommentStatus commentStatus) {
		this.commentStatus = commentStatus;
	}

}
