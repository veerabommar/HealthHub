package com.healthhub.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthhub.registration.entity.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByName(String name);
	
	User findByEid (String Eid);
	
	User findByUserId (String userId);
}
