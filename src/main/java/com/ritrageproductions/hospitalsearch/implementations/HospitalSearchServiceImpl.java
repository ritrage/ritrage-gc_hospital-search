package com.ritrageproductions.hospitalsearch.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritrageproductions.hospitalsearch.models.Hospital;
import com.ritrageproductions.hospitalsearch.repositories.HospitalRepository;
import com.ritrageproductions.hospitalsearch.services.HospitalSearchService;

@Service
public class HospitalSearchServiceImpl implements HospitalSearchService {
	
	@Autowired
	private HospitalRepository hospitalRepository;

	@Override
	public List<Hospital> allHos() {
		return hospitalRepository.findAll();
	}

	@Override
	public List<Hospital> hospitalsByName(String name) {
		name = name.toLowerCase();
		List<Hospital> hbn = new ArrayList<>();
		for(Hospital hospital : hospitalRepository.findAll()) {
			if(hospital.getName().toLowerCase().contains(name) || hospital.getAbbreviation().toLowerCase().contains(name)) hbn.add(hospital);
		}
		return hbn;
	}

	@Override
	public List<Hospital> hospitalsByLocation(String location) {
		location = location.toLowerCase();
		List<Hospital> hbl = new ArrayList<>();
		for(Hospital hospital : hospitalRepository.findAll()) {
			if(hospital.getLocation().toLowerCase().contains(location)) hbl.add(hospital);
		}
		return hbl;
	}

	@Override
	public List<Hospital> hospitalsByNameAndLocation(String name, String location) {
		name = name.toLowerCase();
		location = location.toLowerCase();
		List<Hospital> hbnal = new ArrayList<>();
		for(Hospital hospital : hospitalRepository.findAll()) {
			if(hospital.getName().toLowerCase().contains(name) || hospital.getAbbreviation().toLowerCase().contains(name)) {
				if(hospital.getLocation().toLowerCase().contains(location)) hbnal.add(hospital);
			}
		}
		return hbnal;
	}

	@Override
	public List<String> allLocations() {
		List<String> allLocations = new ArrayList<>();
		for(Hospital hospital: hospitalRepository.findAll()) {
			if(!allLocations.contains(hospital.getLocation())) allLocations.add(hospital.getLocation());
		}
		return allLocations;
	}

}
