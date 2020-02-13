package com.onfp_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onfp_project.entities.Apport;
import com.onfp_project.entities.Palette;

public interface PaletteRepository extends JpaRepository <Palette,Long>{

}
