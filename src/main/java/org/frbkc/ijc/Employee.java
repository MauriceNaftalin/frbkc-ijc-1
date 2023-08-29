package org.frbkc.ijc;

import java.util.Objects;

public class Employee {
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
}


