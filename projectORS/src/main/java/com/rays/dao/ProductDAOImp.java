package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ProductDTO;

@Repository
public class ProductDAOImp extends BaseDAOImpl<ProductDTO> implements ProductDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ProductDTO dto, CriteriaBuilder builder, Root<ProductDTO> qRoot) {

		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (!isEmptyString(dto.getProductName())) {

			System.out.println("ProductName>>>>> " + dto.getProductName());

			whereCondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%'"));
		}

		if (!isEmptyString(dto.getQuantity())) {

			whereCondition.add(builder.like(qRoot.get("quantity"), dto.getQuantity() + "%"));
		}
		if (!isEmptyString(dto.getPrice())) {

			whereCondition.add(builder.like(qRoot.get("price"), dto.getPrice() + "%"));
		}
		if (!isEmptyString(dto.getPaymentMode())) {

			whereCondition.add(builder.like(qRoot.get("paymentMode"), dto.getPaymentMode() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<ProductDTO> getDTOClass() {
		return ProductDTO.class;
	}

}
