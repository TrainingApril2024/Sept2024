package com.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learn.bean.Student;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("welcome");
		modelAndView.addObject("message","Welcome");
		return modelAndView;
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView getStudent() {
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("displayStudent");
		Student student = new Student();
		student.setName("Ram");
		student.setAge("30");
		modelAndView.addObject("student",student);
		return modelAndView;
	}
}
