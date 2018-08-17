package com.qa.QACinema.repository;


import com.qa.QACinema.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
