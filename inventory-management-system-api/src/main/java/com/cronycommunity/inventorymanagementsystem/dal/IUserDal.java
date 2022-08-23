package com.cronycommunity.inventorymanagementsystem.dal;

import java.util.List;


import com.cronycommunity.inventorymanagementsystem.entities.*;

public interface IUserDal {
	
	List<User> getAll();

	void add(User user);
	
	void update (User user);
	
	void delete (User user);
	
	User getById (int kullaniciId );
	
	
	
}
