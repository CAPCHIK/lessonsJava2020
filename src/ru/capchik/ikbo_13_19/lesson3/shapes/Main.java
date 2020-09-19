package ru.capchik.ikbo_13_19.lesson3.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Square("red", 123);
        System.out.println(r);
        resize(r, 150);
        System.out.println(r);
    }

    static void resize(Rectangle r, double initSize) {
        r.setWidth(initSize);
        r.setHeight(initSize * 2);
    }
}
