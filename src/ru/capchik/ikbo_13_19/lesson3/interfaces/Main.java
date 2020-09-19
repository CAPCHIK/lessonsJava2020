package ru.capchik.ikbo_13_19.lesson3.interfaces;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(6, 7);
        System.out.println(p);
        p.move(5, -67);
        System.out.println(p);
        Object sc = new SomeClass();
        System.out.println(sc.toString());
    }
}
