package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;

public class EventTest {

	private Event expectedEvent;
	private Long id = 1l;
	private String name = "taka";
	private Date startingDate = new Date();
	private Date endingDate = new Date();
	private EventType type = EventType.FESTIVAL;
	private byte[] picture = null;
	private Set<Person> personsEvent = new HashSet<>();
	private Set<Post> posts = new HashSet<>();

	@Before
	public void init() {
		this.expectedEvent.setEndingDate(endingDate);
		this.expectedEvent.setId(id);
		this.expectedEvent.setName(name);
		this.expectedEvent.setPersonsEvent(personsEvent);
		this.expectedEvent.setPicture(picture);
		this.expectedEvent.setPosts(posts);
		this.expectedEvent.setStartingDate(startingDate);
		this.expectedEvent.setType(type);
	}

	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedEvent.getId();
		// Assert
		Assert.assertEquals(this.id, result);
	}

	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedEvent.getName();
		// Assert
		Assert.assertEquals(this.name, result);
	}

	@Test
	public void testGetStartingDate() {
		// Act
		final Date result = this.expectedEvent.getStartingDate();
		// Assert
		Assert.assertEquals(this.startingDate, result);
	}

	@Test
	public void testGetEndingDate() {
		// Act
		final Long result = this.expectedEvent.getId();
		// Assert
		Assert.assertEquals(this.endingDate, result);
	}

	@Test
	public void testGetType() {
		//Act
		final EventType result = this.expectedEvent.getType();
		//Assert
		Assert.assertEquals(this.type, result);
	}

	@Test
	public void testGetPicture() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPersonsEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosts() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStartingDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEndingDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPicture() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPersonsEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPosts() {
		fail("Not yet implemented");
	}

}
