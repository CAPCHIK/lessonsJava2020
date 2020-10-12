package ru.capchik.ivbo_07_19.lesson6;

public class Enums {

    public static void main(String[] args) {
        doSome(SampleEnum.ACTION_ANOTHER);
    }

    public static void doSome(SampleEnum se) {
        System.out.println(se.getField());
        switch (se) {
            case ACTION_ONE:
                System.out.println("One");
                break;
            case ACTION_TWO:
                System.out.println("TWO");
                break;
            case ACTION_ANOTHER:
                System.out.println("LOLKEK");
                break;
        }
    }
}
