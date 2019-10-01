package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 * @author Priya Mirchandani
 * @creation_date 26th sep 2019 2.54pm
 * @modification_date 26th sep 2019 2.54pm
 * @version 1.0
 * @copyright Zensar Technologies.all rights reserved
 * @description it is a javabean class
 *              
 *              
 *
 */


@Entity
@Table(name="Customer")
public class Customer {
@Id
@Column(name="cid")
  private int customerId;
   Name customername;   //customer has a name(object under object)
   private String gender;
   private int age;
   @Column(nullable = false)
   private String address;
   private LocalDate birthday;
   private Blob profilePhoto;
   private Clob description;
   
   public Customer() {
	
}

public Customer(int customerId, Name customername, String gender, int age, String address) {
	super();
	this.customerId = customerId;
	this.customername = customername;
	this.gender = gender;
	this.age = age;
	this.address = address;
}

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public Name getCustomername() {
	return customername;
}
public void setCustomername(Name customername) {
	this.customername = customername;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public LocalDate getBirthday() {
	return birthday;
}

public void setBirthday(LocalDate birthday) {
	this.birthday = birthday;
}

public Blob getProfilePhoto() {
	return profilePhoto;
}

public void setProfilePhoto(Blob profilePhoto) {
	this.profilePhoto = profilePhoto;
}


public Clob getDescription() {
	return description;
}

public void setDescription(Clob description) {
	this.description = description;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customername=" + customername + ", gender=" + gender + ", age="
			+ age + "]";
}
  
}
