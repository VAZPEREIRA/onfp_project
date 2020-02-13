package com.onfp_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onfp_project.entities.Apport;
import com.onfp_project.entities.Livreur;

public interface LivreurRepository extends JpaRepository <Livreur,Long>{

}
