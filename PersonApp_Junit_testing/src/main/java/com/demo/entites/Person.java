package com.demo.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private Integer personId;
	public Person() {
		super();
	}
	private String personName;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonCity() {
		return PersonCity;
	}
	public void setPersonCity(String personCity) {
		PersonCity = personCity;
	}
	private String PersonCity;
	public Person(Integer personId, String personName, String personCity) {
		super();
		this.personId = personId;
		this.personName = personName;
		PersonCity = personCity;
	}

}
