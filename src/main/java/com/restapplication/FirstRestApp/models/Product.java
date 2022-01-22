package com.restapplication.FirstRestApp.models;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor

public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;
    @NotNull
    @Column(unique = true)
    private String name;
    @OneToMany
    @NotNull
    private List<ProductForm> productForm;

    public Product(String name) {
        this.name = name;
    }
}
