package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation program");

        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empWage = 0;
        Random random = new Random();
        int employeeCheck = random.nextInt(2);

        if (employeeCheck == IS_FULL_TIME)
            empHrs = 8;
         else
            empHrs = 4;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage : "+empWage);


    }
}
