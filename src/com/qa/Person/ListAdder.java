package com.qa.Person;

import java.util.ArrayList;
import java.util.List;

public class ListAdder {
	
	List<Person> people = new ArrayList<>();

	public ListAdder() {}
	
	public ListAdder(List<Person> people) {
		this.people = people;
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public void removePerson(Person person) {
		people.remove(person);
	}
	
	public Person nameFinder(String name) {
		for(Person p : people) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		System.out.println("Not in the list");
		return null;
	}
	
	public void printList() {
		for(Person p : people) {
			System.out.println(p);
		}
		
	}
}
