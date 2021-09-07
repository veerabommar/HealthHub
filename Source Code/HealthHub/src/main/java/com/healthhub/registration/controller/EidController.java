package com.healthhub.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.registration.entity.Eid;
import com.healthhub.registration.service.EidService;

@RestController
@RequestMapping("/api/Eid")
public class EidController {

	@Autowired
	EidService eidService;

	@PostMapping("/create")
	public Eid createEid(@RequestBody Eid eid) {
		return eidService.createEid(eid);
	}

	@GetMapping("/getByEid/{eid}")
	public Eid getByEid(@PathVariable String eid) {
		return eidService.getByEId(eid);
	}

	@GetMapping("/getByName/{name}")
	public List<Eid> getByEidId(@PathVariable String name) {
		return eidService.getByName(name);
	}

	@GetMapping("/all")
	public List<Eid> getAllEids() {
		return eidService.getAllEids();
	}
}
