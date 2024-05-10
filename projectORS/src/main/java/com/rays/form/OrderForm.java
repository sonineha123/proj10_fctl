package com.rays.form;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm {

	@NotNull(message = "please enter orderid")
	private String orderId;

	@NotNull(message = "please enter customername")
	private String customerName;

	@NotNull(message = "please enter items")
	private String items;

	@NotNull(message = "please enter paymentMethod")
	private String paymentMethod;

	@NotNull(message = "please enter orderstatus")
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

	@Override
	public BaseDTO getDto() {

		OrderDTO dto = initDTO(new OrderDTO());
		dto.setOrderId(orderId);
		dto.setCustomerName(customerName);
		dto.setItems(items);
		dto.setPaymentMethod(paymentMethod);
		dto.setOrderStatus(orderStatus);

		return dto;
	}

}
