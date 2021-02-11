package com.testingshastra.erp.controller;

import javax.swing.text.View;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomePageController {
	@RequestMapping("/")
	public ModelAndView getHomePage(Model model) {
		model.addAttribute("successMsg","Welcome to Testing Shastra");
		ModelAndView mv= new ModelAndView();
		mv.setViewName("homepage");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginToApp(Model model) {
		ModelAndView mv= new ModelAndView();
		
		mv.setViewName("dashboard");
		return mv;
	}

}
