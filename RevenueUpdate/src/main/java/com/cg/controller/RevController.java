package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Capstore;
import com.cg.service.RevenueService;

@CrossOrigin("http://localhost:5000")
@RestController
@RequestMapping("/revenue")
public class RevController {
	@Autowired
	RevenueService service;
	@PutMapping("/update/{total}")
	public String update(@PathVariable Double total) {
		try {
		 service.updateCapStoreRevenue(total);}
		catch(Exception e) {
			return e.getMessage();
		}
		 return "Updated";
	}
	
	
	
}
