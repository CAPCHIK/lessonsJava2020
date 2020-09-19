package ru.capchik.ikbo_17_19.lesson3.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Square("red", 45);
        System.out.println(r);
        resize(r, 56);
        System.out.println(r);
    }


    static void resize(Rectangle rect, double initSize) {
        rect.setWidth(initSize);
        rect.setHeight(initSize * 2);
    }
}
