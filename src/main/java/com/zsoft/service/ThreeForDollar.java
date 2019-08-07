package com.zsoft.service;

import com.zsoft.entity.Product;

public class ThreeForDollar implements DiscountPriceCalculation {

    public double applyPriceCalculation(Product product, int quantity) {

        int qt = quantity / 3; // qt c'est le nombre de groupe de trois
        int modQuantity = quantity % 3; // modQuantity c'est la quantité qui reste après le regrouppement

        double finalPrice = ( qt + product.getPrice() * modQuantity ) / quantity;

        return finalPrice;
    }
}
