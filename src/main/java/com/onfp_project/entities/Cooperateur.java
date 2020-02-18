package com.onfp_project.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("COOP")
public class Cooperateur extends Livreur {

	private double taux;
	private int numParcelle;
	public Cooperateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cooperateur(double taux, int numParcelle) {
		super();
		this.taux = taux;
		this.numParcelle = numParcelle;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public int getNumParcelle() {
		return numParcelle;
	}
	public void setNumParcelle(int numParcelle) {
		this.numParcelle = numParcelle;
	}

	
	
	
}
