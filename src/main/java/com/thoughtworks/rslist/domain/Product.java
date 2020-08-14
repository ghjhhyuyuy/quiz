package com.thoughtworks.rslist.domain;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * Created by wzw on 2020/8/4.
 */
@Data
public class Product {
    @NotNull
    private String productName;
    @NotNull
    @Digits(integer = 6,fraction = 2)
    private double price;
    @NotNull
    private String unit;
    @NotNull
    private String imgUrl;

}