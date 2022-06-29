package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation program");
        int IS_PART_TIME = 2;
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empWage = 0;
        Random random = new Random();
        int employeeCheck = random.nextInt(3);

        if (employeeCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is present as a full time");
        }
        else if(employeeCheck == IS_PART_TIME ) {
            empHrs = 4;
            System.out.println("Employee is present as a part time");
        }
        else {
            empHrs = 0;
            System.out.println("Employee is absent");
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage : "+empWage);


    }
}
