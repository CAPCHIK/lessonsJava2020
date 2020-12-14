package ru.capchik.ivbo_07_19.lesson15;

class StaticClassExample {

    public static int value;

    static {
        System.out.println("static constructor");
    }

    public StaticClassExample() {
        System.out.println("constructor");
    }
    public StaticClassExample(int value) {
        System.out.println("int constructor");
    }
}

public class StaticClass {
    public static void main(String[] args) {
//        System.out.println(StaticClassExample.value);
        System.out.println("hello world");
        StaticClassExample e = new StaticClassExample(2);
        StaticClassExample e2 = new StaticClassExample();
        StaticClassExample e3 = new StaticClassExample(6);
    }
}
