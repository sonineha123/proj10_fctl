package com.rays.form;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProductDTO;

public class ProductForm extends BaseForm{
	
	@NotNull(message = "please enter productname")
	private String productName;

	@NotNull(message = "please enter quantity")
	private String quantity;

	@NotNull(message = "please enter prize")
	private String price;

	@NotNull(message = "please enter paymentMode")
	private String paymentMode;

	@NotNull(message = "please enter status")
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
	
	@Override
	public BaseDTO getDto() {

		ProductDTO dto = initDTO(new ProductDTO());
		dto.setProductName(productName);
		dto.setQuantity(quantity);
		dto.setPrice(price);
		dto.setPaymentMode(paymentMode);
		dto.setStatus(status);

		return dto;
	}
	

	
}
