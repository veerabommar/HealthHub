package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.eid.entity.EidEntity;

@Repository
public interface EidRepository extends MongoRepository<EidEntity, String> {
	
	EidEntity findByEid(String eid);

	List<EidEntity> findByFirstName(String firstName);
	
	List<EidEntity> findByMobileNo (String userId);	
}
