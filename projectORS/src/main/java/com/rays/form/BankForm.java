package com.rays.form;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;

public class BankForm extends BaseForm{
	
	@NotNull(message = "please enter customtername")
	private String customerName;

	@NotNull(message = "please enter bankname")
	private String bankName;

	@NotNull(message = "please enter address")
	private String address;

	@NotNull(message = "please enter city")
	private String city;

	@NotNull(message = "please enter state")
	private String state;

	@NotNull(message = "please enter phone")
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
	
	@Override
	public BaseDTO getDto() {

		BankDTO dto = initDTO(new BankDTO());
		dto.setCustomerName(customerName);
		dto.setBankName(bankName);
		dto.setAddress(address);
		dto.setCity(city);
		dto.setState(state);
		dto.setPhone(phone);

		return dto;
	}
	
	


}
