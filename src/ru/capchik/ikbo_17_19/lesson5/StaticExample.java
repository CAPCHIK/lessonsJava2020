package ru.capchik.ikbo_17_19.lesson5;

public class StaticExample {

    public static void main(String[] args) {
        ExampleClass ec = new ExampleClass();
        new ExampleClass();
        new ExampleClass();
        new ExampleClass();
        new ExampleClass();
        new ExampleClass();
        ExampleClass ec2 = new ExampleClass();
        ExampleClass ec3 = new ExampleClass();

        new ExampleClass();
        new ExampleClass();

        System.out.println(ec.getId());
        System.out.println(ec2.getId());
        System.out.println(ec3.getId());

    }
}
class ExampleClass {
    private static int count;
    private int id;

    public ExampleClass() {
        id = count++;
    }

    public int getId() {
        return id;
    }


}
