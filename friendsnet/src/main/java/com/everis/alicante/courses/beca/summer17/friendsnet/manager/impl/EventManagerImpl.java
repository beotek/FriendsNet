package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@Service
public class EventManagerImpl implements EventManager{
	
	@Autowired
	private EventDAO eventDao;

	public Iterable<Event> findAll(){
		return this.eventDao.findAll();
	}
	public Event findById(Long id) {
		return this.eventDao.findById(id);
	}
	public Event save(Event event) {
		return this.eventDao.save(event);
	}
	public Iterable<Event> save(Iterable<Event> event){
		return this.eventDao.save(event);
	}
	public Event update(Event event) {
		return this.eventDao.update(event);
	}
	public Iterable<Event> update(Iterable<Event> event){
		return this.eventDao.update(event);
	}
	public void remove(Event event) {
		this.eventDao.remove(event);
	}
	
}
