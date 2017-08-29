package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonDAO extends CrudRepository <Person, Long> {
//
//	Person relatePersons(Long id, List<Long> ids);

	
}
