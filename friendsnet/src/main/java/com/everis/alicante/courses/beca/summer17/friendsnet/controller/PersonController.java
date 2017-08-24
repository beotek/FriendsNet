package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonManager<Person, Long> manager;
	
	@GetMapping
	public List<Person> getAll(){
		return (List<Person>) manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Person getById(@RequestParam Long l) {
		return manager.findById(l);
	}
	
	@PostMapping
	public Person create(@RequestBody Person p) {
		 manager.save(p);
		 return manager.findById(p.getId());

	}
	
	@PostMapping("{id}/relate")
	public Person relate(@RequestBody Long id, @RequestBody List<Long> persons) {
		return manager.relatePersons(id,persons);
	}
	
	@DeleteMapping("{id}")
	public void remove(Long l) {
		manager.remove(manager.findById(l));
	}
	
}
