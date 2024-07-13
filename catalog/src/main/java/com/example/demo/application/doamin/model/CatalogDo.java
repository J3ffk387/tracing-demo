package com.example.demo.application.doamin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CatalogDo {
	
	private String sku;	

	private String pruductName;

	private String desc;
	
	private long price;
	
	private String img;
}
