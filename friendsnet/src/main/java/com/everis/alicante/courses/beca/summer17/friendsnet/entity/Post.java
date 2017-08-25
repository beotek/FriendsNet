package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.PostType;

import lombok.Data;

@Data
@Entity
public class Post implements FNEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String text;
	@CreationTimestamp
	private Date creationDate;
	private PostType type;
	private byte[] picture;
}
