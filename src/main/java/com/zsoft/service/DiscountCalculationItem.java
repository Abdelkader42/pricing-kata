package com.zsoft.service;

import com.zsoft.entity.ItemProduct;
import com.zsoft.entity.Product;
import com.zsoft.entity.Quantity;


public interface DiscountCalculationItem {
    /**
     Calculate price after discount
     @param itemProduct Product
     @param quantity  Quantity
     @return price in Euro
     */
    double applyPriceCalculation(ItemProduct itemProduct, Quantity quantity);
}