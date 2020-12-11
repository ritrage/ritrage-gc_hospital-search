package com.ritrageproductions.hospitalsearch.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demoorgs")
public class Hospital {
	
	@Id
	private String id;
	private String name;
	private String abbreviation;
	private String location;
	public Hospital() {
		super();
	}
	
	public Hospital(String id, String name, String abbreviation, String location) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.location = location;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
