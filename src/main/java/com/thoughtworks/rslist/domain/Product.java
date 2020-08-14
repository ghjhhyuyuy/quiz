package com.thoughtworks.rslist.domain;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by wzw on 2020/8/4.
 */
@Data
public class Product {
    private String productName;
    private double price;
    private String unit;
    private String imgUrl;

}