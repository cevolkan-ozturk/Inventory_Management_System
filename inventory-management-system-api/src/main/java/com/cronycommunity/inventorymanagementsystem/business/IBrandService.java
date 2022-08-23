package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;



import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;
import com.cronycommunity.inventorymanagementsystem.entities.Brand;

public interface IBrandService {
	
	List<Brand> getAll();
	
	void add(Brand brand);
	
	void update(Brand brand);
	
	void delete(Brand brand);
	
	Brand getById(int markaId);

}
