package com.example.demo.adapter.out.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.application.doamin.model.OrderDo;
import com.example.demo.application.port.out.CheckInventoryPort;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CheckInventoryAdapter implements CheckInventoryPort {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${services.inventory}")
	private String inventroyResourceURL;
	
	@Override
	public boolean check(OrderDo orderDo) {
		String inventroyURL = new StringBuilder()
				.append(inventroyResourceURL)
				.append(orderDo.getSku())
				.toString();
		log.info("Check Inventory URL:{}",inventroyURL);
		restTemplate.getForObject(inventroyURL, String.class);
		log.info("Check Inventory :{}",orderDo.getSku());
		return true;
	}

}
