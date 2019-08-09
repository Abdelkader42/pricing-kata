package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public interface CalculatePriceDifferentUnit {
    double applyPriceCalculation(Product product, String unit);
}
