package com.shifting_customers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@SuppressWarnings("serial")
@Entity
@Table(name = "customer", uniqueConstraints = {@UniqueConstraint(columnNames = {"MOBILENUMBER"}) })
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable{

	@Id
	@Column( name = "user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "password")
	private String password;
	
	@Id
	@Column(name = "mobilenumber")
	private long mobilenumber;
	
	@Column(name = "otp")
	private int otp;
	
	

	public User(int id, String name, String email, String password, long mobilenumber, int otp) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.otp = otp;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public long getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public int getOtp() {
		return otp;
	}



	public void setOtp(int otp) {
		this.otp = otp;
	}



	
	public User() {
		
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", mobilenumber="
				+ mobilenumber + ", otp=" + otp + "]";
	}
	

}
