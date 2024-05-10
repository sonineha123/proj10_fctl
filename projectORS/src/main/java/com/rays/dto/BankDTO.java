package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_Bank")
public class BankDTO extends BaseDTO {

	@Column(name = "CUSTOMER_NAME", length = 50)
	private String customerName;

	@Column(name = "BANK_NAME", length = 50)
	private String bankName;

	@Column(name = "ADDRESS", length = 50)
	private String address;

	@Column(name = "CITY", length = 50)
	private String city;

	@Column(name = "STATE", length = 50)
	private String state;

	@Column(name = "PHONE", length = 50)
	private String phone;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getKey() {

		return id + "";
	}

	public String getValue() {
		return bankName;
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