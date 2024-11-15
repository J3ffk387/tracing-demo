package com.example.demo.adapter.out.persistence.repository.converter;

import org.springframework.stereotype.Service;

import com.example.demo.adapter.out.persistence.repository.po.OrderPo;
import com.example.demo.application.doamin.model.OrderDo;

@Service("orderConverterOut")
public class OrderConverter {
	
	public OrderPo doToPo(OrderDo orderDo) {
		return OrderPo.builder()
				.orderId(orderDo.getOrderId())
				.sku(orderDo.getSku())
				.amt(orderDo.getAmt())
				.build();
	}

}
