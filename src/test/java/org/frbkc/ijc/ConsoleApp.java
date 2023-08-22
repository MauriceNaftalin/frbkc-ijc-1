package org.frbkc.ijc;

import java.util.Scanner;
public class ConsoleApp {

    public static void main(String[] args) {
        // fake the creation of a Company from database data
        Company company = null; // new Company(CompanyData.getEmployees());

        // get user input to provide choice of operations
        var scanner = new Scanner(System.in);
        displayMenu();
        char option = scanner.nextLine().charAt(0);
        while (option != 'z') {
            if (option == 'a') {
                // list all employees
                System.out.println("not implemented yet");
            } else if (option == 'b') {
                // print the highest salary using the result from a new method Company::highestPaid
                System.out.println("not implemented yet");
            } else if (option == 'c') {
                // print the average pay
                System.out.println("not implemented yet");
            } else if (option == 'd') {
                // give every employee a raise
                System.out.print("How much? ");
                int raise = scanner.nextInt();
                scanner.nextLine();
//                company.applyRaise(raise);
                System.out.println("not implemented yet");
            } else if (option == 'e') {
                // print the first few employees
                System.out.print("How many? ");
                int howMany = scanner.nextInt();
                scanner.nextLine();
//                System.out.println(company.getFirstFew(howMany));
                System.out.println("not implemented yet");
            } else if (option == 'f') {
                // print the number of employees earning less than user-entered amount
                System.out.print("Salary: ");
                int payLevel = scanner.nextInt();
                scanner.nextLine();
//                System.out.println(company.getLowPaidEmployeesCount(payLevel));
                System.out.println("not implemented yet");
            } else if (option == 'g') {
                // list employees earning less than a user-entered amount
                System.out.print("Salary: ");
                int salary = scanner.nextInt();
                scanner.nextLine();
//                final Employee[] employeesEarningLessThan = company.getLowPaidEmployees(salary);
                System.out.println("not implemented yet");
            } else if (option == 'h') {
                // list the company's employees in reverse order
                System.out.println("not implemented yet");
            } else if (option == 'i') {
                // replace the first employee with a newly-created employee
                System.out.print("Employee Name: ");
                String name = scanner.nextLine();
                System.out.print("Employee Salary: ");
                int salary = scanner.nextInt();
                scanner.nextLine();
//                company.replaceEmployee(0, name, salary);
                System.out.println("not implemented yet");
            } else if (option == 'j') {
                // list the employees in reverse order
                System.out.println("not implemented yet");
            } else {
                System.out.println("That's not an option; please try again.");
            }
            displayMenu();
            option = scanner.nextLine().charAt(0);
        }
    }

    private static void displayMenu() {
        System.out.println("Program Options:");
        System.out.println("   z: exit");
        System.out.println("   a: list all employees");
        System.out.println("   b: print the highest salary");
        System.out.println("   c: print the average pay");
        System.out.println("   d: give every employee a raise");
        System.out.println("   e: print the first few employees");
        System.out.println("   f: print the number of employees earning less than user-entered amount");
        System.out.println("   g: list the employees earning less than user-entered amount");
        System.out.println("   h: list the company's employees in reverse order");
        System.out.println("   i: replace the first employee with a newly-created employee");
        System.out.println("   j: list the employees in reverse order");
        System.out.print("Choose an option: ");
    }
}