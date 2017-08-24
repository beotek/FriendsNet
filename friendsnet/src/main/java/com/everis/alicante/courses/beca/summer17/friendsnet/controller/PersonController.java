package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

public class PersonController {

	@Autowired
	private PersonManager<Person, Long> manager;
	
	public List<Person> getAll(){
		return (List<Person>) manager.findAll();
	}
	public Person getById(Long l) {
		return manager.findById(l);
	}
	public Person create(Person p) {
		 manager.save(p);
		 return manager.findById(p.getId());
	}
	public Person relate(String a, List<String> b) {
		return null;
	}
	public void remove(Long l) {
		manager.remove(manager.findById(l));
	}
	
}
