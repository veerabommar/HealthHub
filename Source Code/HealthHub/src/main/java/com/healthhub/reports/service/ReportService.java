package com.healthhub.reports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthhub.reports.entity.Report;
import com.healthhub.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	ReportRepository reportRepository;

	public Report createReport(Report report) {
		return reportRepository.save(report);
	}

	public List<Report> getByVisitId(String visitId) {
		return reportRepository.findByVisitId(visitId);
	}
	
	public List<Report> getByEid(String eid) {
		return reportRepository.findByEid(eid);
	}
	
	public List<Report> getByVistiDate(String vistiDate) {
		return reportRepository.findByVistiDate(vistiDate);
	}
	
	public List<Report> getAllReports() {
		return reportRepository.findAll();
	}
}
