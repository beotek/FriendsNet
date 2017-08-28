package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;


@Data
@Entity
@Table(name="PERSON")
public  class Person implements FNEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private Long id;
	private String name;
	private String surname;
	private byte[] picture;
	
	@Getter(lazy=true)
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "friends", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = {@JoinColumn(name = "person_id") })
	@JsonIgnore
	private final Set<Person> persons=new HashSet<>();
	
	@Getter(lazy=true)
	@ManyToMany(mappedBy = "friends")
	@JsonIgnore
	private final Set<Person> friend = new HashSet<>();
	
	@Getter(lazy=true)
	@ManyToMany(mappedBy = "personsInGroup")
	@JsonIgnore
	private final Set<Group> groups = new HashSet<>();
	
	@Getter(lazy=true)
	@OneToMany(mappedBy = "likesByPerson")
	@JsonIgnore
	private final Set<Like> likes = new HashSet<>();

	@Getter(lazy=true)
	@OneToMany(mappedBy = "postsByPerson")
	@JsonIgnore
	private final Set<Post> posts = new HashSet<>();

	@Getter(lazy=true)
	@ManyToMany(mappedBy = "personsInEvent")
	@JsonIgnore
	private final Set<Event> events = new HashSet<>();
	
}
