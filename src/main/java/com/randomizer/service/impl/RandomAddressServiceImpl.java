package com.randomizer.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randomizer.dao.RandomAddressDao;
import com.randomizer.domain.AddressVO;
import com.randomizer.service.RandomAddressService;

@Service
public class RandomAddressServiceImpl implements RandomAddressService {
	
	@Autowired
	RandomAddressDao randomAddressDao;
	
	@Override
	public AddressVO getRandomAddress() {
		
		AddressVO addressVO = new AddressVO();
				
		List<AddressVO> addressVOs = randomAddressDao.getAllAddresses();
		
		if(!addressVOs.isEmpty()) {
			Random rand = new Random();
			int randomNum = rand.nextInt(addressVOs.size());
			System.out.println("Random Number: "+ randomNum);
			
			addressVO = addressVOs.get(randomNum);
		}		
		
		return addressVO;
	}

}
