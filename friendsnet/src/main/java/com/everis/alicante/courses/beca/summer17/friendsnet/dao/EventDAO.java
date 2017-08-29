package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;

public interface EventDAO extends CrudRepository<Event, Long> {

}
