//package com.onfp_project.web;

//public class SiteController {

//}

package com.onfp_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
	
	@GetMapping("/sites")
	public  String  getSites() {
		return "site";
	}

}

