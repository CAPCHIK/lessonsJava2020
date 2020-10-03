package ru.capchik.ikbo_17_19.lesson5.company;

public class Operator implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    @Override
    public double getIncomeToCompany() {
        return 0;
    }
}
