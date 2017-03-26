package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment_reply")
public class CommentReply {

	@Id
	@GeneratedValue
	@Column(name = "comment_reply_id")
	private int commentReplyId;

	@Column(name = "reply_body")
	private String replyBody;

	@ManyToOne
	@JoinColumn(name = "comment_id")
	private Comment comment;

	@ManyToOne
	@JoinColumn(name = "bio_id")
	private BioData bioData;

	public int getCommentReplyId() {
		return commentReplyId;
	}

	public void setCommentReplyId(int commentReplyId) {
		this.commentReplyId = commentReplyId;
	}

	public String getReplyBody() {
		return replyBody;
	}

	public void setReplyBody(String replyBody) {
		this.replyBody = replyBody;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public BioData getBioData() {
		return bioData;
	}

	public void setBioData(BioData bioData) {
		this.bioData = bioData;
	}

}
