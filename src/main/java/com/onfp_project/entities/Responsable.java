package com.onfp_project.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


@Entity
public class Responsable implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long id;
	@NotNull
	private String nom;
	private String prenom;
	private String adresse;
	@DecimalMin("9")
	private String telephone;
	
	@OneToMany(mappedBy="responsable")
	private Collection<Apport> apports;
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsable(String nom, String prenom, String adresse, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	

}
