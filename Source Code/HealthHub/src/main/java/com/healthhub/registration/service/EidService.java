package com.healthhub.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.registration.entity.Eid;
import com.healthhub.repository.EidRepository;

@Service
public class EidService {

	@Autowired
	EidRepository eidRepository;

	public Eid createEid(Eid eid) {
		return eidRepository.save(eid);
	}

	public Eid getByEId(String eid) {
		return eidRepository.findByEid(eid);
	}

	public List<Eid> getByName (String name) {
		return eidRepository.findByName(name);
	}
	
	public List<Eid> getByMobileNo (String mobileNo) {
		return eidRepository.findByMobileNo(mobileNo);
	}
	
	public List<Eid> getAllEids() {
		return eidRepository.findAll();
	}
}
