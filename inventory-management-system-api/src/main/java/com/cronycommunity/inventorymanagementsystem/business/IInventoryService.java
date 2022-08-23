package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;

import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;

public interface IInventoryService {
	
	List<Inventory> getAll();
	
	void add(Inventory inventory);
	
	void update(Inventory inventory);
	
	void delete(Inventory inventory);
	
	Inventory getById(int inventoryId);

}
