package com.healthhub.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.registration.entity.HospitalUser;
import com.healthhub.registration.service.HospitalService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/hospitaluser")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;

	@PostMapping("/create")
	public HospitalUser createUser(@RequestBody HospitalUser hospitalUser) {
		return hospitalService.createUser(hospitalUser);
	}	
	
	@GetMapping("/getByUserId/{hospitalId}")
	public HospitalUser getByUserId(@PathVariable String hospitalId) {
		return hospitalService.getUserId(hospitalId);
	}	
	
	@PostMapping("/validateUserId")
	public HospitalUser getByUserId(@RequestBody HospitalUser hospitalUser) {
		return hospitalService.getUserIdAndPassword(hospitalUser.getHospitalId(),hospitalUser.getPassword());
	}		
	
	@GetMapping("/all")
	public List<HospitalUser> getAllUsers() {
		return hospitalService.getAllUsers();
	}

}
