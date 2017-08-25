package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@RestController
@RequestMapping("/event")
@Transactional
public class EventController {

	@Autowired
	private EventManager manager;
	
	@GetMapping
	public List<Event> getAll(){
		return (List<Event>) this.manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Event getById(@RequestParam Long id) {
		return this.manager.findById(id);
	}
	@GetMapping("/person/{id}")
	public Event addPerson(@RequestParam Long id,@RequestParam  Long id2) {
		return null;
	}
	@PostMapping("/{id}/person/{idPerson}/add")
	public List<Event> getByPersonId(@RequestBody Long id){
		return null;
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
