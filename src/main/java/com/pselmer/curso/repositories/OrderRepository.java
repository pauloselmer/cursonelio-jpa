package com.pselmer.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pselmer.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
