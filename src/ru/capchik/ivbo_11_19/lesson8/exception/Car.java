package ru.capchik.ivbo_11_19.lesson8.exception;

public class Car {
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void addMileage(int mileage) throws InvalidMileageException {
        if(mileage < 0) {
            throw new InvalidMileageException("mileage must be positive");
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
