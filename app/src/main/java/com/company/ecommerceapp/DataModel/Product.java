package com.company.ecommerceapp.DataModel;

public class Product {
    public Product(String name, String description, double price, String productType, int productID) {
        this.name = name;
        Description = description;
        Price = price;
        this.productType = productType;
        this.productID = productID;
    }

    String name;
    String Description;

    double Price;
    String productType;
    int productID;


    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
