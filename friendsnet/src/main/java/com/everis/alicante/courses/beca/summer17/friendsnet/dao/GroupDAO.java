package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;


public interface GroupDAO extends CrudRepository<Group, Long>{

	
}
