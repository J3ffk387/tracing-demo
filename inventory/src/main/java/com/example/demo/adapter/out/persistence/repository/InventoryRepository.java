package com.example.demo.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.adapter.out.persistence.repository.po.InventoryPo;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryPo, String> {

}
