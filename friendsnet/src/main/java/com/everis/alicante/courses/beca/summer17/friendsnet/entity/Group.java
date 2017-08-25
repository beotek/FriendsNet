package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Group implements FNEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private byte[] picture;
	
}