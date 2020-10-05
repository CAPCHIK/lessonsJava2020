package ru.capchik.ivbo_07_19.lesson5;

public class YearSelector implements CarSelector {

    private int yearStart;
    private int yearEnd;

    public YearSelector(int yearStart, int yearEnd) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    @Override
    public boolean isNeedCar(Car car) {
        return car.getYear() >= yearStart
                && car.getYear() <= yearEnd;
    }
}
