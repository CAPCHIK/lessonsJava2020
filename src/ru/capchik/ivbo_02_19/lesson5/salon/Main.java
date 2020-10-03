package ru.capchik.ivbo_02_19.lesson5.salon;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Salon salon = new Salon();
        Random random = new Random(123);
        for (int i = 0; i < 50; i++) {
            salon.addCar(new Car(
                    "Tesla",
                    "Cybertrack",
                    2020 + random.nextInt(20),
                    random.nextInt(1_000_000)));
        }
        salon.doSomethingWithSomeCars(myLittleCar -> myLittleCar.getBrand().startsWith("T"),
                new CarHandler() {
                    @Override
                    public void handleCar(Car car, int index) {
                        System.out.println("===========" + index + "===========");
                        System.out.println(car);
                    }

                });
        CarSelector selector = myLittleCar -> myLittleCar.getYear() < 2021;
        salon.doSomethingWithSomeCars(
                selector,
                (Car car, int i) -> System.out.println(car.getYear()));
    }
}
