package com.cronycommunity.inventorymanagementsystem.business;


import com.cronycommunity.inventorymanagementsystem.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.inventorymanagementsystem.loginrepository.LoginRepository;


 
 
@Service
public class LoginService{
	@Autowired
	private LoginRepository repo;
	  
	  public User login(String loginName, String parola){
	  User user = repo.findByLoginNameAndParola(loginName, parola);
	   
       return user;
	  }
}
