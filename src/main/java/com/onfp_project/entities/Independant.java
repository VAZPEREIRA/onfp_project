package com.onfp_project.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("INP")
public class Independant extends Livreur {

	private String libelleStatut;

	public Independant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Independant(String nom, String prenom, String adresse, String telephone, String libelleStatut) {
		super(nom, prenom, adresse, telephone);
		this.libelleStatut = libelleStatut;
	}

	public String getLibelleStatut() {
		return libelleStatut;
	}

	public void setLibelleStatut(String libelleStatut) {
		this.libelleStatut = libelleStatut;
	}
	

	
	
}
