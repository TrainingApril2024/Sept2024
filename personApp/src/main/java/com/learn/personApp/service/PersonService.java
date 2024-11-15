package com.learn.personApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.personApp.bean.Person;
import com.learn.personApp.dao.PersonJdbcDao;

@Service
public class PersonService {

	@Autowired
	private PersonJdbcDao personJdbcDao; 
	
	public List<Person> getAllPerson(){
		return personJdbcDao.findAll();
	}

	public Person getPersonById(int id) {
		return personJdbcDao.findById(id);
	}

	public Person createPerson(Person person) {
		int insert = personJdbcDao.insert(person);
		if(insert > 0) {
			return person;
		}
		return null;
	}
}
