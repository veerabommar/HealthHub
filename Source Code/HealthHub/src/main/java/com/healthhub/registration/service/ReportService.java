package com.healthhub.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.registration.entity.Report;
import com.healthhub.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	ReportRepository reportService;

	public Report createReport(Report report) {
		return reportService.save(report);
	}

	public Report getByEId(String report) {
		return reportService.findByEId(report);
	}

	public List<Report> getByName (String name) {
		return reportService.findByName(name);
	}	
	
	public List<Report> getAllReports() {
		return reportService.findAll();
	}
}
