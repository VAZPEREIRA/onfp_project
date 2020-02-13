package com.onfp_project.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Camion implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numCamion;
	private String nbMaxiPalette;

	
	@OneToMany(mappedBy="camion")
	private Collection<Apport> apports;
	
	public Long getNumCamion() {
		return numCamion;
	}
	public void setNumCamion(Long numCamion) {
		this.numCamion = numCamion;
	}
	public String getNbMaxiPalette() {
		return nbMaxiPalette;
	}
	public void setNbMaxiPalette(String nbMaxiPalette) {
		this.nbMaxiPalette = nbMaxiPalette;
	}
	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camion(String nbMaxiPalette) {
		super();
		this.nbMaxiPalette = nbMaxiPalette;
	}
	

}
