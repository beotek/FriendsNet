package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO{

	@Override
	public Group addPersons(Iterable<Person> persons) {
		return null;
	}

}
