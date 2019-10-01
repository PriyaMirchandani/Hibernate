package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Priya Mirchandani
 * @creationdate    27 sep 2019  2.55pm
 * @modificationdate 27 sep 2019  2.55pm
 * @version 2.0
 * @param <Flag>
 * @copyright zensar technologies.all rights reserved
 * @description it is a flag class
 *
 */
@Entity
public class Flag {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private int  flagId;
    private String flagName;
    private String  description;
  
@OneToOne(mappedBy="flag")
    private Country country;
  
public int getFlagId() {
	return flagId;
}
public void setFlagId(int flagId) {
	this.flagId = flagId;
}
public String getFlagName() {
	return flagName;
}
public void setFlagName(String flagName) {
	this.flagName = flagName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
  
  
}
