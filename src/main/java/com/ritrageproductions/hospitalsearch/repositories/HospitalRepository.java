package com.ritrageproductions.hospitalsearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritrageproductions.hospitalsearch.models.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, String>{

}
