package com.chinasoft.app.hibernatejboss;

// Generated 2017-7-14 15:24:45 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Classinfor generated by hbm2java
 */
public class Classinfor implements java.io.Serializable {

	private Integer cid;
	private String cname;
	private Set students = new HashSet(0);

	public Classinfor() {
	}

	public Classinfor(String cname, Set students) {
		this.cname = cname;
		this.students = students;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}
