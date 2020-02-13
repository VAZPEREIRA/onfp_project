package com.onfp_project;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.onfp_project.dao.ApportRepository;

import com.onfp_project.entities.Apport;


@SpringBootApplication
@ComponentScan(basePackages={"com.onfp_project"})
public class OnfpProjectApplication implements CommandLineRunner{
	@Autowired
	private ApportRepository apportRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnfpProjectApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		  
	
		
		
		apportRepository.save(new Apport("500","300","2019-11-10","2019-10-10"));

		apportRepository.save(new Apport("501","301","2019-11-10","2019-10-05"));
		

		
		
				
		
		apportRepository.findAll().forEach(e->{ 
			System.out.println(e.getPoidsVides());
			
		});
		
		
	}

}
