package com.ritrageproductions.hospitalsearch.services;

import java.util.List;

import com.ritrageproductions.hospitalsearch.models.Hospital;

public interface HospitalSearchService {

	List<Hospital> allHos();
	
	List<Hospital> hospitalsByName(String name);
	
	List<Hospital> hospitalsByLocation(String location);
	
	List<Hospital> hospitalsByNameAndLocation(String name, String location);

	List<String> allLocations();

}
