package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;


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
		
		return this.personDao.findById(id);
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
		return this.personDao.update(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> e) {
		return this.personDao.update(e);
	}

	@Override
	public void remove(Person e) {
		this.personDao.remove(e);
		
	}

	@Override
	public Person relatePersons(Long id, Iterable<Long> personsIds) {
		Person person = personDao.findById(id);
		Set<Person> persons = (Set<Person>) personDao.findByIds(personsIds);
		person.getPersons().addAll(persons);
		return person;
	}


}
