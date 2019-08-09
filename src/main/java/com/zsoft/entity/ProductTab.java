package com.zsoft.entity;

import com.zsoft.service.WeightPriceCalculation;

import java.util.HashMap;

import java.util.Map;

public class ProductTab {

    Map<Product,Double> productTable = new HashMap();


    public void addProduct(Product product, Double quantity ){

        productTable.put(product,quantity);
    }

    public void addWeightProduct(WeightProduct weightProduct,Weight weight){


    }

    public double getValue(Product product){

        if (productTable.containsKey(product))

            return productTable.get(product);
        return 0;
    }

    public void addQuantity(Product product, Double quantity){

        if (productTable.containsKey(product)){
            double oldQuantity = getValue(product);
            addProduct(product,oldQuantity + quantity);
        }

    }

    public Map<Product, Double> getProductTable() {
        return productTable;
    }

    public void setProductTable(Map<Product, Double> productTable) {
        this.productTable = productTable;
    }
}
