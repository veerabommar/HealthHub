package com.healthhub.icu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.icu.entity.Icu;
import com.healthhub.repository.IcuRepository;

@Service
public class IcuService {

	@Autowired
	IcuRepository icuRepository;

	public Icu createUser(Icu icu) {
		return icuRepository.save(icu);
	}

	public List<Icu> getHospitalName(String hospitalName) {
		return icuRepository.findByHospitalName(hospitalName);
	}
	
	public List<Icu> getIcuType(String icuType) {
		return icuRepository.findByIcuType(icuType);
	}

	public List<Icu> getLocation(String location) {
		return icuRepository.findByLocation(location);
	}

	public List<Icu> getHospitalNameAndLocation(String hospitalName, String location) {
		return icuRepository.findByHospitalNameAndLocation(hospitalName, location);
	}
	
	public List<Icu> getHospitalNameAndIcuType(String hospitalName, String icuType) {
		return icuRepository.findByIcuTypeAndHospitalName(hospitalName, icuType);
	}	

	public List<Icu> getIcuTypeAndLocation(String icuType, String location) {
		return icuRepository.findByIcuTypeAndLocation(icuType, location);
	}



	public List<Icu> getAllIcuDetails() {
		return icuRepository.findAll();
	}
}
