package com.healthhub.reports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.reports.entity.Visit;
import com.healthhub.repository.VisitRepository;

@Service
public class VisitService {

	@Autowired
	VisitRepository visitRepository;

	public Visit createVisit(Visit visit) {
		return visitRepository.save(visit);
	}

	public List<Visit> getByEid(String eid) {
		return visitRepository.findByEid(eid);
	}

	public List<Visit> getByUserID (String userID) {
		return visitRepository.findByUserID(userID);
	}	
	
	public List<Visit> getAllVisits() {
		return visitRepository.findAll();
	}
}
