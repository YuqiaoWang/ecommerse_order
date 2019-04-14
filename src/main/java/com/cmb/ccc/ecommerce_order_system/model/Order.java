package com.cmb.ccc.ecommerce_order_system.model;

import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Order extends Stuff {
    protected String accountId;
    protected Set<String> productsId;
    protected Map<String, Double> productsNumber;

}