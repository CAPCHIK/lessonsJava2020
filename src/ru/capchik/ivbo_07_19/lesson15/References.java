package ru.capchik.ivbo_07_19.lesson15;

class Some {
    public int value;
}
public class References {
    public static void main(String[] args) {
        Some s1 = new Some();
        s1.value = 45;
        Some s2 = s1;
        s2.value = 68;
        System.out.println(s1.value);
        method(s1);
        System.out.println(s1.value);
        System.out.println(s1 == s2);
        int a = 23;
        int b = a;
        b = 43;
        System.out.println(a);
        System.out.println(b);
    }
    private static void method(Some s) {
        s.value = 54;
    }
}
