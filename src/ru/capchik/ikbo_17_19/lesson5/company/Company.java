package ru.capchik.ikbo_17_19.lesson5.company;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<Employee>();
    }

    public void hire(Employee employee, EmployeePosition position){
        employees.add(employee);
        employee.setPosition(position);
    }

    public void hireAll(Employee ... employees) {
        for (int i = 0; i < employees.length; i++) {
            this.employees.add(employees[i]);
        }
    }

    public void fire(Employee employee) {
        this.employees.remove(employee);
        employee.setPosition(null);
    }

    public double getIncome() {
        double totalIncome = 0;
        for (int i = 0; i < employees.size(); i++) {
            totalIncome += employees.get(i).getPosition().getIncomeToCompany();
        }
        return totalIncome;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
