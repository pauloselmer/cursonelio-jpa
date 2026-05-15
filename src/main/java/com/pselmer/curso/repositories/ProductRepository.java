package com.pselmer.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pselmer.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
