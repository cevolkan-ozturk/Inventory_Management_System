package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;



import com.cronycommunity.inventorymanagementsystem.entities.*;

public interface ITypeDal {
	
	List<Type> getAll();

	void add(Type type);
	
	void update (Type type);
	
	void delete (Type type);
	
	Type getById (int typeId );
	
	
}
