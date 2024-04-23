package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Service;

import com.deliveryboy.constant.AppConstant;

@Service
public class kafkaConfig {
	
	
	@Bean
	public NewTopic newTopic() {
		return TopicBuilder.name(AppConstant.LOCATION)
				.build();
	}

}
