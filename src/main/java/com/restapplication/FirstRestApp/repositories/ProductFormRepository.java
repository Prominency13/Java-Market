package com.restapplication.FirstRestApp.repositories;

import com.restapplication.FirstRestApp.models.ProductForm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFormRepository extends JpaRepository<ProductForm, Long> {

    List<ProductForm> getProductFormByProductName(String name);
}
