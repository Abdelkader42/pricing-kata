package com.zsoft.service;

import com.zsoft.entity.Product;

public class ThreeForDollar implements DiscountPriceCalculation {

    /**
     Apply discount of three for one Euro
     @param product Product
     @param quantity  Quantity
     @return price in Euro after applying discount of three for one Euro
     */
    public double applyPriceCalculation(Product product, int quantity) {

        int qt = quantity / 3;
        int modQuantity = quantity % 3;

        double finalPrice = ( qt + product.getPrice() * modQuantity ) / quantity;

        return finalPrice;
    }
}
