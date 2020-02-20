package com.onfp_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onfp_project.dao.LivreurRepository;
import com.onfp_project.entities.Livreur;

@Service
public class LivreurService {
	
	@Autowired
	
	private LivreurRepository livreurRepository;
    public List<Livreur> getLivreurs(){
    	// Retourne la liste des livreurs
    	return livreurRepository.findAll();
    	
    }
}
