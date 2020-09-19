package ru.capchik.ikbo_13_19.lesson3;

public class Dog extends Animal {

    public Dog(double age, String name) {
        super(age, name);
    }

    @Override
    public String voice() {
        return "Gav";
    }
}
