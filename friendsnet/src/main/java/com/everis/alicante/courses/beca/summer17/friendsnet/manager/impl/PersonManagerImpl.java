package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@Service
public class PersonManagerImpl implements PersonManager{
	@Autowired
	private PersonDAO personDao;

	@Override
	public Iterable<Person> findAll() {
		
		return this.personDao.findAll();
	}

	@Override
	public Person findById(Long id) {
		
		return this.personDao.findOne(id);
	}

	@Override
	public Person save(Person e) {
		return this.personDao.save(e);
	}

	@Override
	public Iterable<Person> save(Iterable<Person> e) {
		return this.personDao.save(e);
	}

	@Override
	public Person update(Person e) {
		return this.personDao.save(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> e) {
		return this.personDao.save(e);
	}

	@Override
	public void remove(Person e) {
		this.personDao.delete(e);
		
	}

	@Override
	public Person relatePersons(Long id, Long id2) {
		final Person person = personDao.findOne(id);
		final Person friend = personDao.findOne(id2);
		person.getPersons().add(friend);
		friend.getPersons().add(person);
		return personDao.save(person);
	}


}
