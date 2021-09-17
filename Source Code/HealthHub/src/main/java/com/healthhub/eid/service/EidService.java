package com.healthhub.eid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.eid.entity.EidEntity;
import com.healthhub.repository.EidRepository;

@Service
public class EidService {

	@Autowired
	EidRepository eidRepository;

	public EidEntity createEid(EidEntity eid) {
		return eidRepository.save(eid);
	}

	public List<EidEntity> getByName(String firstName) {
		return eidRepository.findByFirstName(firstName);
	}
	
	public EidEntity getByEid(String eid) {
		return eidRepository.findByEid(eid);
	}
	
	
	public List<EidEntity> getByMobileNo(String mobileNo) {
		return eidRepository.findByMobileNo(mobileNo);
	}
	
	public List<EidEntity> getAllEids() {
		return eidRepository.findAll();
	}
}
