package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.registration.entity.Eid;

@Repository
public interface EidRepository extends MongoRepository<Eid, String> {

	Eid findByEid (String Eid);
	
	List<Eid> findByName(String name);

	List<Eid> findByMobileNo (String userId);	
}
