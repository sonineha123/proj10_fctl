package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BankDTO;

@Repository
public class BankDAOImp extends BaseDAOImpl<BankDTO> implements BankDAOInt {

	@Override
	protected List<Predicate> getWhereClause(BankDTO dto, CriteriaBuilder builder, Root<BankDTO> qRoot) {

		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCustomerName())) {

			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isEmptyString(dto.getBankName())) {

			System.out.println("BankName>>>>> " + dto.getBankName());

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getBankName()));
		}
		if (!isEmptyString(dto.getAddress())) {

			whereCondition.add(builder.equal(qRoot.get("adress"), dto.getAddress()));
		}
		if (!isEmptyString(dto.getCity())) {

			whereCondition.add(builder.equal(qRoot.get("city"), dto.getCity()));
		}

		if (!isEmptyString(dto.getState())) {

			whereCondition.add(builder.equal(qRoot.get("state"), dto.getState()));
		}

		/*
		 * if (!isEmptyString(dto.getPhone())) {
		 * 
		 * whereCondition.add(builder.equal(qRoot.get("phone"), dto.getPhone())); }
		 */

		return whereCondition;
	}

	@Override
	public Class<BankDTO> getDTOClass() {
		return BankDTO.class;
	}

}
