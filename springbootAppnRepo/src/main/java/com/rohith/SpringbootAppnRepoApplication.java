package com.rohith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rohith.web.Student;
import com.rohith.repo.StudentRepo;

@SpringBootApplication
public class SpringbootAppnRepoApplication implements CommandLineRunner {
	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppnRepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student s1=new Student(111, "satish", 1000.90, "spring");
//		Student s2=new Student(101,"madan",4000.00,"react");
//		repo.save(s1);
//		repo.save(s2);
//		System.out.println("inserted succesfully");
		
		System.out.println("..........Get one Record.........");
		Student getOne=repo.findById(111).get();
		System.out.println(getOne);
//		System.out.println(".........Get All.........");
//		repo.findAll().forEach(getAll->{
//			System.out.println(getAll);
//		});
		
//		System.out.println("........UPDATE.........");
//		Student oldStudent=repo.findById(111).get();
//		oldStudent.setCourse("SpringBoot");
//		System.out.println("updated....................");

		
	}
	
	
	
	

}
