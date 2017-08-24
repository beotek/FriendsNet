package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;
@Service
public class PersonManagerImpl<E extends FNEntity, ID extends Serializable> implements PersonManager<Person,Long>{
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
	public void save(Person e) {
		personDao.save(e);
		
	}

	@Override
	public void update(Person e) {
		personDao.update(e);
		
	}

	@Override
	public void update(Iterable<Person> e) {
		personDao.update(e);
	}

	@Override
	public void remove(Person e) {
		personDao.remove(e);
		
	}

	@Override
	public Person relatePersons(Iterable<Person> person) {
		return personDao.relatePersons(person);
	}


}
