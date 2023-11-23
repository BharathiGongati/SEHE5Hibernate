package org.jsp.controller;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long phone;
	private String name;
	private String email;
	@ManyToOne(cascade = CascadeType.ALL)
	private Hospital hos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Hospital getHos() {
		return hos;
	}
	public void setHos(Hospital hos) {
		this.hos = hos;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", phone=" + phone + ", name=" + name + ", email=" + email + "]";
	}

	

}
