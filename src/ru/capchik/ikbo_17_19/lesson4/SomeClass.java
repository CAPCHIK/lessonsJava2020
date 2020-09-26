package ru.capchik.ikbo_17_19.lesson4;

public class SomeClass {
    public AnotherClass price;
    public SomeClass() {
        price = new AnotherClass();
    }
}

class AnotherClass {
    public int GetSomeValue() {
        return 5;
    }
}

