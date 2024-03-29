package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *@author Priya Mirchandani
 *@creation_date      27th sep 2019 11.48am
 *@modification_date  27th sep 2019 11.48am
 *@version 1.0
 *@copyright Zensar Technologies.all rights reserved
 *@description it is a persistence class
 */

@Entity
@DiscriminatorValue("w")
public class WageEmp extends Employee {
      private int hours;
      private float rate;
      public WageEmp() {
		
	}
	public WageEmp(int empId, String name, LocalDate joiningDate, double salary, int hours, float rate) {
		super(empId, name, joiningDate, salary);
		this.hours = hours;
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}
      
}
