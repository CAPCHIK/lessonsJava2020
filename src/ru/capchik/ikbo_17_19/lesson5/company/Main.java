package ru.capchik.ikbo_17_19.lesson5.company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Employee emp = new Employee("Last", "Name", 150, null);
        Employee emp2 = new Employee("Last2", "Name2", 1500, null);

        System.out.println(company);
        company.hire(emp, new Manager(1000));
        company.hire(emp2, new TopManager(company));
        System.out.println(company);
        company.fire(emp);
        System.out.println(company);
        if (emp.getPosition() == null) {
            System.out.println("Безработный");
        } else {
            System.out.println(emp.getPosition().getJobTitle());
        }

    }

    private static int sum(int a, int b, int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum + a + b;
    }
}
