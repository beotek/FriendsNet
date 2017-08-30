package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.LikeType;

public class LikeTest {

	private Like likeExpected;
	private Long id = 1l;
	private Date creationDate = new Date();
	private LikeType type = LikeType.LIKE;
	private Person likesByPerson = new Person();
	private Post likesByPost = new Post();

	@Before
	public void init() {
		this.likeExpected = new Like();
		this.likeExpected.setId(id);
		this.likeExpected.setCreationDate(creationDate);
		this.likeExpected.setLikesByPerson(likesByPerson);
		this.likeExpected.setLikesByPost(likesByPost);
		this.likeExpected.setType(type);
	}

	@Test
	public void testGetId() {
		// Act
		final Long result = this.likeExpected.getId();
		// Assert
		Assert.assertEquals(this.id, result);
	}

	@Test
	public void testGetCreationDate() {
		// Act
		final Date result = this.likeExpected.getCreationDate();
		// Assert
		Assert.assertEquals(this.creationDate, result);
	}

	@Test
	public void testGetType() {
		// Act
		final LikeType result = this.likeExpected.getType();
		// Assert
		Assert.assertEquals(this.type, result);
	}

	@Test
	public void testGetLikesByPerson() {
		// Act
		final Person result = this.likeExpected.getLikesByPerson();
		// Assert
		Assert.assertEquals(this.likesByPerson, result);
	}

	@Test
	public void testGetLikesByPost() {
		// Act
		final Post result = this.likeExpected.getLikesByPost();
		// Assert
		Assert.assertEquals(this.likesByPost, result);
	}

	@Test
	public void testSetId() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setId(id);
		// Assert
		Assert.assertEquals(id, like.getId());
		
	}

	@Test
	public void testSetCreationDate() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setCreationDate(creationDate);
		// Assert
		Assert.assertEquals(creationDate, like.getCreationDate());
	}

	@Test
	public void testSetType() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setType(type);
		// Assert
		Assert.assertEquals(type, like.getType());
	}

	@Test
	public void testSetLikesByPerson() {
		//Arrange
		final Like like = new Like();
		//Act
		like.setLikesByPerson(likesByPerson);
		//Assert
		Assert.assertEquals(likesByPerson, like.getLikesByPerson());
	}

	@Test
	public void testSetLikesByPost() {
		//Arrange
		final Like like = new Like();
		//Act
		like.setLikesByPost(likesByPost);
		//Assert
		Assert.assertEquals(likesByPost,like.getLikesByPost());
		
	}

}
