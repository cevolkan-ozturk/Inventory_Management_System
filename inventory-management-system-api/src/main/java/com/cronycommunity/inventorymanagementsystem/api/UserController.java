package com.cronycommunity.inventorymanagementsystem.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.cronycommunity.inventorymanagementsystem.business.IUserService;
import com.cronycommunity.inventorymanagementsystem.entities.User;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UserController {
	
	private IUserService userService;
	
	@Autowired 
	public UserController(IUserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping("/")
	public String get() {
		return "Volkan";
	}

	@GetMapping ("/getall")
	public List<User> getAllUsers(){
		return this.userService.getAll();
	}
	
	@PostMapping("/add")
	public void addUser (@RequestBody User user) {
		this.userService.add(user);
		
	}
	
	@PostMapping("/update")
	public void updateUser (@RequestBody User user) {
		this.userService.update(user);
			
	}
	

	@PostMapping("/delete")
	public void deleteUser (@RequestBody User user) {
		this.userService.delete(user);
			
	}

	@DeleteMapping ("/{kullaniciId}")
	public void deleteUser (@PathVariable int kullaniciId) {
		this.userService.deleteByKullaniciId(kullaniciId);

	}
	

	@GetMapping("/user/{kullaniciId}")
	public User getById(@PathVariable int kullaniciId) {
		return this.userService.getById(kullaniciId);
			
	}
	
	@GetMapping("/getalltest")
	public Object[] getAllTest() {
		return Arrays.asList("Desktop","Keyboard","Stands").stream().toArray();
			
	}
	

}

