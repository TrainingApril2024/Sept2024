package com.learn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personSetterInjection")
public class PersonUsingSetterInjection {

	private String name;
	private int age;
	private String city;

	public String getName() {
		return name;
	}

	@Value("Ram")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value("30")
	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	@Value("Fremont")
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PersonUsingSetterInjection [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
