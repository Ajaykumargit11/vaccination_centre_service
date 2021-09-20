package com.htc.vaccination_centre_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.vaccination_centre_service.entity.Centre;
import com.htc.vaccination_centre_service.persistence.CentreInterface;




@RestController
@RequestMapping("/api")
public class CentreController {
	@Autowired
private CentreInterface centreInterface;
	
	
	@GetMapping("/centres/{centreId}") 
	public Centre getCentreById(@PathVariable Long centreId) {
		Centre centre =null;
	
		centre=centreInterface.findById(centreId).get();
		return centre;
		
	}
	@GetMapping("/centres/{centreName}")
	public Centre findBycentreName(@RequestParam String centreName) {

		return centreInterface.findBycentreName(centreName);
	}

 @GetMapping("/centres/{centreAddress}")
	public Centre findBycentreAddress(@RequestParam String centreAddress) {

		return centreInterface.findBycentreAddress(centreAddress);
	}

 @GetMapping("/centres/{pincode}")
	public Centre findBypincode(@RequestParam Long pincode) {

		return centreInterface.findBypincode(pincode);
	}
	
	@GetMapping("/centres")
	public List<Centre> getAllCentres(){
		return centreInterface.findAll();
	}
	
	
}