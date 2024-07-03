package com.pace.springboot.retail.controller;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pace.springboot.retail.bean.Product;

@RestController
public class ProductController {
    ArrayList<Product> productList = new ArrayList<Product>();

  @RequestMapping("/hello")
  public String showHello() {
      return "Hello, Guest..!";

  }

    @RequestMapping("/getProducts")
    public  ArrayList<Product> getAllProducts() {
        productList.add( new Product(1001, "Mobile Phone", 10, 25000) );
        productList.add( new Product(1002, "One Plus Ear Buds", 20, 4000) );
        productList.add( new Product(1003, "HP Laptop i5", 30, 75000) );
        return productList;

    //@RequestBody Send as JSON format to browser