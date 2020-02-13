package com.onfp_project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pese {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numPese;
	private int nbCamions;
	private double poids;
	
	@ManyToOne
	private Apport apport;
	@ManyToOne
	private Palette palette;
	public Pese() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pese(int nbCamions, double poids) {
		super();
		this.nbCamions = nbCamions;
		this.poids = poids;
	}
	public Long getNumPese() {
		return numPese;
	}
	public void setNumPese(Long numPese) {
		this.numPese = numPese;
	}
	public int getNbCamions() {
		return nbCamions;
	}
	public void setNbCamions(int nbCamions) {
		this.nbCamions = nbCamions;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	

}
