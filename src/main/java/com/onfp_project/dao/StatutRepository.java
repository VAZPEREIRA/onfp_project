package com.onfp_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onfp_project.entities.Apport;
import com.onfp_project.entities.Statut;

public interface StatutRepository extends JpaRepository <Statut,Long>{

}
