package com.learn.personApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.personApp.bean.Person;
import com.learn.personApp.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public List<Person> getPerson() {
		return personService.getAllPerson();
	}
	
	@GetMapping("/persons/{id}")
	public Person getPersonById(@PathVariable(name = "id") int id) {
		return personService.getPersonById(id);
	}
	
	@PostMapping("/persons")
	public Person insert(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	
	@DeleteMapping("/persons/{id}")
	public int delete(@PathVariable(name = "id") int id) {
		return id;
	}
}
