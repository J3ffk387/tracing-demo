package com.example.demo.application.port.out;

import com.example.demo.application.doamin.model.OrderDo;

public interface CheckInventoryPort {

	/**
	 * Check Inventory
	 * @return
	 */
	boolean check(OrderDo orderDo);
	
}
