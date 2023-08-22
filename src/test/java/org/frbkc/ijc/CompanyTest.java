package org.frbkc.ijc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    private Company company;

    @BeforeEach
    void setUp() {
        company= new Company(CompanyData.getEmployees());
    }

    @Test
    void highestPaid() {
        assertEquals(new Employee("Darth Vader", 9654), company.highestPaid());
//        assertEquals("Darth Vader", company.highestPaid().getName());
    }

    @Test
    void testGetEmployees() {
        assertArrayEquals(CompanyData.getEmployees(), company.getEmployees());
    }

    @Test
    void testGetEmployeesEarningLessThan() {
        final Employee[] employees = company.getEmployees();
        Employee[] expected = {employees[1],employees[2], null, null, null, null, null};
        assertArrayEquals(expected, company.getLowPaidEmployees(3000));
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
//        final Employee[] employees = company.getEmployees();
//        Employee[] firstTwo = {employees[0],employees[1], null, null, null, null, null};
//        assertArrayEquals(firstTwo, company.getFirstFew(2));
    }
}