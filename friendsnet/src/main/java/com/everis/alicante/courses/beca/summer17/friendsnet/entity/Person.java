package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;


@Data
@Entity
public  class Person implements FNEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String surname;
	private byte[] picture;
	
	@Getter(lazy=true)
	private final Set<Person> persons=new HashSet<>();
}
