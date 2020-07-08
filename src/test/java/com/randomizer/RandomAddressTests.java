package com.randomizer;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.randomizer.dao.RandomAddressDao;
import com.randomizer.service.RandomAddressService;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class RandomAddressTests {
	
	@Autowired
	RandomAddressService randomAddressService;
	
	@Autowired
	RandomAddressDao randomAddressDao;  

	@Test
	@DisplayName("Checking if house is not empty and not null")
	void testHouseEmpty() {
		assertNotNull(randomAddressService.getRandomAddress().getHouse());
		assertNotEquals("",randomAddressService.getRandomAddress().getHouse());
	}
	
	@Test
	@DisplayName("Checking if postalCode is alphanumeric")
	void testPostalCodeAlphanumeric() {
		assertTrue(randomAddressService.getRandomAddress().getPostalCode().matches("^[0-9]+$"));
	}
	
	@Test
	@DisplayName("Checking if countryCode is ISO three letter")
	void testCountryCodeISO() {
		assertTrue(randomAddressService.getRandomAddress().getCountryCode().length()==3);
	}
	
	@Test
	@DisplayName("Checking if application root context is /randomizer")
	void testAppRootContext(@Value("${server.servlet.context-path}") String rootContext ) {
		assertTrue("/randomizer".equals(rootContext) );
	}
	
	@Test
	@DisplayName("Address List not empty and not null")
	void testAddressListEmpty() {
		assertTrue(randomAddressDao.getAllAddresses() != null && !randomAddressDao.getAllAddresses().isEmpty() );
	}
	
	@Test
	@DisplayName("Check if list has 10 elements")
	void testAddressListSize() {
		assertTrue(randomAddressDao.getAllAddresses().size() == 10 );
	}
	
	
	
	


}
