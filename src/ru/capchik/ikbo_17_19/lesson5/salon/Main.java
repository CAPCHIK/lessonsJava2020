package ru.capchik.ikbo_17_19.lesson5.salon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        LocalDateTime date = LocalDateTime.of(1998, 05, 28, 23, 45);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        System.out.println(formatter.format(date));
        long l = 79161853166L;

        Salon salon = new Salon();
        Random random = new Random(123);
        for (int i = 0; i < 500; i++) {
            salon.addCar(new Car(
                    "Lada",
                    "Kalina",
                    2010 + random.nextInt(10),
                    random.nextInt(50000)));
        }
        salon.doSomethingWithSomeCars((CarSelector) (car, i) -> car.getYear() > 2012, new CarHandler() {
            @Override
            public void handle(Car car) {
                System.out.println(car);
            }
        });
        int minYear = 2013;
        salon.doSomethingWithSomeCars(
                (car, i) -> car.getYear() < minYear,
                car -> System.out.println(car.getBrand())
        );
        salon.doSomethingWithSomeCars(
                (car, i) -> car.getYear() < minYear,
                Main::handleCar
        );

    }
    private static void handleCar(Car car) {
        System.out.println("=========");
        System.out.println(car);
        System.out.println("=========");
    }

}
class YearSelector implements CarSelector {
    private int year;
    public YearSelector(int year) {

        this.year = year;
    }
    @Override
    public boolean needCar(Car car, int index) {
        return car.getYear() > year;
    }
}
