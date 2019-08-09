package com.zsoft.service;

import com.zsoft.entity.ItemProduct;
import com.zsoft.entity.Quantity;

public class ThirdFree implements DiscountCalculationItem {

    /**
     Apply discount of buy tow get one free
     @param product Product
     @param quantity  Quantity
     @return price in Euro after applying discount of buy tow get one free
     */
    public double applyPriceCalculation(ItemProduct product, Quantity quantity) {
        // create freeQuantity, freeQuantity is the number of groups of 3 items
        int freeQuantity = quantity.getValue() / 3;

        // finalPrice is the total price after discount
        double finalPrice = (product.getPrice()*quantity.getValue() - product.getPrice()*freeQuantity );

        return finalPrice;
    }
}
