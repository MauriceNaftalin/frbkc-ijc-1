package org.frbkc.ijc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    private Company company;

    @BeforeEach
    void setUp() {
        company= new Company(CompanyData.getEmployees(), CompanyData.getDepartmentDirectory());
    }

    @Test
    void highestPaid() {
        assertEquals(new Employee("Darth Vader", 9654), company.highestPaid());
//        assertEquals("Darth Vader", company.highestPaid().getName());
    }

    @Test
    void testGetEmployees() {
        assertEquals(CompanyData.getEmployees(), company.getEmployees());
    }

    @Test
    void testGetEmployeesEarningLessThan() {
        final List<Employee> employees = company.getEmployees();
        List<Employee> expected = employees.subList(1,3);
        assertEquals(expected, company.getLowPaidEmployees(3000));
    }

    @Disabled
    @Test
    void testApplyRaise() {
//        company.applyRaise(100);
//        final Employee newMohan = new Employee("Mohan Solay", 4623);
//        assertEquals(newMohan, company.getEmployees()[0]);
    }

    @Disabled
    @Test
    void testgetFirstFew() {
//        final List<Employee> employees = company.getEmployees();
//        List<Employee> firstTwo = {employees[0],employees[1], null, null, null, null, null};
//        assertArrayEquals(firstTwo, company.getFirstFew(2));
    }


}