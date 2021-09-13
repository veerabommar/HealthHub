package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.registration.entity.Report;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {

	Report findByEId (String eid);
	
	List<Report> findByName(String name);
}
