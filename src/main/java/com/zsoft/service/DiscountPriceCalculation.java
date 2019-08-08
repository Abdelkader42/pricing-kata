package com.zsoft.service;

import com.zsoft.entity.Product;


public interface DiscountPriceCalculation {
    /**
     Calculate price after discount
     @param product Product
     @param quantity  Quantity
     @return price in Euro
     */
    double applyPriceCalculation(Product product, int quantity);
}