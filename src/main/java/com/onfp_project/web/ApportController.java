package com.onfp_project.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onfp_project.dao.ApportRepository;

/**
 * @author CrunchDroid
 * @param <IonfpMetier>
 */
@Controller
@RequestMapping(value="/operation",method=RequestMethod.GET)

public class ApportController {
	
	@Autowired
	private ApportRepository apportRepository;
	    public String index() {
	        return "apports";
	    }
}
