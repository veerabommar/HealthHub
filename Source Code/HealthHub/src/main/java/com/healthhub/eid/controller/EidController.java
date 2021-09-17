package com.healthhub.eid.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.eid.entity.EidEntity;
import com.healthhub.eid.service.EidService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/eid")
public class EidController {

	@Autowired
	EidService eidService;

	@PostMapping("/create")
	public EidEntity createEid(@RequestBody EidEntity eid) {
		return eidService.createEid(eid);
	}

	@GetMapping("/getByEid/{eid}")
	public EidEntity getByEid(@PathVariable String eid) {
		return eidService.getByEid(eid);
	}

	@GetMapping("/getByName/{name}")
	public List<EidEntity> getByEidId(@PathVariable String name) {
		return eidService.getByName(name);
	}

	@GetMapping("/all")
	public List<EidEntity> getAllEids() {
		return eidService.getAllEids();
	}
}
