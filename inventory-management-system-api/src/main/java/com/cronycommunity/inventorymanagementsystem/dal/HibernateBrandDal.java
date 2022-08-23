package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;



import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.inventorymanagementsystem.entities.Brand;

@Repository
public class HibernateBrandDal implements IBrandDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateBrandDal(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	
	@Override 
	@Transactional
	public List<Brand> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Brand> brand = session.createQuery("from Brand", Brand.class).getResultList();
		return brand;
			
	}
	
@Override
@Transactional
public void add(Brand brand) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(brand);
	
}


@Override
@Transactional
public void update(Brand brand) {
	Session session = entityManager.unwrap(Session.class);
	session.saveOrUpdate(brand);
	
}



@Override
@Transactional
public void delete(Brand brand) {
	Session session = entityManager.unwrap(Session.class);
	Brand willdeleteBrand = session.get(Brand.class, brand.getMarkaId());
	session.delete(willdeleteBrand);
	
}


@Override
public Brand getById (int markaId) {
	Session session = entityManager.unwrap(Session.class);
	Brand brand = session.get(Brand.class, markaId);
	return brand;
		
}
		

		
	}
	
	


