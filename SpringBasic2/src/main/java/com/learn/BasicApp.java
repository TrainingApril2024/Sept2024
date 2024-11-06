package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learn.bean.Person;
import com.learn.bean.PersonUsingConstructorInjection;
import com.learn.bean.PersonUsingFieldInjection;
import com.learn.bean.PersonUsingSetterInjection;

public class BasicApp {
	public static void main(String[] args) {
		// created the application context 
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = (Person) ac.getBean("person");
		
		Person person2 = ac.getBean("person", Person.class);
		
		person.setName("Rahul");
		
		System.out.println(person);
		
		PersonUsingSetterInjection personUsingSetterInjection = ac.getBean(PersonUsingSetterInjection.class);
		System.out.println("Using Setting Injection");
		System.out.println(personUsingSetterInjection);
		
		PersonUsingFieldInjection personUsingFieldInjection = ac.getBean(PersonUsingFieldInjection.class);
		System.out.println("Using Field Injection");
		System.out.println(personUsingFieldInjection);
		
		PersonUsingConstructorInjection personUsingConstructorInjection = ac.getBean(PersonUsingConstructorInjection.class);
		System.out.println("Using Constructor Injection");
		System.out.println(personUsingConstructorInjection);
		
		AbstractApplicationContext abstractApplicationContext = (AbstractApplicationContext) ac;
		abstractApplicationContext.close();
	}
}
