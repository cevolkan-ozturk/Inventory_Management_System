package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;



import com.cronycommunity.inventorymanagementsystem.entities.*;

public interface IBrandDal {
	
	List<Brand> getAll();

	void add(Brand brand);
	
	void update (Brand brand);
	
	void delete (Brand brand);
	
	Brand getById (int markaId );
	
	
	
}
