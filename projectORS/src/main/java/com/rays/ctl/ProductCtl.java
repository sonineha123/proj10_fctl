package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ProductDTO;
import com.rays.form.ProductForm;
import com.rays.service.ProductServiceInt;

@RestController
@RequestMapping(value = "Product")
public class ProductCtl extends BaseCtl<ProductForm, ProductDTO, ProductServiceInt>{

	@Autowired
	public ProductServiceInt productService;

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);
		ProductDTO dto = new ProductDTO();

		List<DropdownList> list = productService.search(dto, userContext);
		res.addResult("productList", list);
		return res;
	}
}
