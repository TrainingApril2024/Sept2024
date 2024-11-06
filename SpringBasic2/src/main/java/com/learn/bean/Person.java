package com.learn.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class Person {

	private String name="";
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Entered into init method of Person Class");
	}

	@PreDestroy
	public void destory() {
		System.out.println("Entered into destory Method of Person Class");
	}
}
