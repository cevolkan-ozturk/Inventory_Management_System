package com.cronycommunity.inventorymanagementsystem.api;

import java.util.Arrays;

import java.util.List;

import com.cronycommunity.inventorymanagementsystem.dtos.VInventoryDto;
import com.cronycommunity.inventorymanagementsystem.dtos.VZimmetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cronycommunity.inventorymanagementsystem.business.IZimmetService;
import com.cronycommunity.inventorymanagementsystem.entities.Zimmet;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/zimmet")
public class ZimmetController {
	
	private final IZimmetService zimmetService;
	
	@Autowired 
	public ZimmetController(IZimmetService zimmetService) {
		
		this.zimmetService = zimmetService;
	}
	
	@GetMapping("/")
	public String get() {
		return "Volkan";
	}

	@GetMapping ("/getall")
	public List<Zimmet> getAllZimmet(){
		return this.zimmetService.getAll();
	}
	
	@PostMapping("/add")
	public void addZimmet (@RequestBody Zimmet zimmet) {
		this.zimmetService.add(zimmet);
		
	}
	
	@PostMapping("/update")
	public void updateZimmet (@RequestBody Zimmet zimmet) {
		this.zimmetService.update(zimmet);
	}
	

	@PostMapping("/delete")
	public void deleteZimmet (@RequestBody Zimmet zimmet) {
		this.zimmetService.delete(zimmet);
	}
	

	@GetMapping("/zimmet/{zimmetId}")
	public Zimmet getById(@PathVariable int zimmetId) {
		return this.zimmetService.getById(zimmetId);
	}

	@GetMapping("/getAllView")
	public List<VZimmetDto> getAllView() {
		return this.zimmetService.getAllView();
	}

}

