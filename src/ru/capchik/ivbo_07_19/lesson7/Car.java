package ru.capchik.ivbo_07_19.lesson7;

public class Car {
    private int mileage;

    public void addMileage(int mileage) throws IncorrectMileageException {
        if (mileage < 0) {
            throw new IncorrectMileageException();
        }
        this.mileage += mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                '}';
    }
}
