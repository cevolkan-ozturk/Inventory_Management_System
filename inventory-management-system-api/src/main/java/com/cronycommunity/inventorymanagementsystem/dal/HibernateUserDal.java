package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.inventorymanagementsystem.entities.User;

@Repository
public class HibernateUserDal implements IUserDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateUserDal(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	
	@Override 
	@Transactional
	public List<User> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<User> user = session.createQuery("from User", User.class).getResultList();
		return user;
			
	}
	
@Override
@Transactional
public void add(User user) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(user);
	
}


@Override
@Transactional
public void update(User user) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(user);
	
}



@Override
@Transactional
public void delete(User user) {
	Session session = entityManager.unwrap(Session.class);
	User willdeleteUser = session.get(User.class, user.getKullaniciId());
	session.delete(willdeleteUser);
	
}
	@Override
	@Transactional
	public  void deleteByKulaniciId(int kullaniciId)
	{
		Session session = entityManager.unwrap(Session.class);
		User willdeleteUser = session.get(User.class, kullaniciId);
		session.delete(willdeleteUser);

	}

@Override
public User getById (int KullaniciId) {
	Session session = entityManager.unwrap(Session.class);
	User user = session.get(User.class, KullaniciId);
	return user;
		
}
		

		
	}
	
	


