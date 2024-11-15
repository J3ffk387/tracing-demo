package com.example.demo.application.doamin.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderDo {
	
	private String orderId;

	private String sku;
	
	private int amt;
	
	public void createOrderId() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedDate = now.format(formatter);
        StringBuilder orderId=new StringBuilder();   
        this.orderId=orderId.append(formattedDate)
             .append("-")
             .append(sku)
             .toString();
	}
}
