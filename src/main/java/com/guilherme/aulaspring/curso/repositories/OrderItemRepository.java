package com.guilherme.aulaspring.curso.repositories;

import com.guilherme.aulaspring.curso.entities.OrderItem;
import com.guilherme.aulaspring.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
