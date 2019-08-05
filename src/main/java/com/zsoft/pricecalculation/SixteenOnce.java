package com.zsoft.discount;

import com.zsoft.product.Product;

public class SixteenOnce implements Discount {
    public double applyDiscount(Product product) {
        double finalPrice = product.getPrice()/16;
        return finalPrice;
    }
}
