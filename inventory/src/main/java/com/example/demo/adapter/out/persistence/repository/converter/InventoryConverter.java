package com.example.demo.adapter.out.persistence.repository.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.adapter.out.persistence.repository.po.InventoryPo;
import com.example.demo.application.doamin.model.InventoryDo;

@Service
public class InventoryConverter {
	
	public InventoryDo poToDo(InventoryPo inventoryPo) {
		return InventoryDo.builder()
				.sku(inventoryPo.getSku())
				.pruductName(inventoryPo.getProductName())
				.amt(inventoryPo.getAmt())
				.build();
	}
	
	public List<InventoryDo> poToDo(List<InventoryPo> inventoryPos) {
		List<InventoryDo> inventoryDos=new ArrayList<>();
		inventoryPos.forEach(item->{
			inventoryDos.add(this.poToDo(item));
		});
		return inventoryDos;
	}

}
