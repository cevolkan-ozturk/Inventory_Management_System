package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;

@Repository
public class HibernateInventoryDal implements IInventoryDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateInventoryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	
	@Override 
	@Transactional
	public List<Inventory> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Inventory> inventory = session.createQuery("from Inventory", Inventory.class).getResultList();
		return inventory;
			
	}
	
@Override
@Transactional
public void add(Inventory inventory) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(inventory);
	
}


@Override
@Transactional
public void update(Inventory inventory) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(inventory);
	
}


@Override
@Transactional
public void delete(Inventory inventory) {
	Session session = entityManager.unwrap(Session.class);
	Inventory willdeleteInventory = session.get(Inventory.class, inventory.getInventoryId());
	session.delete(willdeleteInventory);
	
}


@Override
public Inventory getById (int inventoryId) {
	Session session = entityManager.unwrap(Session.class);
	Inventory inventory = session.get(Inventory.class, inventoryId);
	return inventory;
		
}
		

		
	}
	
	


