package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.reports.entity.Report;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {

	List<Report> findByVisitId(String visitId);
	
	List<Report> findByEid(String eid);
	
	List<Report> findByVistiDate(String vistiDate);	
}
