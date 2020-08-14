package com.thoughtworks.rslist.domain;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * Created by wzw on 2020/8/5.
 */
@Data
public class Order {
    private String orderName;
    private String orderPrice;
    private int num;
    private String unit;
}
