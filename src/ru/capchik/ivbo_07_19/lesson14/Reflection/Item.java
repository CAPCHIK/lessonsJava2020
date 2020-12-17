package ru.capchik.ivbo_07_19.lesson14.Reflection;

public class Item {
    private int id;
    private String field;
    private double price;

    public Item(int id, String field, double price) {
        this.id = id;
        this.field = field;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
