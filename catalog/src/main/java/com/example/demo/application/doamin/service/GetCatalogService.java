package com.example.demo.application.doamin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.doamin.model.CatalogDo;
import com.example.demo.application.port.in.GetCatalogUseCase;
import com.example.demo.application.port.out.LoadCatalogPort;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GetCatalogService implements GetCatalogUseCase {
	
	@Autowired
	LoadCatalogPort loadCatalogPort;
	
	@Override
	public List<CatalogDo> getAllCatalog() {
		log.info("Catalogs loaded");
		return loadCatalogPort.getAllCatalog();
	}

	@Override
	public CatalogDo getCatalog(String sku) {
		log.info("Catalog id:{} loaded",sku);
		return loadCatalogPort.getCatalog(sku);
	}

}
