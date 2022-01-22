package com.restapplication.FirstRestApp.controllers;

import com.restapplication.FirstRestApp.models.AddibleProduct;
import com.restapplication.FirstRestApp.models.Product;
import com.restapplication.FirstRestApp.models.ProductForm;
import com.restapplication.FirstRestApp.repositories.ProductFormRepository;
import com.restapplication.FirstRestApp.repositories.ProductRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepo;
    private final ProductFormRepository productFormRepo;

    @Autowired
    public ProductController(ProductRepository productRepo, ProductFormRepository productFormRepo) {
        this.productRepo = productRepo;
        this.productFormRepo = productFormRepo;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @PostMapping("/product/add")
    @ResponseBody
    public AddibleProduct addProduct(@RequestBody AddibleProduct product){
        productRepo.save(new Product(product.getName()));
        productFormRepo.save(new ProductForm(
                product.getWeight(),
                product.getUsageType(),
                product.getAmount(),
                product.getPrice()
                ));
        return product;

    }


    /*@GetMapping("/product/{productID}/delete")
    @Transactional
    public String deleteProduct(@PathVariable("productID") String productID){
        if(!productRepo.existsById(productID)){
            return "redirect:/";
        }
        productRepo.deleteByProductID(productID);
        return "";
    }*/


}
