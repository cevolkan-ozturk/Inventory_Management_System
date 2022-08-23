package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;



import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.inventorymanagementsystem.entities.Zimmet;

@Repository
public class HibernateZimmetDal implements IZimmetDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateZimmetDal(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	
	@Override 
	@Transactional
	public List<Zimmet> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Zimmet> zimmet = session.createQuery("from Zimmet", Zimmet.class).getResultList();
		return zimmet;
			
	}
	
@Override
@Transactional
public void add(Zimmet zimmet) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(zimmet);
	
}


@Override
@Transactional
public void update(Zimmet zimmet) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(zimmet);
	
}


@Override
@Transactional
public void delete(Zimmet zimmet) {
	Session session = entityManager.unwrap(Session.class);
	Zimmet willdeleteZimmet = session.get(Zimmet.class, zimmet.getZimmetId());
	session.delete(willdeleteZimmet);
	
}


@Override
public Zimmet getById (int zimmetId) {
	Session session = entityManager.unwrap(Session.class);
	Zimmet zimmet = session.get(Zimmet.class, zimmetId);
	return zimmet;
		
}
		
		
	}
	
	


