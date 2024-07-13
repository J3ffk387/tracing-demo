package com.example.demo.application.port.out;

import java.util.List;

import com.example.demo.application.doamin.model.CatalogDo;

public interface LoadCatalogPort {
	
	CatalogDo getCatalog(String sku);

	List<CatalogDo> getAllCatalog();

}
