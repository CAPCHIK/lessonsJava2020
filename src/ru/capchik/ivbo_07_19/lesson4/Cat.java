package ru.capchik.ivbo_07_19.lesson4;

public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }
    @Override
    public String voice() {
        return "May";
    }
}
