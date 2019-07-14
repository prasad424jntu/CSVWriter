package com.product.productcsvwritter.service;

import org.springframework.kafka.annotation.KafkaListener;

public class CsvAggregatorService {
	
	@KafkaListener(topics="product",containerFactory="kafkaListenerContainerFactory")
	public void consumeMessage(String message) {
		System.out.println("product read from kafka  " + message);
	}

}
