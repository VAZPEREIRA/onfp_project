package com.onfp_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParcelleController {

	@GetMapping("/parcelles")
	public  String  getLivreurs() {
		return "parcelle";
	}
}
