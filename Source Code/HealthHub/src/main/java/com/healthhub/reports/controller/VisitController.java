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

import com.healthhub.reports.entity.Visit;
import com.healthhub.reports.service.VisitService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/visit")
public class VisitController {

	@Autowired
	VisitService visitService;

	@PostMapping("/create")
	public Visit createVisit(@RequestBody Visit visit) {
		return visitService.createVisit(visit);
	}

	@GetMapping("/getByEid/{eid}")
	public List<Visit> getByVisit(@PathVariable String eid) {
		return visitService.getByEid(eid);
	}

	@GetMapping("/getByUserID/{userID}")
	public List<Visit> getByUserID(@PathVariable String userID) {
		return visitService.getByUserID(userID);
	}

	@GetMapping("/all")
	public List<Visit> getAllVisits() {
		return visitService.getAllVisits();
	}
}
