package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

public interface EntityDAO<E, ID> {
	
	public Iterable<E> findAll();
	public E findById(ID id);
	public Iterable<E> findByIds(Iterable<ID> ids);
	public E save(E e);
	public Iterable<E> save(Iterable<E> e);
	public E update(E e);
	public Iterable<E> update(Iterable<E> e);
	public void remove(E e);
}
