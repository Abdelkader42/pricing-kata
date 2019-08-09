package com.zsoft.entity;

import com.zsoft.service.WeightPriceCalculation;

public class CartLine {

    ProductListing productListing;
    Quantity quantity;

    public CartLine() {
    }

    public CartLine(ProductListing productListing, Quantity quantity) {
        this.productListing = productListing;
        this.quantity = quantity;
    }

    public void addQuantity(Quantity quantity){

        this.quantity.setValue(this.quantity.getValue() + quantity.getValue());
    }

    public double calculateSubTotal(){

        if (productListing.getType() == Type.WEIGHT){

            WeightPriceCalculation weightPriceCalculation = new WeightPriceCalculation();
            return weightPriceCalculation.applyPriceCalculation(this);

            }
        return this.productListing.getPrice() * this.quantity.getValue();
        }

    public ProductListing getProductListing() {
        return productListing;
    }

    public void setProductListing(ProductListing productListing) {
        this.productListing = productListing;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
}
