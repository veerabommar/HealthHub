package com.healthhub.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.registration.entity.Report;
import com.healthhub.registration.service.ReportService;

@RestController
@RequestMapping("/api/report")
public class ReportController {

	@Autowired
	ReportService reportService;

	@PostMapping("/create")
	public Report createReport(@RequestBody Report report) {
		return reportService.createReport(report);
	}

	@GetMapping("/getByEid/{eid}")
	public List<Report> getByReport(@PathVariable String eid) {
		return reportService.getByEid(eid);
	}

	@GetMapping("/getByName/{name}")
	public List<Report> getByName(@PathVariable String name) {
		return reportService.getByName(name);
	}

	@GetMapping("/all")
	public List<Report> getAllReports() {
		return reportService.getAllReports();
	}
}
