package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    private static final int NUM_WORKING_DAYS = 20 ;
    private static final int MAX_WORKING_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation program");

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        Random random = new Random();

        while( totalEmpHrs <= MAX_WORKING_HRS_IN_MONTH  && totalWorkingDays < NUM_WORKING_DAYS) {
            totalWorkingDays ++;
            int employeeCheck = random.nextInt(3);
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println( "Day "+ totalWorkingDays +" Employee working hours : " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage : " +totalEmpWage);
    }
}
