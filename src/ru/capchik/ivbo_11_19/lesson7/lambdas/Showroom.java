package ru.capchik.ivbo_11_19.lesson7.lambdas;

import java.util.ArrayList;

public class Showroom {
    private ArrayList<Car> cars;

    public Showroom() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void findCars(CarsSelector selector, CarHandler handler) {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (selector.isNeed(cars.get(i))) {
                handler.handleCar(cars.get(i));
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    @Override
    public String toString() {
        return "Showroom{" +
                "cars=" + cars +
                '}';
    }
}
