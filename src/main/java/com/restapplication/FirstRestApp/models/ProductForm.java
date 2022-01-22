package com.restapplication.FirstRestApp.models;

import com.sun.istack.NotNull;
import jdk.jfr.BooleanFlag;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data

public class ProductForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productFormID;

    @NotNull
    private String weight;
    @NotNull
    private String usageType;
    @NotNull
    private Integer amount;
    @NotNull
    private Integer price;
    @NotNull
    @BooleanFlag
    private Boolean available;
    @ManyToOne
    private Product product;

    public ProductForm(String weight, String usageType, Integer amount, Integer price) {
        this.weight = weight;
        this.usageType = usageType;
        this.amount = amount;
        this.price = price;
    }
}
