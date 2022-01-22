package com.restapplication.FirstRestApp.controllers;

import com.restapplication.FirstRestApp.models.Product;
import com.restapplication.FirstRestApp.models.ProductForm;
import com.restapplication.FirstRestApp.repositories.ProductFormRepository;
import com.restapplication.FirstRestApp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductFormController {

    private final ProductFormRepository productFormRepository;
    private final ProductRepository productRepository;

    @Autowired
    public ProductFormController(ProductFormRepository productFormRepository, ProductRepository productRepository) {
        this.productFormRepository = productFormRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void deleteById(@PathVariable("id") Long productFormID){
        productFormRepository.deleteById(productFormID);
    }

    @GetMapping("/findby/{name}")
    @ResponseBody
    public List<ProductForm> findByName(@PathVariable("name") String name){
        return productFormRepository.getProductFormByProductName(name);
    }




}
