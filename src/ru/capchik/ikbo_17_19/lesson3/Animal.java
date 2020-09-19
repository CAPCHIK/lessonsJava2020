package ru.capchik.ikbo_17_19.lesson3;

public abstract class Animal extends Object {
    private double age;
    private String name;

    public Animal(double age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract String voice();

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
