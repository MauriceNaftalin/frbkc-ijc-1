package org.frbkc.ijc;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private Department department;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, int salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", department=" + department + '}';
    }

    @Override
    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
        String[] mynames = this.name.split(" ");
        String[] yournames = o.name.split(" ");
        String myLastName = mynames[1];
        String yourLastName = yournames[1];
        String myFirstName = mynames[0];
        String yourFirstName = yournames[0];
        int compareResult = myFirstName.compareTo(yourFirstName);
        if (compareResult == 0) {
            compareResult = myLastName.compareTo(yourLastName);
        }
        return compareResult;
    }
}


