package com.cronycommunity.inventorymanagementsystem.api;

import java.util.Arrays;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cronycommunity.inventorymanagementsystem.business.IInventoryService;
import com.cronycommunity.inventorymanagementsystem.business.IUserService;
import com.cronycommunity.inventorymanagementsystem.business.IBrandService;
import com.cronycommunity.inventorymanagementsystem.business.ITypeService;
import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;
import com.cronycommunity.inventorymanagementsystem.entities.Brand;
import com.cronycommunity.inventorymanagementsystem.entities.Type;


@RestController
@RequestMapping("/type")
public class TypeController {
	
	private ITypeService typeService;
	
	@Autowired 
	public TypeController(ITypeService typeService) {
		
		this.typeService = typeService;
	}
	

	@GetMapping("/")
	public String get() {
		return "Telefon";
	}
	
	
	@GetMapping ("/getall")
	public List<Type> getall(){
		return this.typeService.getAll();
	}
	
	@PostMapping("/add")
	public void addType (@RequestBody Type type) {
		this.typeService.add(type);
		
	}
	
	@PostMapping("/update")
	public void updateType (@RequestBody Type type) {
		this.typeService.update(type);
			
	}
	

	@PostMapping("/delete")
	public void deleteType (@RequestBody Type type) {
		this.typeService.delete(type);
			
	}
	

	@GetMapping("/type/{typeId}")
	public Type getById(@PathVariable int typeId) {
		return this.typeService.getById(typeId);
			
	}
	
	@GetMapping("/getalltest")
	public Object[] getAllTest() {
		return Arrays.asList("Desktop","Keyboard","Stands").stream().toArray();
			
	}
	

}

