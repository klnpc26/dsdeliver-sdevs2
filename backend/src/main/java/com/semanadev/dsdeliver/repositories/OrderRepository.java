package com.semanadev.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semanadev.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
