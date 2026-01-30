package com.guilherme.aulaspring.curso.repositories;

import com.guilherme.aulaspring.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
