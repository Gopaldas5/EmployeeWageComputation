package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation program");

        int IS_FULL_TIME = 1;
        Random random = new Random();
        int employeeCheck = random.nextInt(2);

        if (employeeCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present today");
        } else {
            System.out.println("Employee is Absent today");
        }
    }
}
