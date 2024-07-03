package com.rohith.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rohith.web.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
