package com.onfp_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onfp_project.dao.ResponsableRepository;
import com.onfp_project.entities.Responsable;

@Service
public class ResponsableService {
	
	 @Autowired
	private  ResponsableRepository responsableRepository;
	
	 // Retourner la list des responsable
	public List<Responsable> getResponsables(){
		return responsableRepository.findAll();
	}

	//SAVE NOUVEAU  RESPONSABLE
	public void save(Responsable responsable) {
		responsableRepository.save(responsable);
	}
}
