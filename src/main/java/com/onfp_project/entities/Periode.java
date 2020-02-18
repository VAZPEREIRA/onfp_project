package com.onfp_project.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Periode implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private Time heure;
	
	
	@ManyToOne
	private Site site;
	@ManyToOne
	private Controleur controleur;
	
	public Periode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Periode(Date date, Time heure) {
		super();
		this.date = date;
		this.heure = heure;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getHeure() {
		return heure;
	}
	public void setHeure(Time heure) {
		this.heure = heure;
	}
	

}
