package com.zsoft.service;

import com.zsoft.entity.Product;

public class ThirdFree implements DiscountPriceCalculation {

    /**
     Apply discount of buy tow get one free
     @param product Product
     @param quantity  Quantity
     @return price in Euro after applying discount of buy tow get one free
     */
    public double applyPriceCalculation(Product product, int quantity) {

        int freeQuantity = quantity/3;

        double finalPrice = (product.getPrice()*quantity - product.getPrice()*freeQuantity )/quantity;

        return finalPrice;
    }
}
