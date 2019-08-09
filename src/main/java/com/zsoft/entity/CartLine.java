package com.zsoft.entity;

import com.zsoft.service.WeightPriceCalculation;

public class CartLine {

    ProductListing product;
    Quantity quantity;

    public CartLine() {
    }

    public CartLine(ProductListing product, Quantity quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void addQuantity(Quantity quantity){

        this.quantity.setValue(this.quantity.getValue() + quantity.getValue());
    }

    public double calculateSubTotal(){

        if (product.getType() == Type.WEIGHT){

            WeightPriceCalculation weightPriceCalculation = new WeightPriceCalculation();
            return weightPriceCalculation.applyPriceCalculation(this.product,this.quantity);

            }
        return this.product.getPrice() * this.quantity.getValue();
        }

    public ProductListing getProduct() {
        return product;
    }

    public void setProduct(ProductListing product) {
        this.product = product;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
}
