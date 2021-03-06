package com.example.myapplication;

public class ShoppingItem {
    private String name;
    private String info;
    private String price;
    private int imageResource;

    public ShoppingItem() {
    }

    public ShoppingItem(String name, String info, String price, int imageResource) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getName() {return name; }
    public String getInfo() {return info; }
    public String getPrice() { return price; }
    public int getImageResource() { return imageResource; }
}
