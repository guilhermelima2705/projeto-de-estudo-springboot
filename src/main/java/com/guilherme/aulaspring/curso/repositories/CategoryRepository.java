package com.guilherme.aulaspring.curso.repositories;

import com.guilherme.aulaspring.curso.entities.Category;
import com.guilherme.aulaspring.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
