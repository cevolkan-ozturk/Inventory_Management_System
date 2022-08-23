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
import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	private IInventoryService inventoryService;
	
	@Autowired 
	public InventoryController(IInventoryService inventoryService) {
		
		this.inventoryService = inventoryService;
	}
	

	@GetMapping("/")
	public String get() {
		return "Laptop";
	}
	
	
	@GetMapping ("/getall")
	public List<Inventory> getall(){
		return this.inventoryService.getAll();
	}
	
	@PostMapping("/add")
	public void addInventory (@RequestBody Inventory inventory) {
		this.inventoryService.add(inventory);
		
	}
	
	@PostMapping("/update")
	public void updateInventory (@RequestBody Inventory inventory) {
		this.inventoryService.update(inventory);
			
	}
	

	@PostMapping("/delete")
	public void deleteInventory (@RequestBody Inventory inventory) {
		this.inventoryService.delete(inventory);
			
	}
	

	@GetMapping("/inventory/{inventoryId}")
	public Inventory getById(@PathVariable int inventoryId) {
		return this.inventoryService.getById(inventoryId);
			
	}
	
	@GetMapping("/getalltest")
	public Object[] getAllTest() {
		return Arrays.asList("Desktop","Keyboard","Stands").stream().toArray();
			
	}
	

}

