//package com.onfp_project.web;

//public class Periode {

//}

 package com.onfp_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeriodeController {
	@GetMapping("/periodes")
	public  String  getPeriodes() {
		return "periode";
	}

}

