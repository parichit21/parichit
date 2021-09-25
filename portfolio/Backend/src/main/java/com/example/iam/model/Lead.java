package com.example.iam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="potfolio", name="leads")
public class Lead {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	
	
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "Email")
	private String Email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Lead(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
	}
	
	
	
	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
