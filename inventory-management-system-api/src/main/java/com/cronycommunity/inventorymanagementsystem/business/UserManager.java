package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.inventorymanagementsystem.dal.IUserDal;
import com.cronycommunity.inventorymanagementsystem.entities.User;


@Service
public  class UserManager implements IUserService {
	
	private IUserDal userDal;
	
	@Autowired 
	public UserManager(IUserDal userDal) {
		this.userDal = userDal;
		
	}
	
	@Override
	public List<User> getAll() {
		return this.userDal.getAll();
		
		
	}
	
	@Override
	@Transactional 
	public void add (User user ) {
		this.userDal.add(user);
		
	}
	
	@Override
	@Transactional 
	public void update (User user ) {
		this.userDal.update(user);
		
	}
	
	@Override
	@Transactional 
	public void delete (User user ) {
		this.userDal.delete(user);
		
	}

	@Override
	@Transactional
	public void  deleteByKullaniciId(int kullaniciId)
	{
		this.userDal.deleteByKulaniciId(kullaniciId);
	}
	
	@Override
	public User getById (int kullaniciId ) {
		return this.userDal.getById(kullaniciId);
				
	}


	
	


}
