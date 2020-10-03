package ru.capchik.ikbo_17_19.lesson5.console_input;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] values = a.split(" ");
        for (String val: values) {
            System.out.println(val);
        }
        System.out.println();
    }
}
