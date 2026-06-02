package com.pselmer.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pselmer.curso.entities.OrderItem;
import com.pselmer.curso.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
