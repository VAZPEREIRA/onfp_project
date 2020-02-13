package com.onfp_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CooperateurController {
	
	@GetMapping("/cooperateurs")
	public  String  getCooperateurs() {
		return "cooperateur";
	}

}
