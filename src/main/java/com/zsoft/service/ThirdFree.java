package com.zsoft.service;

import com.zsoft.entity.ProductListing;
import com.zsoft.entity.Quantity;

public class ThirdFree implements PriceCalculation {

    /**
     Apply discount of buy tow get one free
     @param itemProduct Product
     @param quantity  Quantity
     @return price in Euro after applying discount of buy tow get one free
     */
    public double applyPriceCalculation(ProductListing itemProduct, Quantity quantity) {
        // create freeQuantity, freeQuantity is the number of groups of 3 items
        int freeQuantity = (int) quantity.getValue() / 3;

        // finalPrice is the total price after discount
        double finalPrice = (itemProduct.getPrice()*quantity.getValue() - itemProduct.getPrice()*freeQuantity );

        return finalPrice;
    }
}
