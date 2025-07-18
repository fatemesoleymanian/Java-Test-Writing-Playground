package org.example;

public class Product {
    private String name;
    private int id;
    private double price;
    private int inventory;

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void addInventory() {
        this.inventory ++;
    }
    public void reduceInventory() {
        this.inventory --;
    }
}
