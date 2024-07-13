package com.example.demo.adapter.in.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@JsonInclude(Include.NON_NULL)
public class OrderRequestDTO {

	/**
	 * 型號
	 */
	@Schema(example = "SN0001", defaultValue = "SN0001")
	private String sku;

	/**
	 * 數量
	 */
	@Schema(example = "5", defaultValue ="5")
	private int amt;
}
