package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonManager<E,ID> extends Manager<E,ID>{

	public Person relatePersons(Iterable<Person> person);
}
