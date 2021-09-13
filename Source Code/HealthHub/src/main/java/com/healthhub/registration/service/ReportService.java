package com.healthhub.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.registration.entity.Report;
import com.healthhub.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	ReportRepository reportRepository;

	public Report createReport(Report report) {
		return reportRepository.save(report);
	}

	public List<Report> getByEid(String eid) {
		return reportRepository.findByEid(eid);
	}

	public List<Report> getByName (String name) {
		return reportRepository.findByName(name);
	}	
	
	public List<Report> getAllReports() {
		return reportRepository.findAll();
	}
}
