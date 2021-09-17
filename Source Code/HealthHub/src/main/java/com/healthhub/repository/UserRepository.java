package com.healthhub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.registration.entity.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findByEid (String Eid);
	
	User findByUserIdAndPassword(String userId, String password);
	
	User findByUserId (String userId);
}
