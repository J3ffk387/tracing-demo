package com.example.demo.adapter.out.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.adapter.out.persistence.repository.OrderRepository;
import com.example.demo.adapter.out.persistence.repository.converter.OrderConverter;
import com.example.demo.application.doamin.model.OrderDo;
import com.example.demo.application.port.out.SaveOrderPort;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SaveOrderAdpter implements SaveOrderPort{
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	@Qualifier("orderConverterOut")
	OrderConverter orderConverter;

	@Override
	public void save(OrderDo orderDo) {
		log.info("7788:{}",orderDo.getOrderId());
		orderRepository.save(orderConverter.doToPo(orderDo));
	}

}
