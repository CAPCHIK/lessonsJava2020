package ru.capchik.ivbo_07_19.lesson15;



public class Fields {
    public int value;
    public String stringValue;
    public static void main(String[] args) {
        System.out.println(new Fields().value);
        System.out.println(new Fields().stringValue);
        int b;
        Fields f = null;
//        System.out.println(b);
        System.out.println(f.value);
    }
}
