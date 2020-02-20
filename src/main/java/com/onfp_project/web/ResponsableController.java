

package com.onfp_project.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.onfp_project.entities.Responsable;
import com.onfp_project.services.ResponsableService;

@Controller
public class ResponsableController {
	
	@Autowired
	private ResponsableService responsableService;
	
	@GetMapping("/responsables")
	public  String  getResponsables(Model model) {
		
		List<Responsable> responsableList = responsableService.getResponsables();
		
		 model.addAttribute("responsables", responsableList);
		
		return "responsable";
	}

	
	@PostMapping("/responsables/ajouterNouveau")
	public String ajouterNouveau(Responsable responsable) {
		responsableService.save(responsable);
		return "redirect:/responsables";
	}
}


//package com.onfp_project.web;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class ResponsableController {
	
	//@GetMapping("/responsables")
	//public  String  getResponsables() {
		//return "responsable";
	//}

//}

