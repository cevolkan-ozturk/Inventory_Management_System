package com.cronycommunity.inventorymanagementsystem.api;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cronycommunity.inventorymanagementsystem.business.IInventoryService;
import com.cronycommunity.inventorymanagementsystem.business.IUserService;
import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
import com.cronycommunity.inventorymanagementsystem.entities.Inventory;
import com.cronycommunity.inventorymanagementsystem.entities.User;

@RestController
@CrossOrigin(origins="*")
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


	@PostMapping("/delete")
	public void deleteInventory (@RequestBody Inventory inventory) {
		this.inventoryService.delete(inventory);
			
	}

	@DeleteMapping ("/{inventoryId}")
	public void deleteInventory (@PathVariable int inventoryId) {
		this.inventoryService.deleteByInventoryId(inventoryId);

	}
	

	@GetMapping("/inventory/{inventoryId}")
	public Inventory getById(@PathVariable int inventoryId) {
		return this.inventoryService.getById(inventoryId);
			
	}
	
	@GetMapping("/getAllView")
	public List<VInventoryDto> getAllView() {
		return this.inventoryService.getAllView();
	}


}

