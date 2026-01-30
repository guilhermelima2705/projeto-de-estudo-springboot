package com.guilherme.aulaspring.curso.repositories;

import com.guilherme.aulaspring.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
