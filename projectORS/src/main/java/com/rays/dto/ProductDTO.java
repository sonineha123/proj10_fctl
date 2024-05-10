package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_Product")
public class ProductDTO extends BaseDTO {

	@Column(name = "PRODUCT_NAME", length = 50)
	private String productName;

	@Column(name = "QUANTITY", length = 50)
	private String quantity;

	@Column(name = "PRICE", length = 50)
	private String price;

	@Column(name = "PAYMENT_MODE", length = 50)
	private String paymentMode;

	@Column(name = "STATUS", length = 50)
	private String status;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKey() {

		return id + " ";
	}

	public String getValue() {
		return productName;
	}

	public String getUniqueKey() {
		return "productName";
	}

	public String getUniqueValue() {
		return productName;
	}

	public String getLabel() {
		return "productName";
	}

	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("productName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("productName", productName);
		return map;

	}

}
