package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.LikeType;

import lombok.Data;

@Data
@Entity(name="Opinion")
public class Like implements FNEntity{

	@Id
	@GeneratedValue
	private Long id;
	@CreationTimestamp
	private Date creationDate;
	private LikeType type;
	
	
}
