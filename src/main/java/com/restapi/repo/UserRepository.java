package com.restapi.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.User;

@Repository
public interface UserRepository extends  MongoRepository<User, String> {

	
}
