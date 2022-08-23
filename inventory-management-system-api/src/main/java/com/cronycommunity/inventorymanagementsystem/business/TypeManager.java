package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.inventorymanagementsystem.dal.ITypeDal;
import com.cronycommunity.inventorymanagementsystem.entities.Type;


@Service
public  class TypeManager implements ITypeService {
	
	private ITypeDal typeDal;
	
	@Autowired 
	public TypeManager(ITypeDal typeDal) {
		this.typeDal = typeDal;
		
	}
	
	@Override
	public List<Type> getAll() {
		return this.typeDal.getAll();
		
		
	}
	
	@Override
	@Transactional 
	public void add (Type type ) {
		this.typeDal.add(type);
		
	}
	
	@Override
	@Transactional 
	public void update (Type type ) {
		this.typeDal.update(type);
		
	}
	
	@Override
	@Transactional 
	public void delete (Type type ) {
		this.typeDal.delete(type);
		
	}
	
	@Override
	public Type getById (int typeId ) {
		return this.typeDal.getById(typeId);
				
	}
	
	
}
