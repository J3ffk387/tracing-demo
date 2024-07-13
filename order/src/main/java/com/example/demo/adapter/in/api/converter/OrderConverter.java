package com.example.demo.adapter.in.api.converter;

import org.springframework.stereotype.Service;

import com.example.demo.adapter.in.api.dto.OrderRequestDTO;
import com.example.demo.application.doamin.model.OrderDo;

@Service("orderConverterIn")
public class OrderConverter {

	public OrderDo dtoToDo(OrderRequestDTO orderRequestDTO) {
		return OrderDo.builder()
				.sku(orderRequestDTO.getSku())
				.amt(orderRequestDTO.getAmt())
				.build();
	}
}
