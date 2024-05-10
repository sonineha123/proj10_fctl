package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BankDAOInt;
import com.rays.dto.BankDTO;

@Service
@Transactional
public class BankServiceImp extends BaseServiceImpl<BankDTO, BankDAOInt> implements BankServiceInt{

}
