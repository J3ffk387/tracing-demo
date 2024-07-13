package com.example.demo.application.port.in;

import java.util.List;

import com.example.demo.application.doamin.model.CatalogDo;

public interface GetCatalogUseCase {

	CatalogDo getCatalog(String sku);
	
	List<CatalogDo> getAllCatalog();

}
