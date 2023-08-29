package org.frbkc.ijc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompanyData {

    public static Map<String, Department> getDepartmentDirectory() {
        return Map.of("sales", new Department("sales"), "production", new Department("production"));
    }
    public static List<Employee> getEmployees() {
        final Department sales = getDepartmentDirectory().get("sales");
        List<Employee> unmodifiableCompanyEmployees = List.of(
                new Employee("Mohan Solay", 4523, sales),
                new Employee("Daniel Foster", 1200),
                new Employee("Tracy Hart", 1100),
                new Employee("Tom Cruise", 8350),
                new Employee("Jody Foster", 4100),
                new Employee("Bat Man", 7500),
                new Employee("Darth Vader",9654));
        List<Employee> companyEmployees = new ArrayList<>(unmodifiableCompanyEmployees);
        return companyEmployees;
    }
}
