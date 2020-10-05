package ru.capchik.ivbo_07_19.lesson5;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Salon salon = new Salon();
        Random r = new Random(123);

        for (int i = 0; i < 50; i++) {
            salon.addCar(new Car(
                    "Tesla",
                    "Cybertrack",
                    2021 + r.nextInt(20),
                    r.nextInt(50_000)
            ));
        }
        salon.doSomethingWithCars(
                new YearSelector(2024, 2026),
                (car, i) -> System.out.println("car " + i + ":" + car));
        int m = 56000;
        salon.doSomethingWithCars(new CarSelector() {
            @Override
            public boolean isNeedCar(Car car) {
                return car.getMileage() < m;
            }
        }, new CarHandler() {
            @Override
            public void handleCar(Car car, int index) {
                System.out.println("=====" + index + "======");
                System.out.println(car);
            }
        });
        ArrayList<Car> selection = new ArrayList<>();
        salon.doSomethingWithCars(
                car -> car.getMileage() > 5_600,
                (car, i) -> selection.add(car));
        System.out.println(selection);


        CarSelector selector = car -> car.getMileage() > 25_600;
        salon.doSomethingWithCars(
                selector,
                Main::doSome);
    }

    static void doSome(Car car, int index) {
        System.out.println("++++++" + index + "++++");
        System.out.println(car);
    }
}
