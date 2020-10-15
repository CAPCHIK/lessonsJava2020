package ru.capchik.ivbo_11_19.lesson7.lambdas;

public class ConsolePrinter implements CarHandler {
    @Override
    public void handleCar(Car car) {
        System.out.println("=========");
        System.out.println(car);
        System.out.println("---------");
    }
}
