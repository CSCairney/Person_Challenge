package com.qa.Person;

public class Person {
	
	String Name;
	Integer Age;
	String Title;
	
	public Person(){}
	
	public Person(String Name, Integer Age, String Title) {
		this.Name = Name;
		this.Age = Age;
		this.Title = Title;
		
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", Title=" + Title + "]";
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	
}
