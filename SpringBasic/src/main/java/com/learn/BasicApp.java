package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.bean.Person;

public class BasicApp {
	public static void main(String[] args) {
		// created the application context 
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = (Person) ac.getBean("person");
		Person person2 = ac.getBean("person", Person.class);
		
		person.setName("Rahul");
		
		System.out.println(person);
	}
}
