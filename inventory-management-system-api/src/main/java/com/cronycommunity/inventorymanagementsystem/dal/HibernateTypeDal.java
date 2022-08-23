package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;



import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;
import com.cronycommunity.inventorymanagementsystem.entities.Brand;
import com.cronycommunity.inventorymanagementsystem.entities.Type;

@Repository
public class HibernateTypeDal implements ITypeDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateTypeDal(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	
	@Override 
	@Transactional
	public List<Type> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Type> type = session.createQuery("from Type", Type.class).getResultList();
		return type;
			
	}
	
@Override
@Transactional
public void add(Type type) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(type);
	
}


@Override
@Transactional
public void update(Type type) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(type);
	
}

@Override
@Transactional
public void delete(Type type) {
	Session session = entityManager.unwrap(Session.class);
	Type willdeleteType = session.get(Type.class, type.getTypeId());
	session.delete(willdeleteType);
	
}


@Override
public Type getById (int typeId) {
	Session session = entityManager.unwrap(Session.class);
	Type type = session.get(Type.class, typeId);
	return type;
		
}
		

		
	}
	
	


