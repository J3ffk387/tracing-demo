package com.example.demo.application.port.in;

import com.example.demo.application.doamin.model.InventoryDo;

public interface GetInventoryUseCase {

	InventoryDo getInventory(String sku);

}
