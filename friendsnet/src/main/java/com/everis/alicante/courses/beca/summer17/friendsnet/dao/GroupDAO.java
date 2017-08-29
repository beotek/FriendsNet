package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;


@Service
public interface GroupDAO extends CrudRepository<Group, Long>{

	
}
