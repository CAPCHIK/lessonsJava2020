package ru.capchik.ivbo_11_19.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Csv {
    public static void main(String[] args) {
        String row = "125, 1962, 31, \"Maximilian Schell\", \"Judgment at Nuremberg\"\n";
        Pattern pattern = Pattern.compile("^(?<index>\\d+), (?<year>\\d+), (?<age>\\d+)");
        Matcher matcher = pattern.matcher(row);

        if (matcher.find()) {
            System.out.println("regex");
            System.out.println(matcher.group(0));
            System.out.println(Integer.parseInt(matcher.group("index")));
            System.out.println(Integer.parseInt(matcher.group("year")));
            System.out.println(Integer.parseInt(matcher.group("age")));
        } else {
            System.out.println("Incorrect pattern");
        }
        System.out.println("split");
        String[] split = row.split(", ");
        for (String arg : split) {
            System.out.println(arg);
        }
    }
}
