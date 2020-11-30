package ru.capchik.ivbo_07_19.lesson13;

public abstract class Item {
    private int price;

    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
