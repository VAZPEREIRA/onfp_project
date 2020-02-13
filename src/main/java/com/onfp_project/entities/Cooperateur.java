package com.onfp_project.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("COOP")
public class Cooperateur extends Livreur {

	private double taux;
	@OneToMany(mappedBy="cooperateur")
	private Collection<Parcelle> parcelles;

	public Cooperateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cooperateur(String nom, String prenom, String adresse, String telephone, double taux) {
		super(nom, prenom, adresse, telephone);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
