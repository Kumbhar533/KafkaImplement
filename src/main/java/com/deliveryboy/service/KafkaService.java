package com.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.constant.AppConstant;

@Service
public class KafkaService {

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		
		this.kafkaTemplate.send(AppConstant.LOCATION,location);
		return true;
		
	}
}
