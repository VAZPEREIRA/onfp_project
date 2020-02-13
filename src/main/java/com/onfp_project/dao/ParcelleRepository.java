package com.onfp_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onfp_project.entities.Apport;
import com.onfp_project.entities.Parcelle;

public interface ParcelleRepository extends JpaRepository <Parcelle,Long>{

}
