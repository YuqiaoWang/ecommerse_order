package com.cmb.ccc.ecommerce_order_system.model;

import org.springframework.stereotype.Component;

public class Article {
    private String title;
    private String content;
    private String url;

    public Article(String title, String content, String url) {
        this.title = title;
        this.content = content;
        this.url = url;
    }
}