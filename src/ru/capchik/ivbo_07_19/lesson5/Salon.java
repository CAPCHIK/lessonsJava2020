package ru.capchik.ivbo_07_19.lesson5;

import java.util.ArrayList;

public class Salon {
    private final ArrayList<Car> cars;
    public Salon() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void doSomethingWithCars(
            CarSelector selector,
            CarHandler handler
    ) {
        int count = 0;
        for(Car car : cars) {
            if (selector.isNeedCar(car)) {
                handler.handleCar(car, count);
                count++;
            }
        }
        System.out.println(count);
    }

    @Override
    public String toString() {
        return "Salon{" +
                "cars=" + cars +
                '}';
    }
}
