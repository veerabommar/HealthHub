package com.healthhub.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.registration.entity.HospitalUser;
import com.healthhub.repository.HospitalRepository;

@Service
public class HospitalService {

	@Autowired
	HospitalRepository hospitalRepository;

	public HospitalUser createUser(HospitalUser hospitalUser) {
		return hospitalRepository.save(hospitalUser);
	}

	public HospitalUser getUserId(String hospitalId) {
		return hospitalRepository.findByHospitalId(hospitalId);
	}
	
	public HospitalUser getUserIdAndPassword(String hospitalId, String password) {
		return hospitalRepository.findByHospitalIdAndPassword(hospitalId,password);
	}

	public List<HospitalUser> getAllUsers() {
		return hospitalRepository.findAll();
	}
}
