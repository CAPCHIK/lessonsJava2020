package ru.capchik.ivbo_07_19.lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        Car car = new Car();
        try {
            int a = Integer.parseInt(new Scanner(System.in).nextLine());

            car.addMileage(50);
            if (1 == 1) {
                throw new Exception("Hey");
            }
            car.addMileage(-45);
        }
//        catch (IncorrectMileageException ex) {
//            System.out.println("Can't add mileage");
//        }
//        catch (NumberFormatException nfe) {
//            System.out.println("Incorrect input format");
//        }
//        catch (Exception ex) {
//            System.out.println("Strange");
//        }
        finally {
            System.out.println(car);
        }

    }
}
