package com.jlp.meatdistribution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlp.meatdistribution.model.Commodity;
import com.jlp.meatdistribution.repository.ICommodityRepo;

@RestController
@RequestMapping("/api")
public class CommodityController {

	 	@Autowired
	    ICommodityRepo commodityRepository;
	
	 	@GetMapping("/commodities")
	 	public List<Commodity> getAllNotes() {
	 	    return commodityRepository.findAll();
	 	}
	 	
	 	@PostMapping("/add/commodity")
	 	public Commodity createNote(@RequestBody Commodity commodity) {
	 	    return commodityRepository.save(commodity);
	 	}
}
