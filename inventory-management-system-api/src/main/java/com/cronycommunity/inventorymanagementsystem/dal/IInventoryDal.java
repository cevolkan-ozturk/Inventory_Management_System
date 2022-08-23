package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;



import com.cronycommunity.inventorymanagementsystem.entities.*;

public interface IInventoryDal {
	
	List<Inventory> getAll();

	void add(Inventory inventory);
	
	void update (Inventory inventory);
	
	void delete (Inventory inventory);
	
	Inventory getById (int inventoryId );
	
	
	
}
