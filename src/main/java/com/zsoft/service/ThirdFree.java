package com.zsoft.service;

import com.zsoft.entity.Product;

public class ThirdFree implements DiscountPriceCalculation {

    public double applyPriceCalculation(Product product, int quantity) {

        int freeQuantity = quantity/3; // freeQuantity c'est la quantité des produits gratuits

        double finalPrice = (product.getPrice()*quantity - product.getPrice()*freeQuantity )/quantity;

        return finalPrice;
    }
}
