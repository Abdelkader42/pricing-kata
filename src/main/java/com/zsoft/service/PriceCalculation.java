package com.zsoft.service;


import com.zsoft.entity.ProductListing;
import com.zsoft.entity.Quantity;

public interface PriceCalculation {
    /**
     Calculate price after discount
     @param itemProduct Product
     @param quantity  Quantity
     @return price in Euro
     */
    double applyPriceCalculation(ProductListing itemProduct, Quantity quantity);
}