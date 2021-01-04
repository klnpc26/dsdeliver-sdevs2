package com.semanadev.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.semanadev.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	@Query("select distinct obj from Order obj join fetch obj.products"
			+ " where obj.status = 0 order by obj.moment asc")
	List<Order> findOrdersWithProducts();
}
