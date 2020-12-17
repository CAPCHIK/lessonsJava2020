package ru.capchik.ivbo_07_19.lesson11;

public class Item {
    private int id;
    private String data;
    private boolean isGood;
    private String description;

    public Item(int id, String data, boolean isGood, String description) {
        this.id = id;
        this.data = data;
        this.isGood = isGood;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        System.out.println("Change id");
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        System.out.println("Change data");
        this.data = data;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        System.out.println("Change good");
        isGood = good;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        System.out.println("Change description");
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", isGood=" + isGood +
                ", description='" + description + '\'' +
                '}';
    }
}
