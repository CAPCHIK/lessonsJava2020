package ru.capchik.ikbo_17_19.lesson5.company;

public class TopManager implements EmployeePosition {

    private Company company;

    public TopManager(Company company){

        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (company.getIncome() > 10_000_000) {
            return baseSalary  + baseSalary * 1.5;
        } else {
            return  baseSalary;
        }
    }

    @Override
    public double getIncomeToCompany() {
        return 0;
    }
}
