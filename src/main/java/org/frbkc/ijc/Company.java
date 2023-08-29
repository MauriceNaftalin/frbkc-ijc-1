package org.frbkc.ijc;

import java.util.*;

public class Company {
    private List<Employee> employees;

    private Map<String,Department> departmentDirectory;

/*
    public Company(List<Employee> employees) {
        this.employees = employees;
    }
*/

    public Company(List<Employee> employees, Map<String,Department> departmentDirectory) {
        this.employees = employees;
        this.departmentDirectory = departmentDirectory;
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

    public Set<String> getDepartmentNames() {
        Set<String> returnSet = new HashSet<>();
        for (Department dept : departmentDirectory.values()) {
            returnSet.add(dept.getName());
        }
        for (String s : departmentDirectory.keySet()) {
            departmentDirectory.get(s).getName();
        }
        return returnSet;
    }

    public int getEmployeeCountForDepartment(Department d) {
        return 0;
    }
}
