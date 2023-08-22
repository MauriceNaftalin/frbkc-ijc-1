package org.frbkc.ijc;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Employee highestPaid() {
        Employee highestFoundSoFar = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > highestFoundSoFar.getSalary()){
                highestFoundSoFar = e;
            }
        }
        return highestFoundSoFar;
    }

    public Employee[] getLowPaidEmployees(int salary) {
        Employee[] returnArray = new Employee[employees.length];
        int countSoFar = 0;
        for (Employee e : employees) {
            if (e.getSalary() < salary) {
                returnArray[countSoFar] = e;
                countSoFar = countSoFar + 1;
            }
        }
        return returnArray;
    }
}
