package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dao.OrderDAOInt;
import com.rays.dto.OrderDTO;

@Repository
public class OrderDAOImp extends BaseDAOImpl<OrderDTO> implements OrderDAOInt {
	
	@Override
	protected List<Predicate> getWhereClause(OrderDTO dto, CriteriaBuilder builder, Root<OrderDTO> qRoot) {

		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getOrderId())) {
			
			whereCondition.add(builder.like(qRoot.get("orderId"), dto.getOrderId() + "%"));
		}

		if (!isEmptyString(dto.getCustomerName())) {

			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isEmptyString(dto.getItems())) {

			whereCondition.add(builder.like(qRoot.get("items"), dto.getItems() + "%"));
		}
		if (!isEmptyString(dto.getPaymentMethod())) {

			whereCondition.add(builder.like(qRoot.get("paymentMethod"), dto.getPaymentMethod() + "%"));
		}

		if (!isEmptyString(dto.getOrderStatus())) {

			whereCondition.add(builder.like(qRoot.get("orderStatus"), dto.getOrderStatus() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<OrderDTO> getDTOClass() {
		return OrderDTO.class;
	}


}
