package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;


import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;
import com.cronycommunity.inventorymanagementsystem.entities.Brand;
import com.cronycommunity.inventorymanagementsystem.entities.Type;

public interface ITypeService {
	
	List<Type> getAll();
	
	void add(Type type);
	
	void update(Type type);
	
	void delete(Type type);
	
	Type getById(int typeId);

}
