package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public interface CalculatePriceSameUnit {
    double applyPriceCalculation(Product product, int quantity);
}