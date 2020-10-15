package ru.capchik.ivbo_11_19.lesson7.lambdas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Showroom salon = new Showroom();
        Random random = new Random(123);
        for (int i = 0; i < 100; i++) {
            Car car = new Car(
                    "Tesla",
                    "Model M",
                    2015 + random.nextInt(10)
            );
            car.addMileage(random.nextInt(100_000));
            salon.addCar(car);
        }
        salon.findCars(new YearSelector(2022), new ConsolePrinter());

        salon.findCars(
                new CarsSelector() {
                   @Override
                   public boolean isNeed(Car car) {
                       return car.getMileage() > 50_000;
                   }
               },
                new CarHandler() {
                    @Override
                    public void handleCar(Car car) {
                        System.out.println(car.getBrand());
                    }
                });
        CarsSelector selector = c -> c.getBrand().startsWith("T");
        salon.findCars(selector, c -> System.out.println(c));
        salon.findCars(
                c -> c.getYear() < 2020 && c.getBrand().startsWith("Tes"),
                car -> System.out.println(car.getMileage()));
    }
}
