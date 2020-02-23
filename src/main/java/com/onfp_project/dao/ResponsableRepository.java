package com.onfp_project.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.onfp_project.entities.Responsable;

public interface ResponsableRepository extends JpaRepository <Responsable,Long>{
	
	 @Query("select responsable from Responsable responsable where responsable.nom like :x")
	 public static  Page<Responsable>  chercherResponsables(@Param("x")String mc,Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
  //public  Page<Eleve>  findByNomContains(String mc, Pageable pageable);


}
