package ru.capchik.ivbo_11_19.lesson8.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int age;
        String name;
        int height;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        String[] tokens = line.split(" ");
        if (tokens.length != 3) {
            System.out.println("Need 3 args");
            return;
        }
        try {
            age = Integer.parseInt(tokens[0]);
        } catch (NumberFormatException nfe) {
            System.out.println("incorrect age");
            return;
        }
        name = tokens[1];
        try {
            height = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException nfe) {
            System.out.println("incorrect height");
            return;
        }
        System.out.println(age + "-" + name + "-" + height);

        line = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?<age>\\d+) (?<name>\\w+) (?<height>\\d+)$");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
            age = Integer.parseInt(matcher.group("age"));
            name = matcher.group("name");
            height = Integer.parseInt(matcher.group("height"));
            System.out.println(age + "/" + name + "/" + height);
        } else {
            System.out.println("Incorrect pattern");
        }
    }
}
