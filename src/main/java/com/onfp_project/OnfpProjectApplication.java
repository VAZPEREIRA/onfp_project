package com.onfp_project;




import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.onfp_project.dao.ApportRepository;
import com.onfp_project.dao.LivreurRepository;
import com.onfp_project.dao.ResponsableRepository;
import com.onfp_project.entities.Apport;
import com.onfp_project.entities.Cooperateur;
import com.onfp_project.entities.Independant;
import com.onfp_project.entities.Livreur;
import com.onfp_project.entities.Responsable;


@SpringBootApplication



public class OnfpProjectApplication implements CommandLineRunner{
	@Autowired
	private ResponsableRepository responsableRepository;
	
	@Autowired
	private LivreurRepository  livreurRepository;
	
	
	@Autowired
	private ApportRepository  apportRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnfpProjectApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		  
	
		
		
		Responsable R1=responsableRepository.save(new Responsable("Vaz Pereira","Abdoul Khadre","Guediawaye","779167521"));
		Responsable R2=responsableRepository.save(new Responsable("Fall","Aissatou","Mamelle","775168541"));
		Responsable R3=responsableRepository.save(new Responsable("Seck","Omar","Keur Massar","783246713"));
		
		Apport A1=apportRepository.save(new Apport("600KG", "NI04", new Date(), new Date()));
		Apport A2=apportRepository.save(new Apport("600KG", "NI05", new Date(), new Date()));
		Apport A3=apportRepository.save(new Apport("600KG", "NI06", new Date(), new Date()));
	
		
	
		//Livreur   L1=livreurRepository.save(new Cooperateur("Ndiaye", "Pascal", "Ouakam", "771698743", 0.5));
		//Livreur   L2=livreurRepository.save(new Independant("Ba", "Cherif", "Kaolack", "787698793", "BBE Transit"));

		
		
				
		
		responsableRepository.findAll().forEach(e->{ 
			System.out.println(e.getNom());
			
		});
		
		
	}

}
