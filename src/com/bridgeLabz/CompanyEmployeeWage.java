package com.bridgeLabz;

public class CompanyEmployeeWage {
    public final String companyName;
    public final int EMP_RATE_PER_HOUR;
    public final int NUM_WORKING_DAYS;
    public final int MAX_WORKING_HRS_IN_MONTH;
    public int totalEmpWage;

    public CompanyEmployeeWage(String companyName, int EMP_RATE_PER_HOUR, int NUM_WORKING_DAYS, int MAX_WORKING_HRS_IN_MONTH) {
        this.companyName = companyName;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
        this.MAX_WORKING_HRS_IN_MONTH = MAX_WORKING_HRS_IN_MONTH;

    }
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {
        System.out.println("Name of the company :- " + companyName);
        return "Total employee wage :-- " + totalEmpWage;

    }
}
