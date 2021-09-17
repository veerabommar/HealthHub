package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.reports.entity.Visit;

@Repository
public interface VisitRepository extends MongoRepository<Visit, String> {

	List<Visit> findByEid (String eid);
	
	List<Visit> findByUserID(String userID);
}
