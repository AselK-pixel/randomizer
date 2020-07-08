package com.randomizer.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.randomizer.dao.RandomAddressDao;
import com.randomizer.domain.AddressVO;

@Repository
public class RandomAddressDaoImpl implements RandomAddressDao{
	
	private static final Logger logger = LoggerFactory.getLogger(RandomAddressDaoImpl.class);
	
	@Override
	public List<AddressVO> getAllAddresses(){
		
		List<AddressVO> addressVOs = new ArrayList<AddressVO>();
		
		addressVOs.add(new AddressVO("2987", "NW 8th St.", "33028", "Miami", "Miami Dade", "Florida", "FL", null, "USA"));
		addressVOs.add(new AddressVO("739", "Johnson Ave", "1209", "Montreal", "Montreal", null, null, null, "CAN"));
		addressVOs.add(new AddressVO("1265", "Miramar Parkway", "9830", "Mexico City", "Morelos", null, null, null, "MEX"));
		addressVOs.add(new AddressVO("7683", "SE 5th St.", "1100", "Rotterdam", "Rotterdam", null, null, null, "NLD"));
		addressVOs.add(new AddressVO("1245", "North University St.", "5608", "Kingsville", "Joseph", null, "TX", "United States of America", "USA"));
		addressVOs.add(new AddressVO("5623", "Green Road", "1109", "Ottawa", "Greater Ottawa", "Ontario", null, null, "CAN"));
		addressVOs.add(new AddressVO("39", "Linklon Rd", "33076", "Brooklyn", "New York City", "New York", null, null, "USA"));
		addressVOs.add(new AddressVO("112", "5th St", "3419", "Amsterdam", "Amsterdam", null, null, null, "NLD"));
		addressVOs.add(new AddressVO("9848", "Fair St", "1302", "Vancouver", "Vancouver", null, "BC", "Canada", "CAN"));
		addressVOs.add(new AddressVO("556", "Juan Marco St ", "9437", "Chihuahua", "Chihuahua", null, null, "Mexico", "MEX"));
		
		logger.debug("Loaded list of addresses");
		
		return addressVOs;		
	}

}
