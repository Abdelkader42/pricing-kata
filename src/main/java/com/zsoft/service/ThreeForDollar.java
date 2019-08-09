package com.zsoft.service;

import com.zsoft.entity.ProductListing;
import com.zsoft.entity.Quantity;

public class ThreeForDollar implements PriceCalculation {

    /**
     Apply discount of three for one Euro
     @param itemProduct Product
     @param quantity  Quantity
     @return total price in Euro after applying discount of three for one Euro
     */
    public double applyPriceCalculation(ProductListing itemProduct, Quantity quantity) {
        // create qt, qt is the number of groups of 3 items
        int qt = (int)quantity.getValue() / 3;

        // modQuantity is the items that are not discounted
        double modQuantity = quantity.getValue() % 3;

        // finalPrice is the total price after discount
        double finalPrice = qt + itemProduct.getPrice() * modQuantity;

        return finalPrice;
    }
}
