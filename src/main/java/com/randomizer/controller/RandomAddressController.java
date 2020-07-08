package com.randomizer.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randomizer.domain.AddressVO;
import com.randomizer.service.RandomAddressService;

@RestController
public class RandomAddressController {
	
	private static final Logger logger = LoggerFactory.getLogger(RandomAddressController.class);
	
	@Autowired
	RandomAddressService randomAddressService; 
	
	@GetMapping(path="/address")
	public AddressVO getRandomAddress() {	
		logger.debug("Request reached controller");
		return randomAddressService.getRandomAddress() ;
	}
	
	

}
