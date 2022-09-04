package com.cronycommunity.inventorymanagementsystem.business;

import java.util.List;


import com.cronycommunity.inventorymanagementsystem.entities.User;

public interface IUserService {
	
	List<User> getAll();
	
	void add(User user);
	
	void update(User user);
	
	void delete(User user);

	void deleteByKullaniciId(int kullaniciId);

	User getById(int KullaniciId);

}
