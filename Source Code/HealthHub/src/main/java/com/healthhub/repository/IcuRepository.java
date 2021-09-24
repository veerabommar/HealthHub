package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.icu.entity.Icu;

@Repository
public interface IcuRepository extends MongoRepository<Icu, String> {
	
	List<Icu> findByHospitalName(String hospitalName);
	
	List<Icu> findByIcuType(String icuType);
	
	List<Icu> findByLocation(String location);
	
	List<Icu> findByHospitalNameAndLocation(String hospitalName, String location);

	List<Icu> findByIcuTypeAndLocation(String icuType, String location);

	List<Icu> findByIcuTypeAndHospitalName(String icuType, String hospitalName);
}
