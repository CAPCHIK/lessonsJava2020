package ru.capchik.ivbo_02_19.lesson5.salon;

import java.util.ArrayList;

public class Salon {
    private final ArrayList<Car> cars
            = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void doSomethingWithSomeCars(
            CarSelector selector,
            CarHandler handler) {
        int count = 0;
        for(Car car: cars) {
            if(selector.needCar(car)) {
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
