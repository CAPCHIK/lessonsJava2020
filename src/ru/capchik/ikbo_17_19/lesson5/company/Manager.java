package ru.capchik.ikbo_17_19.lesson5.company;

public class Manager implements EmployeePosition {


    private double incomeToCompany;

    public Manager(double incomeToCompany) {
        this.incomeToCompany = incomeToCompany;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + incomeToCompany * 0.05;
    }
    public double getIncomeToCompany() {
        return incomeToCompany;
    }

    public void setIncomeToCompany(double incomeToCompany) {
        this.incomeToCompany = incomeToCompany;
    }
}
