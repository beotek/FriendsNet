package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/event")
@Transactional
public class EventController {

	@Autowired
	private EventManager manager;
	
	@Autowired
	private PersonManager personManager;
	
	@GetMapping
	public List<Event> getAll(){
		return (List<Event>) this.manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Event getById(@RequestParam Long id) {
		return this.manager.findById(id);
	}
	
	@PostMapping("/{id}/person/{idPerson}/add")
	public Event addPerson(@PathVariable Long id,@PathVariable  Long idPerson) {
		Event event = this.manager.findById(id);
		Person person = this.personManager.findById(idPerson);
		event.getPersonsEvent().add(person);
		return event;
	}
	
	@GetMapping("/person/{id}")
	public Set<Event> getByPersonId(@RequestBody Long id){
		Person person = this.personManager.findById(id);
		return person.getEvents();
	}
	@PostMapping
	public Event create(@RequestBody Event event) {
		return this.manager.save(event);
	}
	@DeleteMapping("/{id}")
	public void remove(Long id) {
		this.manager.remove(this.manager.findById(id));
	}
	
	
}
