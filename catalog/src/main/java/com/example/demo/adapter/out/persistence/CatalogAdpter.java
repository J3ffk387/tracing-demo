package com.example.demo.adapter.out.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.adapter.out.persistence.repository.CatalogRepository;
import com.example.demo.adapter.out.persistence.repository.converter.CatalogConverter;
import com.example.demo.application.doamin.model.CatalogDo;
import com.example.demo.application.port.out.LoadCatalogPort;

@Service
public class CatalogAdpter implements LoadCatalogPort{
	
	@Autowired
	CatalogRepository catalogRepository;
	
	@Autowired
	CatalogConverter catalogConverter;

	@Override
	public CatalogDo getCatalog(String sku) {
		return catalogConverter.poToDo(catalogRepository.findById(sku).get());
	}

	@Override
	public List<CatalogDo> getAllCatalog() {
		return catalogConverter.poToDo(catalogRepository.findAll());
	}

}
