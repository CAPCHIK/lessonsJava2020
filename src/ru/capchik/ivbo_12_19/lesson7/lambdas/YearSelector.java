package ru.capchik.ivbo_12_19.lesson7.lambdas;

public class YearSelector implements CarSelector {
    private int year;

    public YearSelector(int year) {
        this.year = year;
    }

    @Override
    public boolean isNeedCar(Car car) {
        return car.getYear() < year;
    }
}
