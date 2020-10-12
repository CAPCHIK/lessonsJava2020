package ru.capchik.ivbo_07_19.lesson6;

public class PracticHelp {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Red text example" + ANSI_RESET);
    }
}
