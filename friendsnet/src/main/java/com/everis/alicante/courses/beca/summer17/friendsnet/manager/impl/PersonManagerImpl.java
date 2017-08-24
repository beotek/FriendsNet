package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;

@Service
public class PersonManagerImpl implements PersonManager<Person,Long>{
	@Autowired
	private PersonDAO personDao;

	@Override
	public Iterable<Person> findAll() {
		
		return personDao.findAll();
	}

	@Override
	public Person findById(Long id) {
		
		return personDao.findById(id);
	}

	@Override
	public Person save(Person e) {
		return personDao.save(e);
	}

	@Override
	public Iterable<Person> save(Iterable<Person> e) {
		return personDao.save(e);
	}

	@Override
	public Person update(Person e) {
		return personDao.update(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> e) {
		return personDao.update(e);
	}

	@Override
	public void remove(Person e) {
		personDao.remove(e);
		
	}

	@Override
	public Person relatePersons(Long id, Iterable<Long> persons) {
//		Person person = personDao.findById(id);
//	    personDao.relatePersons(person, persons);
		return null;
	}


}
