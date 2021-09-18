package com.healthhub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.registration.entity.HospitalUser;


@Repository
public interface HospitalRepository extends MongoRepository<HospitalUser, String> {

	HospitalUser findByHospitalIdAndPassword(String hospitalId, String password);
	
	HospitalUser findByHospitalId(String hospitalId);

}
