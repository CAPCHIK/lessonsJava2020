package ru.capchik.ivbo_07_19.lesson14.Reflection;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Double.compare(item.price, price) == 0 &&
                field.equals(item.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", field='" + field + '\'' +
                ", price=" + price +
                '}';
    }
}
