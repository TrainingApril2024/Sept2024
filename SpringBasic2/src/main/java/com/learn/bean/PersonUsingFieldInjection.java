package com.learn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personFieldInjection")
public class PersonUsingFieldInjection {

	@Value("Ram")
	private String name;

	@Value("30")
	private int age;

	@Value("Fremont")
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PersonUsingSetterInjection [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
