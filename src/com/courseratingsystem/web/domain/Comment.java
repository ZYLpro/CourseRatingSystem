package com.courseratingsystem.web.domain;

// Generated 2017-7-18 14:18:31 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Comment generated by hbm2java
 */
public class Comment implements java.io.Serializable{

	private Integer commentid;
	private Date timestamp;
	private Teacher teacher;
	private Course course;
	private User user;
	private Float ratingUsefulness;
	private Float ratingVividness;
	private Float ratingSpareTimeOccupation;
	private Float ratingScoring;
	private Float ratingRollCall;
	private Float recommandScore;
	private String critics;
	private Integer likeCount;

	public Comment() {
	}

	public Comment(Teacher teacher, Course course, User user) {
		this.teacher = teacher;
		this.course = course;
		this.user = user;
	}

	public Comment(Teacher teacher, Course course, User user,
			Float ratingUsefulness, Float ratingVividness,
			Float ratingSpareTimeOccupation, Float ratingScoring,
			Float ratingRollCall, Float recommandScore, String critics,
			Integer likeCount) {
		this.teacher = teacher;
		this.course = course;
		this.user = user;
		this.ratingUsefulness = ratingUsefulness;
		this.ratingVividness = ratingVividness;
		this.ratingSpareTimeOccupation = ratingSpareTimeOccupation;
		this.ratingScoring = ratingScoring;
		this.ratingRollCall = ratingRollCall;
		this.recommandScore = recommandScore;
		this.critics = critics;
		this.likeCount = likeCount;
	}
	public Comment(int teacherId, int courseId, int userId,
			Float ratingUsefulness, Float ratingVividness,
			Float ratingSpareTimeOccupation, Float ratingScoring,
			Float ratingRollCall, Float recommandScore, String critics,
			Integer likeCount) {
		this.teacher = new Teacher();
		teacher.setTeacherid(teacherId);
		this.course = new Course();
		course.setCourseid(courseId);
		this.user = new User();
		user.setUserid(userId);
		this.ratingUsefulness = ratingUsefulness;
		this.ratingVividness = ratingVividness;
		this.ratingSpareTimeOccupation = ratingSpareTimeOccupation;
		this.ratingScoring = ratingScoring;
		this.ratingRollCall = ratingRollCall;
		this.recommandScore = recommandScore;
		this.critics = critics;
		this.likeCount = likeCount;
	}

	public Integer getCommentid() {
		return this.commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Float getRatingUsefulness() {
		return this.ratingUsefulness;
	}

	public void setRatingUsefulness(Float ratingUsefulness) {
		this.ratingUsefulness = ratingUsefulness;
	}

	public Float getRatingVividness() {
		return this.ratingVividness;
	}

	public void setRatingVividness(Float ratingVividness) {
		this.ratingVividness = ratingVividness;
	}

	public Float getRatingSpareTimeOccupation() {
		return this.ratingSpareTimeOccupation;
	}

	public void setRatingSpareTimeOccupation(Float ratingSpareTimeOccupation) {
		this.ratingSpareTimeOccupation = ratingSpareTimeOccupation;
	}

	public Float getRatingScoring() {
		return this.ratingScoring;
	}

	public void setRatingScoring(Float ratingScoring) {
		this.ratingScoring = ratingScoring;
	}

	public Float getRatingRollCall() {
		return this.ratingRollCall;
	}

	public void setRatingRollCall(Float ratingRollCall) {
		this.ratingRollCall = ratingRollCall;
	}

	public Float getRecommandScore() {
		return this.recommandScore;
	}

	public void setRecommandScore(Float recommandScore) {
		this.recommandScore = recommandScore;
	}

	public String getCritics() {
		return this.critics;
	}

	public void setCritics(String critics) {
		this.critics = critics;
	}

	public Integer getLikeCount() {
		return this.likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
}
