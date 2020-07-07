package com.randomizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randomizer.domain.AddressVO;
import com.randomizer.service.RandomAddressService;

@RestController
public class RandomAddressController {
		
	@Autowired
	RandomAddressService randomAddressService; 
	
	@GetMapping(path="/address")
	public AddressVO getRandomAddress() {	
		return randomAddressService.getRandomAddress() ;
	}

}
