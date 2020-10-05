package ru.capchik.ivbo_07_19.lesson5.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(1990, 4, 29);
        LocalDateTime ldt = LocalDateTime.of(
                1990,
                7,
                12,
                7,
                56
        );
        System.out.println(ld);
        LocalDate another = ld.plusDays(5);
        System.out.println(ld);
        System.out.println(another);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(f.format(ldt));
    }
}
