package com.onfp_project.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("INP")
public class Independant extends Livreur {

	

	public Independant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Independant(String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
		
	}


	
}
