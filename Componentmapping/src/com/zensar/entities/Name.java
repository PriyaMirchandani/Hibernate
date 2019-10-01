package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Priya Mirchandani
 * @creation_date 26th sep 2019 2.45pm
 * @modification_date 26th sep 2019 2.45pm
 * @version 1.0
 * @copyright Zensar Technologies.all rights reserved
 * @description it is a javabean class
 *              
 *              
 *
 */
@Embeddable
public class Name {
@Column(name="first",length =30)
	private String first;
	private String middle;
	private String lastName;
	public Name() {
		// TODO Auto-generated constructor stub
	}
	public Name(String first, String middle, String lastName) {
		super();
		this.first = first;
		this.middle = middle;
		this.lastName = lastName;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String firstName) {
		this.first = firstName;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + first + ", middleName=" + middle + ", lastName=" + lastName + "]";
	}
	
}
