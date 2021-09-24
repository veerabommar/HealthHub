package com.healthhub.icu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthhub.icu.entity.Icu;
import com.healthhub.icu.service.IcuService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/icu")
public class IcuController {
	
	@Autowired
	IcuService icuService;

	@PostMapping("/create")
	public Icu createUser(@RequestBody Icu icu) {
		return icuService.createUser(icu);
	}
	
	@PostMapping("/GetIcuDetails")
	public List<Icu> GetIcuDetails(@RequestBody Icu icu) {
		
		if(icu.getHospitalName().equalsIgnoreCase("all") && icu.getLocation().equalsIgnoreCase("all")  && icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getAllIcuDetails();			
		}else if(!icu.getHospitalName().equalsIgnoreCase("all") && icu.getLocation().equalsIgnoreCase("all")  && icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getHospitalName(icu.getHospitalName());
		}else if(icu.getHospitalName().equalsIgnoreCase("all") && !icu.getLocation().equalsIgnoreCase("all")  && icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getLocation(icu.getLocation());
		}else if(icu.getHospitalName().equalsIgnoreCase("all") && icu.getLocation().equalsIgnoreCase("all")  && !icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getIcuType(icu.getIcuType());
		}else if(!icu.getHospitalName().equalsIgnoreCase("all") && !icu.getLocation().equalsIgnoreCase("all")  && icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getHospitalNameAndLocation(icu.getHospitalName(), icu.getLocation());			
		}else if(!icu.getHospitalName().equalsIgnoreCase("all") && icu.getLocation().equalsIgnoreCase("all")  && !icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getHospitalNameAndIcuType(icu.getHospitalName(), icu.getIcuType());
		}else if(icu.getHospitalName().equalsIgnoreCase("all") && !icu.getLocation().equalsIgnoreCase("all")  && icu.getIcuType().equalsIgnoreCase("all"))
		{
			return icuService.getIcuTypeAndLocation(icu.getIcuType(), icu.getLocation());
		}
			
		return icuService.getAllIcuDetails();
		
	}	

}
