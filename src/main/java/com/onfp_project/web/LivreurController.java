package com.onfp_project.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.onfp_project.entities.Livreur;
import com.onfp_project.services.LivreurService;

@Controller
public class LivreurController {
	
	
	@Autowired
	private LivreurService livreurService;
	
	@GetMapping("/livreurs")
	public  String  getLivreurs(Model model) {
		List<Livreur> livreurList = livreurService.getLivreurs();
		
		model.addAttribute("livreurs", livreurList);
		return "livreur";
	}

}
