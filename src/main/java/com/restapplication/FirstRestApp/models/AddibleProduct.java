package com.restapplication.FirstRestApp.models;

import com.sun.istack.NotNull;
import jdk.jfr.BooleanFlag;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddibleProduct {

    private String name;
    private String weight;
    private String usageType;
    private Integer amount;
    private Integer price;
    private Boolean available;


}
