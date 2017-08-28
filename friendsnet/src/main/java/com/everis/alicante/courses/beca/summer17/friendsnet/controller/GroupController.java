package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@RestController
@RequestMapping("/group")
@Transactional
public class GroupController {
	
	@Autowired
	private GroupManager manager;
	
	@Autowired
	private PersonManager personManager;

	
	@GetMapping
	public List<Group> getAll(){
		return (List<Group>) this.manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Group getById(@RequestParam Long id) {
		return this.manager.findById(id);
	}
	
	@PostMapping
	public Group create(@RequestBody Group group) {
		return this.manager.save(group);
	}
	
	@GetMapping("/person/{id}")
	public Set<Group> getByPersonId(@RequestParam Long id) {
		Person person = this.personManager.findById(id);
		return person.getGroups();
	}
	
	@PostMapping("/{idGroup}/relate")
	public Group relate(@RequestBody Long idPerson,@RequestBody Long idGroup) {
		Person person = this.personManager.findById(idPerson);
		Group group = this.manager.findById(idGroup);
		group.getPersonsInGroup().add(person);
		return group;
	}
	
	@DeleteMapping("/{id}")
	public void remove(Long id) {
		this.manager.remove(this.manager.findById(id));
	}

}
