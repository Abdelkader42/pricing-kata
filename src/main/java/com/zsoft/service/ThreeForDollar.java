package com.zsoft.service;

import com.zsoft.entity.ItemProduct;
import com.zsoft.entity.Product;
import com.zsoft.entity.Quantity;

public class ThreeForDollar implements DiscountCalculationItem {

    /**
     Apply discount of three for one Euro
     @param product Product
     @param quantity  Quantity
     @return total price in Euro after applying discount of three for one Euro
     */
    public double applyPriceCalculation(ItemProduct product, Quantity quantity) {

        // create qt, qt is the number of groups of 3 items
        int qt = quantity.getValue() / 3;

        // modQuantity is the items that are not discounted
        int modQuantity = quantity.getValue() % 3;

        // finalPrice is the total price after discount
        double finalPrice = qt + product.getPrice() * modQuantity;

        return finalPrice;
    }
}
