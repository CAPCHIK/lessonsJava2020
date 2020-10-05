package ru.capchik.ivbo_07_19.lesson3;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }
    @Override
    public String voice() {
        return "Gav";
    }
}
