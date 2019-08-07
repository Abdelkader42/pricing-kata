package com.zsoft.service;

import com.zsoft.entity.Product;

public interface DiscountPriceCalculation {
    double applyPriceCalculation(Product product, int quantity);
}