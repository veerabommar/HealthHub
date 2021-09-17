package com.healthhub.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.reports.entity.Report;
import com.healthhub.reports.service.ReportService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/report")
public class ReportController {

	@Autowired
	ReportService reportService;

	@PostMapping("/create")
	public Report createReport(@RequestBody Report report) {
		return reportService.createReport(report);
	}

	@GetMapping("/getByVisitId/{visitId}")
	public List<Report> getByVisitId(@PathVariable String visitId) {
		return reportService.getByVisitId(visitId);
	}	

	@GetMapping("/getByEid/{eid}")
	public List<Report> getByReport(@PathVariable String eid) {
		return reportService.getByEid(eid);
	}	

	@GetMapping("/getByVisitDate/{vistiDate}")
	public List<Report> getByVistiDate(@PathVariable String vistiDate) {
		return reportService.getByVistiDate(vistiDate);
	}
	
	@GetMapping("/all")
	public List<Report> getAllReports() {
		return reportService.getAllReports();
	}
}
