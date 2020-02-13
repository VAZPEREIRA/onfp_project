package com.onfp_project.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Parcelle implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numParcelle;
	
	@ManyToOne
	private Cooperateur cooperateur;

	public Parcelle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parcelle(Long numParcelle) {
		super();
		this.numParcelle = numParcelle;
	}

	public Long getNumParcelle() {
		return numParcelle;
	}

	public void setNumParcelle(Long numParcelle) {
		this.numParcelle = numParcelle;
	}
	
	
	

}
