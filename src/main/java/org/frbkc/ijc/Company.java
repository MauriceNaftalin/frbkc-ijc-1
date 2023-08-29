package org.frbkc.ijc;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee highestPaid() {
        Employee highestFoundSoFar = employees.get(0);
        for (Employee e : employees) {
            if (e.getSalary() > highestFoundSoFar.getSalary()){
                highestFoundSoFar = e;
            }
        }
        return highestFoundSoFar;
    }

    public List<Employee> getLowPaidEmployees(int salary) {
        List<Employee> returnList = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getSalary() < salary) {
                returnList.add(e);
            }
        }
        return returnList;
    }
}
