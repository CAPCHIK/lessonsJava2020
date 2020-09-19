package ru.capchik.ikbo_13_19.lesson3.shapes;

public class Square extends Rectangle {

    public Square(String color, double size) {
        super(color, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +"}";
    }
}
