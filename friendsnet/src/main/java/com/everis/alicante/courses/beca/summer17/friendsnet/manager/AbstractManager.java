package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

abstract class AbstractManager <E extends FNEntity, ID extends Serializable> implements Manager<E,ID>{

}
