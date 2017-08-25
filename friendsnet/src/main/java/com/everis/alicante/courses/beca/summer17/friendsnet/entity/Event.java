package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;

import lombok.Data;

@Data
@Entity
public class Event implements FNEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date startingDate;
	private Date endingDate;
	private EventType type;
	private byte[] picture;
	
}
