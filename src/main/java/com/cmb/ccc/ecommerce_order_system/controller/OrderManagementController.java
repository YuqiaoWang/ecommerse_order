package com.cmb.ccc.ecommerce_order_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderManagementController {

    @RequestMapping("")
    public String show() {
        return "ordermainpage";
    }

}