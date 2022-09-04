package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;


import javax.transaction.Transactional;

import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
import com.cronycommunity.inventorymanagementsystem.dtos.VZimmetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.inventorymanagementsystem.dal.IZimmetDal;
import com.cronycommunity.inventorymanagementsystem.entities.Zimmet;


@Service
public  class ZimmetManager implements IZimmetService {
	
	private IZimmetDal zimmetDal;
	
	@Autowired 
	public ZimmetManager(IZimmetDal zimmetDal) {
		this.zimmetDal = zimmetDal;
		
	}
	
	@Override
	public List<Zimmet> getAll() {
		return this.zimmetDal.getAll();
		
		
	}
	
	@Override
	@Transactional 
	public void add (Zimmet zimmet ) {
		this.zimmetDal.add(zimmet);
		
	}
	
	@Override
	@Transactional 
	public void update (Zimmet zimmet ) {
		this.zimmetDal.update(zimmet);
		
	}
	
	@Override
	@Transactional 
	public void delete (Zimmet zimmet ) {
		this.zimmetDal.delete(zimmet);
		
	}
	
	@Override
	public Zimmet getById (int zimmetId ) {
		return this.zimmetDal.getById(zimmetId);
				
	}
@Override
	public List<VZimmetDto> getAllView(){
		return  this.zimmetDal.getAllView();
};

}
