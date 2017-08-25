package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;

@Service
public class GroupManagerImpl implements GroupManager{

	@Autowired
	private GroupDAO groupDao;
	
	@Override
	public Iterable<Group> findAll() {
		
		return this.groupDao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return this.groupDao.findById(id);
	}

	@Override
	public Group save(Group e) {
		return this.groupDao.save(e);
	}

	@Override
	public Iterable<Group> save(Iterable<Group> e) {
		return this.groupDao.save(e);
	}

	@Override
	public Group update(Group e) {
		return this.groupDao.update(e);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> e) {
		return this.groupDao.update(e);
	}

	@Override
	public void remove(Group e) {
		this.groupDao.remove(e);
		
	}

	@Override
	public Group addPersons(Iterable<Person> persons) {
		return this.groupDao.addPersons(persons);
	}

}
