package com.onfp_project.web;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author CrunchDroid
 * @param <IonfpMetier>
 */
@Controller


public class ApportController {
	
	@GetMapping("/apports")
	public  String  getApports() {
		return "apport";
	}
}
