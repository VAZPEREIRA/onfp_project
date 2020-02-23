

package com.onfp_project.web;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onfp_project.dao.ResponsableRepository;
import com.onfp_project.entities.Responsable;


@Controller
public class ResponsableController {
	

		
		@Autowired
		private  ResponsableRepository responsableRepository;
		@RequestMapping(value="/index")
		//@GetMapping("/user/index")
		public String index(Model model) {
			List<Responsable> responsables=responsableRepository.findAll();
			model.addAttribute("listresponsables", responsables);
			return "responsable";
		}
		
		@RequestMapping(value="/delete", method=RequestMethod.GET)
		public  String delete(Long id)  {
			responsableRepository.deleteById(id);
			return "redirect:/index";
			
		}

		@RequestMapping(value="/form", method =RequestMethod.GET)
		public  String formResponsable(Model model)  {
			model.addAttribute("responsable", new Responsable());
			return "formResponsable";
			
		}
		
		
		@PostMapping("/save")
		public  String save(Model model, @Valid Responsable responsable,
				BindingResult bindingResult)  {
			
			if(bindingResult.hasErrors())
				return "formResponsable";
			responsableRepository.save(responsable);
			return "Confirmation";
			
		}
		
		//@GetMapping("/admin/edit")
		//public  String edit(Model model, Long id)  {
			//Responsable responsable=responsableRepository.findById(id).get();
			//model.addAttribute("responsable",responsable);
			//return "editResponsable";
			
		//}
		
		//@PostMapping("/admin/save")
		//public  String save(Model model ,@Valid Responsable responsable, BindingResult bindingResult)  {
			
			//responsableRepository.save(responsable);
			//return "redirect:/user/index";
			
		//}
		
		//@GetMapping("/")
		//public  String def()  {
			//return "redirect:/user/index";
		//}
		
		//@GetMapping("/403")
		//public  String notAutorized()  {
			//return "403";
		//}
		
		//@GetMapping("/login")
		//public  String login()  {
			//return "login";
		//}
	//}


}

