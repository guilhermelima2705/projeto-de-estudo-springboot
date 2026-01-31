package com.guilherme.aulaspring.curso.repositories;

import com.guilherme.aulaspring.curso.entities.Category;
import com.guilherme.aulaspring.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
