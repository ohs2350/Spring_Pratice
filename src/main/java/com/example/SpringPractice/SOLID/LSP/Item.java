package com.example.SpringPractice.SOLID.LSP;

public class Item {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void buy() {
        System.out.println("일반 아이템 구매");
    }
}
