package ru.capchik.ikbo_17_19.lesson3.interfaces;

public class Main {
    public static void main(String[] args) {
        Movable p = new MovableCircle("black", 45, 5, 8);
        System.out.println(p);
        p.move(3, -7);
        System.out.println(p);
    }
}
