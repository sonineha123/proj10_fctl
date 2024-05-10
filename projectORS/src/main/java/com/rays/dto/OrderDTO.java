package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_Order")
public class OrderDTO extends BaseDTO {
	
	@Column(name = "ORDER_ID", length = 50)
	private String orderId;

	@Column(name = "CUSTOMER_NAME", length = 50)
	private String customerName;

	@Column(name = "ITEMS", length = 50)
	private String items;

	@Column(name = "PAYMENT_METHOD", length = 50)
	private String paymentMethod;

	@Column(name = "ORDER_STATUS", length = 50)
	private String orderStatus;
	
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getKey() {

		return id + "";
	}

	public String getValue() {
		return orderStatus;
	}

	public String getUniqueKey() {
		return "customerName";
	}

	public String getUniqueValue() {
		return customerName;
	}

	public String getLabel() {
		return "customerName";
	}

	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("customerName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("customerName", customerName);
		return map;

	}


}
