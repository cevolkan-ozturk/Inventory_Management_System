package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.inventorymanagementsystem.dal.IBrandDal;
import com.cronycommunity.inventorymanagementsystem.entities.Brand;


@Service
public  class BrandManager implements IBrandService {
	
	private IBrandDal brandDal;
	
	@Autowired 
	public BrandManager(IBrandDal brandDal) {
		this.brandDal = brandDal;
		
	}
	
	@Override
	public List<Brand> getAll() {
		return this.brandDal.getAll();
		
		
	}
	
	@Override
	@Transactional 
	public void add (Brand brand ) {
		this.brandDal.add(brand);
		
	}
	
	@Override
	@Transactional 
	public void update (Brand brand ) {
		this.brandDal.update(brand);
		
	}
	
	@Override
	@Transactional 
	public void delete (Brand brand ) {
		this.brandDal.delete(brand);
		
	}
	
	@Override
	public Brand getById (int markaId ) {
		return this.brandDal.getById(markaId);
				
	}
	
	
	
	


}
