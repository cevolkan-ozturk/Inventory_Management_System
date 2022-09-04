package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;


import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
import com.cronycommunity.inventorymanagementsystem.dtos.VZimmetDto;
import com.cronycommunity.inventorymanagementsystem.entities.Zimmet;

public interface IZimmetService {
	
	List<Zimmet> getAll();
	
	void add(Zimmet zimmet);
	
	void update(Zimmet zimmet);
	
	void delete(Zimmet zimmet);
	
	Zimmet getById(int zimmetId);

	List<VZimmetDto> getAllView();
}
