package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	
	@GetMapping
	public List<Group> getAll(){
		return (List<Group>) this.manager.findAll();
	}
	
	@GetMapping("/{id}")
	public Group getById(Long id) {
		return this.manager.findById(id);
	}
	
	@PostMapping
	public Group create(Group group) {
		return this.manager.save(group);
	}
	
	@PostMapping("/person/{id}")
	public Group getByPersonId(Long id) {
		return null;
	}
	
	@PostMapping("/{id}/relate")
	public Person relate(Long person, List<Long> persons) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void remove(Long id) {
		this.manager.remove(this.manager.findById(id));
	}

}
