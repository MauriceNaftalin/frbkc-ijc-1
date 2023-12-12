package org.frbkc.ijc;

import java.util.*;

public class Company implements OrgUnit {
    private List<Employee> employees;

    private Map<String,Department> departmentDirectory;

/*
    public Company(List<Employee> employees) {
        this.employees = employees;
    }
*/

    public Company(List<Employee> employees, Map<String, Department> departmentDirectory) {
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

    public boolean isEmployee(String name, int salary) {
        Employee emp = new Employee(name,salary);
        return employees.contains(emp);
    }

    @Override
    public Employee getManager() {
        return null;
    }

    @Override
    public int getEmployeeCount() {
        return 0;
    }

/*
    public List<Employee> getEmployeeSortedBySalary() {
        List<Employee> employeesSortedBySalary = getEmployeeList();
        employeesSortedBySalary.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() < o2.getSalary()) {
                    return -1;
                } else if (o1.getSalary() == o2.getSalary()) {
                    return 0;
                }
                return 1;
            }
        });
    }
*/
}
