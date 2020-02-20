package com.onfp_project.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Apport implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numApport;
	private String poidsVides;
	private String numItineraire;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateArrivee;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateDepart;
	
	@ManyToOne
	private Camion camion;
	@ManyToOne
	private Livreur livreur;
	@ManyToOne
	private Site site;
	@ManyToOne
	private Responsable responsable;
	
	
	public Long getNumApport() {
		return numApport;
	}
	public void setNumApport(Long numApport) {
		this.numApport = numApport;
	}
	public String getPoidsVides() {
		return poidsVides;
	}
	public void setPoidsVides(String poidsVides) {
		this.poidsVides = poidsVides;
	}
	public String getNumItineraire() {
		return numItineraire;
	}
	public void setNumItineraire(String numItineraire) {
		this.numItineraire = numItineraire;
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Apport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apport(String poidsVides, String numItineraire, Date dateArrivee, Date dateDepart) {
		super();
		this.poidsVides = poidsVides;
		this.numItineraire = numItineraire;
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
	}
	
	

}
