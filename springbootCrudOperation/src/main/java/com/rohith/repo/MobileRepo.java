package com.rohith.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rohith.web.Mobile;
@Repository
public interface MobileRepo extends CrudRepository<Mobile, Integer> {

}
