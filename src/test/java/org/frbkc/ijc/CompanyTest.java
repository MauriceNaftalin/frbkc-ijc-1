package org.frbkc.ijc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    private Company company;

    @Disabled
    @BeforeEach
    void setUp() {
//        company= new Company(CompanyData.getEmployees());
    }

    @Disabled
    @Test
    void highestPaid() {
//        assertEquals("Darth Vader", company.highestPaid().getName());
    }

    @Disabled
    @Test
    void testGetEmployees() {
//        assertArrayEquals(CompanyData.getEmployees(), company.getEmployees());
    }

    @Disabled
    @Test
    void testGetEmployeesEarningLessThan() {
//        final Employee[] employees = company.getEmployees();
//        Employee[] expected = {employees[1],employees[2], null, null, null, null, null};
//        assertArrayEquals(expected, company.getLowPaidEmployees(3000));
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