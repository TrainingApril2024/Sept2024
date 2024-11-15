package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learn.beans.Student;

@Controller
public class WelcomeController {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome");
		modelAndView.addObject("message", "Welcome");
		return modelAndView;
	}
	
	@RequestMapping(value = "/welcomeForm", method = RequestMethod.GET)
	public String welcomeForm(ModelMap modelMap) {
		modelMap.addAttribute("welcomeMessage","Submit below Form");
		return "form";
	}
	
	@RequestMapping(value = "/showId", method = RequestMethod.GET)
	public ModelAndView loadId(@RequestParam(value = "id", required=false, defaultValue = "100") int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showId");
		modelAndView.addObject("id",id);
		return modelAndView;
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showStudent");
		modelAndView.addObject("student",student);
		return modelAndView;
	}
}
