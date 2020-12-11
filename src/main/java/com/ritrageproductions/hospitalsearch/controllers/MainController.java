package com.ritrageproductions.hospitalsearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ritrageproductions.hospitalsearch.models.Hospital;
import com.ritrageproductions.hospitalsearch.services.HospitalSearchService;

//@CrossOrigin(origins="https://localhost:3000")
@RestController
@RequestMapping("/search")
public class MainController {
	
	@Autowired
	private HospitalSearchService hss;
	
	@GetMapping("/hospitals/all")
	public List<Hospital> allHospitals() {
		return hss.allHos();
	}
	
	@GetMapping("/hospitals/allLocations")
	public List<String> allLocations() {
		return hss.allLocations();
	}
	
	@GetMapping(value = "/hospitals", params="name")
	@ResponseBody
	public List<Hospital> hospitalsByName(@RequestParam String name) {
		return hss.hospitalsByName(name);
	}
	
	@GetMapping(value="/hospitals", params="location")
	@ResponseBody
	public List<Hospital> hospitalsByLocation(@RequestParam String location) {
		return hss.hospitalsByLocation(location);
	}
	
	@GetMapping(value="/hospitals", params= {"name", "location"})
	@ResponseBody
	public List<Hospital> hospitalsByNameAndLocation(@RequestParam String name, @RequestParam String location) {
		return hss.hospitalsByNameAndLocation(name, location);
	}

}
