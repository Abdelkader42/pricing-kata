package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public class ThreeForDollar implements CalculatePrice {

    public double applyPriceCalculation(Product product) {

        int quantity = product.getQuantity();
        int qt = quantity / 3;
        int modQuantity = quantity % 3;

       double finalPrice = (1 * qt + product.getPrice()*modQuantity)/quantity;

        return finalPrice;
    }
}
