package com.restapplication.FirstRestApp.repositories;

import com.restapplication.FirstRestApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
