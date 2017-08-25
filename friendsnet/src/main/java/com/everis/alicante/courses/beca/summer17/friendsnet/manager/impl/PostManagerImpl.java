package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PostManager;

@Service
public class PostManagerImpl implements PostManager{

	@Autowired
	private PostDAO postDao;
	
	@Override
	public Iterable<Post> findAll() {
		return this.postDao.findAll();
	}

	@Override
	public Post findById(Long id) {
		return this.postDao.findById(id);
	}

	@Override
	public Post save(Post e) {
		return this.postDao.save(e);
	}

	@Override
	public Iterable<Post> save(Iterable<Post> e) {
		return this.postDao.save(e);
	}

	@Override
	public Post update(Post e) {
		return this.postDao.update(e);
	}

	@Override
	public Iterable<Post> update(Iterable<Post> e) {
		return this.postDao.update(e);
	}

	@Override
	public void remove(Post e) {
		this.postDao.remove(e);
		
	}

	@Override
	public Post addLike(Like like) {
		return this.postDao.addLike(like);
	}

}
