package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

public interface Manager<E, ID> {

	public Iterable<E> findAll();
	public E findById(ID id);
	public void save(E e);
	public void update(E e);
	public void update(Iterable<E> e);
	public void remove(E e);
}
