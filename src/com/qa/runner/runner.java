package com.qa.runner;

import com.qa.Person.ListAdder;
import com.qa.Person.Person;

public class runner {

	public static void main(String[] args) {
		
		Person Jordan = new Person("Jordan", 25, "Software Development");
		Person Charlie = new Person("Charlie", 5, "Toddler");
		Person Eve = new Person("Eve", 15, "Engineer");
		Person Kevin = new Person("Kevin", 14, "Student");
		
		ListAdder append = new ListAdder();
		
		append.addPerson(Kevin);
		append.addPerson(Eve);
		append.addPerson(Charlie);
		append.addPerson(Jordan);
		
		append.printList();
		
		System.out.println(append.nameFinder("kEVIN"));
	
	}
}


