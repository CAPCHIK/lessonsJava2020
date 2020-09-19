package ru.capchik.ikbo_17_19.lesson3.interfaces;

import ru.capchik.ikbo_17_19.lesson3.shapes.Circle;

public class MovableCircle extends Circle implements Movable {
    private Point center;
    public MovableCircle(String color, double radius, int x, int y) {
        super(color, radius);
        center = new Point(x, y);
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}
