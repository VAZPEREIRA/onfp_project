package com.onfp_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatutController {

	@GetMapping("/statuts")
	public  String  getApports() {
		return "statut";
	}
}
