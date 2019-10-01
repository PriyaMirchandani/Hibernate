package com.zensar.entities;


import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




/**
 * @author Priya Mirchandani
 *@creation_date      27th sep 2019 11.31am
 *@modification_date  27th sep 2019 22.16pm
 *@version 2.0
 *@copyright Zensar Technologies.all rights reserved
 *@description it is a persistence class
 */

@Entity
@Table(name="emp_2")
@Inheritance(strategy=InheritanceType.JOINED)

 public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
   private int empId;
   private String name;
   private LocalDate  joiningDate;
   private double salary;
   
   public Employee() {
	}
   
   

public Employee(int empId, String name, LocalDate joiningDate, double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.joiningDate = joiningDate;
	this.salary = salary;
}



public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getJoiningDate() {
	return joiningDate;
}

public void setJoiningDate(LocalDate joiningDate) {
	this.joiningDate = joiningDate;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", joiningDate=" + joiningDate + ", salary=" + salary + "]";
}
   

   
   
   
}
