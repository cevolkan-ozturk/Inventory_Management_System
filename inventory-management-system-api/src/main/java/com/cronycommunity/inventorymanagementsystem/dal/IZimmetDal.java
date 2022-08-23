package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;


import com.cronycommunity.inventorymanagementsystem.entities.*;

public interface IZimmetDal {
	
	List<Zimmet> getAll();

	void add(Zimmet zimmet);
	
	void update (Zimmet zimmet);
	
	void delete (Zimmet zimmet);
	
	Zimmet getById (int zimmetId );
	
	
}
