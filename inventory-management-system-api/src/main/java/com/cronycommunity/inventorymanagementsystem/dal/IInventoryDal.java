package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;

import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
import com.cronycommunity.inventorymanagementsystem.entities.*;

public interface IInventoryDal {
	
	List<Inventory> getAll();

	void add(Inventory inventory);
	
	void update (Inventory inventory);
	
	void delete (Inventory inventory);

	void deleteByInventoryId(int inventoryId);
	
	Inventory getById (int inventoryId );
	
	List<VInventoryDto> getAllView();
}
