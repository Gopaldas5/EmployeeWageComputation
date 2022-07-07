package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageBuilderArray {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmployeeWage[] companyEmployeeWageArray;

    public EmployeeWageBuilderArray(){
        companyEmployeeWageArray = new CompanyEmployeeWage[5];
    }
    private void addCompanyEmpWage(String companyName, int EMP_RATE_PER_HOUR, int NUM_WORKING_DAYS,
                                   int MAX_WORKING_HRS_IN_MONTH){
        companyEmployeeWageArray[numOfCompany] = new CompanyEmployeeWage(companyName, EMP_RATE_PER_HOUR,
                NUM_WORKING_DAYS, MAX_WORKING_HRS_IN_MONTH);
        numOfCompany++;
    }
    private void computeEmpWage(){
        for (int i = 0; i < numOfCompany; i++){
            companyEmployeeWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmployeeWageArray[i]));
            System.out.println(companyEmployeeWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
        Random random = new Random();
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        System.out.println("--------------------------------------");

        while (totalEmpHrs <= companyEmployeeWage.MAX_WORKING_HRS_IN_MONTH &&
                totalWorkingDays < companyEmployeeWage.NUM_WORKING_DAYS) {
            totalWorkingDays++;
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
            System.out.println("Day " + totalWorkingDays + " Employee working hours : " + empHrs);
        }

        return totalEmpHrs * companyEmployeeWage.EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation program");
        EmployeeWageBuilderArray empWageBuilder = new EmployeeWageBuilderArray();
       empWageBuilder.addCompanyEmpWage("Amazon", 20, 5,10);
       empWageBuilder.addCompanyEmpWage("TCS", 10,4, 20);
        empWageBuilder.computeEmpWage();
    }

}

