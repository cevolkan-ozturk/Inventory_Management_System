package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.inventorymanagementsystem.dal.IInventoryDal;
import com.cronycommunity.inventorymanagementsystem.dal.IUserDal;
import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;


@Service
public  class InventoryManager implements IInventoryService {
	
	private IInventoryDal inventoryDal;
	
	@Autowired 
	public InventoryManager(IInventoryDal inventoryDal) {
		this.inventoryDal = inventoryDal;
		
	}
	
	@Override
	public List<Inventory> getAll() {
		return this.inventoryDal.getAll();
		
		
	}
	
	@Override
	@Transactional 
	public void add (Inventory inventory ) {
		this.inventoryDal.add(inventory);
		
	}
	
	@Override
	@Transactional 
	public void update (Inventory inventory ) {
		this.inventoryDal.update(inventory);
		
	}
	
	@Override
	@Transactional 
	public void delete (Inventory inventory ) {
		this.inventoryDal.delete(inventory);
		
	}
	@Override
	@Transactional
	public void deleteByInventoryId(int inventoryId)
	{
		this.inventoryDal.deleteByInventoryId(inventoryId);
	}
	
	@Override
	public Inventory getById (int inventoryId ) {
		return this.inventoryDal.getById(inventoryId);
				
	}
	
	@Override
	public List<VInventoryDto> getAllView()
	{
			return this.inventoryDal.getAllView();
	}
	

}
