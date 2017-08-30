package com.everis.alicante.courses.beca.summer17.friendsnet.entity;



import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupTest {

	private Group expectedGroup;
	private Long id=1l;
	private String name="taka";
	private Set<Person> personsInGroup = new HashSet<>();
	private byte[] picture = null;

	@Before
	public void init() {
		this.expectedGroup = new Group();
		this.expectedGroup.setId(id);
		this.expectedGroup.setName(name);
		this.expectedGroup.setPersonsInGroup(personsInGroup);
		this.expectedGroup.setPicture(picture);
	}

	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedGroup.getId();
		// Assert
		Assert.assertEquals(this.id, result);
	}

	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedGroup.getName();
		// Assert
		Assert.assertEquals(this.name, result);
	}

	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedGroup.getPicture();
		// Assert
		Assert.assertEquals(this.picture, result);
	}

	@Test
	public void testGetPersonsInGroup() {
		// Act
		final Set<Person> result = this.expectedGroup.getPersonsInGroup();
		// Assert
		Assert.assertEquals(this.personsInGroup, result);
	}

	@Test
	public void testSetId() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setId(id);
		// Assert
		Assert.assertEquals(id, group.getId());
	}

	@Test
	public void testSetName() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setName(name);
		// Assert
		Assert.assertEquals(name, group.getName());
	}

	@Test
	public void testSetPicture() {
		//Arrange
		final Group group = new Group();
		//Act
		group.setPicture(picture);
		//assert
		Assert.assertEquals(picture, group.getPicture());
	}

	@Test
	public void testSetPersonsInGroup() {
		//Arrange
		final Group group = new Group();
		//Act
		group.setPersonsInGroup(personsInGroup);
		//assert
		Assert.assertEquals(personsInGroup, group.getPersonsInGroup());
	}


	@Test
	public void testGroup() {
		// Assert
		Assert.assertNotNull(expectedGroup);;
	}

}
