package com.courseratingsystem.web.domain;

// Generated 2017-7-18 14:18:31 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course implements java.io.Serializable {

	private Integer courseid;
	private String coursename;
	private Set users = new HashSet(0);
	private Set teachers = new HashSet(0);
	private Coursemark coursemark;
	private Set comments = new HashSet(0);

	public Course() {
	}

	public Course(String coursename, Set users, Set teachers,
			Coursemark coursemark, Set comments) {
		this.coursename = coursename;
		this.users = users;
		this.teachers = teachers;
		this.coursemark = coursemark;
		this.comments = comments;
	}

	public Integer getCourseid() {
		return this.courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return this.coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

	public Coursemark getCoursemark() {
		return this.coursemark;
	}

	public void setCoursemark(Coursemark coursemark) {
		this.coursemark = coursemark;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}
