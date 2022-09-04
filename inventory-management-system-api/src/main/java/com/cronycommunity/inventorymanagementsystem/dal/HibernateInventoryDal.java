package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
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
@Transactional
public void deleteByInventoryId(int inventoryId)
{
	Session session = entityManager.unwrap(Session.class);
	Inventory willdeleteInventory = session.get(Inventory.class, inventoryId);
	session.delete(willdeleteInventory);

}
@Override
public Inventory getById (int inventoryId) {
	Session session = entityManager.unwrap(Session.class);
	Inventory inventory = session.get(Inventory.class, inventoryId);
	return inventory;
		
}
	
@Override
public List<VInventoryDto> getAllView()
{
	String sql ="SELECT e.e_id as inventoryId,DATE_FORMAT(e.kayit_tar,'%d-%m-%Y') as kayitTarihi,e.sis_no as sistemNo,e.t_id as tipId,e.seri_no as seriNo,e.aciklama\n" +
			",m.marka,m.model,t.envanter_adi as envanterAdi,t.genel_tip as genelTip,e.durum  FROM envanter.envanter e \n" +
			"LEFT JOIN envanter.markalar m\n" +
			"on m.m_id=e.m_id\n" +
			"LEFT JOIN envanter.tip t\n" +
			"on t.t_id= e.t_id";

	List<VInventoryDto> dtoList = entityManager.createNativeQuery(sql)
			.unwrap(org.hibernate.Query.class).setResultTransformer(Transformers.aliasToBean(VInventoryDto.class)).list();

	return  dtoList;
	}

}
	
	


