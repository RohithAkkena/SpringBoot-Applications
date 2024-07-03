package com.rohith.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rohith.model.Users;
@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {

}
