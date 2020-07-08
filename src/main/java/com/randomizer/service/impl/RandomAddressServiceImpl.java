package com.randomizer.service.impl;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randomizer.dao.RandomAddressDao;
import com.randomizer.domain.AddressVO;
import com.randomizer.service.RandomAddressService;

@Service
public class RandomAddressServiceImpl implements RandomAddressService {
	
	private static final Logger logger = LoggerFactory.getLogger(RandomAddressServiceImpl.class);
	
	@Autowired
	RandomAddressDao randomAddressDao;
	
	@Override
	public AddressVO getRandomAddress() {
		
		AddressVO addressVO = new AddressVO();
				
		List<AddressVO> addressVOs = randomAddressDao.getAllAddresses();
		
		if(!addressVOs.isEmpty()) {
			Random rand = new Random();
			int randomNum = rand.nextInt(addressVOs.size());
			logger.debug("Random Index: "+ randomNum);
			
			addressVO = addressVOs.get(randomNum);
		}		
		
		return addressVO;
	}

}
