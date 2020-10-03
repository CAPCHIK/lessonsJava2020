package ru.capchik.ikbo_17_19.lesson5.salon;

import java.util.ArrayList;

public class Salon {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    public void doSomethingWithSomeCars(CarSelector selector, CarHandler handler) {
        int count = 0;
        for (Car car: cars) {
            if(selector.needCar(car, count)) {
                handler.handle(car);
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
