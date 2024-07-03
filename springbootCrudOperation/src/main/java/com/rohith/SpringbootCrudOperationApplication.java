package com.rohith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohith.repo.MobileRepo;
import com.rohith.web.Mobile;

@SpringBootApplication
public class SpringbootCrudOperationApplication implements CommandLineRunner{
	@Autowired
	private MobileRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudOperationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mobile m1=new Mobile(111,"VivoT15g","VIVO","8gb","128gb","Android","Snapdragon","1234567abgc",15000.00,48);
//		Mobile m2=new Mobile(121,"Realme5pro","Realme","6gb","64gb","Android","Hellog95","6789949abgc",13000.00,16);
//		repo.save(m1);
//		repo.save(m2);
//		System.out.println("Inserted successful............");
//		
		System.out.println("......GEt one record.....");
		Mobile getOne=repo.findById(111).get();
		System.out.println(getOne);
	}

}
