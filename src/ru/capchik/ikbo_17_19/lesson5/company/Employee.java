package ru.capchik.ikbo_17_19.lesson5.company;

public class Employee {
    private String surname;
    private String name;
    private double baseSalary;
    private EmployeePosition position;

    public Employee(String surname, String name, double baseSalary, EmployeePosition position) {
        this.surname = surname;
        this.name = name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", position=" + position +
                '}';
    }
}
