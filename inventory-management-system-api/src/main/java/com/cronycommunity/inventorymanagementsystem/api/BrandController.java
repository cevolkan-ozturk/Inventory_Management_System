package com.cronycommunity.inventorymanagementsystem.api;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cronycommunity.inventorymanagementsystem.business.IBrandService;
import com.cronycommunity.inventorymanagementsystem.entities.Brand;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/brand")
public class BrandController {
	
	private IBrandService brandService;
	
	@Autowired 
	public BrandController(IBrandService brandService) {
		
		this.brandService = brandService;
	}
	
	@GetMapping("/")
	public String get() {
		return "Volkan";
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping ("/getall")
	public List<Brand> getAllBrand(){
		return this.brandService.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping("/add")
	public void addBrand (@RequestBody Brand brand) {
		this.brandService.add(brand);
		
	}
	
	@PostMapping("/update")
	public void updateBrand (@RequestBody Brand brand) {
		this.brandService.update(brand);
			
	}
	

	@PostMapping("/delete")
	public void deleteBrand (@RequestBody Brand brand) {
		this.brandService.delete(brand);
			
	}
	

	@GetMapping("/brand/{markaId}")
	public Brand getById(@PathVariable int markaId) {
		return this.brandService.getById(markaId);
			
	}
	
	@GetMapping("/getalltest")
	public Object[] getAllTest() {
		return Arrays.asList("Desktop","Keyboard","Stands").stream().toArray();
			
	}
	

}

