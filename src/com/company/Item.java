package com.company;

import java.util.ArrayList;

public class Item {

    private String Name;
    private double price;
    private String quantity;
    private String taxable;


    public Item(String name, double price, String quantity, String taxable) {
        Name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public Item() {

    }
}

