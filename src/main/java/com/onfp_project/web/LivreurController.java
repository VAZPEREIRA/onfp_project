package com.onfp_project.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class LivreurController {
	
	

	
	@GetMapping("/livreurs")
	public  String  getLivreurs(Model model) {
	
		return "livreur";
	}

}
