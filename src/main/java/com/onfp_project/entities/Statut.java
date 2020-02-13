package com.onfp_project.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Statut  implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeStatut;
	private String statut;
	
	@ManyToOne
	private Independant independants;
	public Statut() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Statut(String statut) {
		super();
		this.statut = statut;
	}
	public Long getCodeStatut() {
		return codeStatut;
	}
	public void setCodeStatut(Long codeStatut) {
		this.codeStatut = codeStatut;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	

}
