package ru.capchik.ivbo_12_19.lesson7.lambdas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        Random random = new Random(123);
        for (int i = 0; i < 100; i++) {
            showroom.addCar(new Car(
                    "Tesla",
                    "Cybertrack",
                    2023 + random.nextInt(15),
                    random.nextDouble() * 100_000
            ));
        }
        showroom.findCars(new YearSelector(2027), new ConsolePrinter());
        int maxYear = 2027;
        showroom.findCars(
                new CarSelector() {
                    @Override
                    public boolean isNeedCar(Car sdfsdf) {
                        return sdfsdf.getYear() > maxYear;
                    }
                },
                new CarHandler() {
                    @Override
                    public void handleCar(Car car) {
                        System.out.println(car.getMileage());
                    }
                });


        CarSelector selector = c ->
                c.getMileage() < 10_000
                        && c.getBrand().startsWith("T");

        showroom.findCars(selector, car -> System.out.println(car.getModel()));
    }
}
