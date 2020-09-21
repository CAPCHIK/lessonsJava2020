package ru.capchik.ivbo_07_19.lesson4;

public abstract class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract String voice();

    @Override
    public String  toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
