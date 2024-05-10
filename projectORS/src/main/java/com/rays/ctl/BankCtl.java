package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.BankDTO;
import com.rays.form.BankForm;
import com.rays.service.BankServiceInt;

@RestController
@RequestMapping(value = "Bank")
public class BankCtl extends BaseCtl<BankForm, BankDTO, BankServiceInt> {

	@Autowired
	public BankServiceInt bankService;

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);
		BankDTO dto = new BankDTO();

		List<DropdownList> list = bankService.search(dto, userContext);
		res.addResult("bankList", list);
		return res;
	}

}
