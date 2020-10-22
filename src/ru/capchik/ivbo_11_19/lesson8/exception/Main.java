package ru.capchik.ivbo_11_19.lesson8.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 65 / 0;
        Car car = new Car();

        try {
            car.addMileage(45);
            int newMileage = 7 / 1;
            car.addMileage(newMileage);

            car.addMileage(50);
            car.addMileage(-5);
        } catch (ArithmeticException aex) {
            System.out.println("Incorrect mileage calculation");
            System.out.println(aex.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println("Incorrect mileage");
            System.out.println(e.getMessage());
        }
        System.out.println(car);
    }

}
