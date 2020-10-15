package ru.capchik.ivbo_11_19.lesson7.lambdas;


public class YearSelector implements CarsSelector {
    private int year;

    public YearSelector(int year) {
        this.year = year;
    }

    @Override
    public boolean isNeed(Car car) {
        return car.getYear() > year;
    }
}
