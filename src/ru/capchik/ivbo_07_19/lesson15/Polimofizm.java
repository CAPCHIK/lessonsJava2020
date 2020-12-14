package ru.capchik.ivbo_07_19.lesson15;

class Pol {
    public static void DoSome() {

    }
    public static void DoSome(int value) {

    }
    public static void DoSome(String value) {

    }
    public static void DoSome(int value1, String value2) {

    }
}
public class Polimofizm {
    public static void main(String[] args) {
        Pol.DoSome("");
        Pol.DoSome(23);
        Pol.DoSome(45, "asde");
    }
}
