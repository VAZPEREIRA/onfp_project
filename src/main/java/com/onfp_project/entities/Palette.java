package com.onfp_project.entities;

import java.io.Serializable;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Palette implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numPalette;
	@OneToMany(mappedBy="palette")
	private Collection<Pese> peses;
	public Palette() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Palette(Long numPalette) {
		super();
		this.numPalette = numPalette;
	}

	public Long getNumPalette() {
		return numPalette;
	}

	public void setNumPalette(Long numPalette) {
		this.numPalette = numPalette;
	}


}
