package com.zsoft.discount;

import com.zsoft.product.Product;

public class ThreeForDollar implements Discount {

    public double applyDiscount(Product product) {

        double finalPrice = product.getPrice();
        int quantity = product.getQuantity();

        if (product.isDiscount() == true) {
            int qt = quantity / 3;
            int modQuantity = quantity % 3;
            finalPrice = (1 * qt + product.getPrice()*modQuantity)/quantity;
        }
        return finalPrice;
    }
}
