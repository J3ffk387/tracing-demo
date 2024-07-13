package com.example.demo.application.port.out;

import com.example.demo.application.doamin.model.InventoryDo;

public interface LoadInventoryPort {
	
	InventoryDo getInventory(String sku);

}
