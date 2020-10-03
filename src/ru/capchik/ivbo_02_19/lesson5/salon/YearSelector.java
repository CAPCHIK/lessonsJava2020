package ru.capchik.ivbo_02_19.lesson5.salon;

public class YearSelector implements CarSelector {

    private int year;

    public YearSelector(int year) {

        this.year = year;
    }

    @Override
    public boolean needCar(Car car) {
        return car.getYear() > year;
    }
}
