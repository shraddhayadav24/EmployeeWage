package com.employeewage.uc;

import java.util.ArrayList;

interface EmpWage {
    public void addCompany(String CompanyName);
    public void CalculateEmpWage(int companyindex, int workhourperday, int workhourperrate);
}

class CompanyEmpWage {
    private String CompanyName;
    private double totalEmpWage;
    private ArrayList<Double> dailyWages;

    public CompanyEmpWage(String CompanyName) {
        this.CompanyName = CompanyName;
        this.totalEmpWage = 0.0;
        this.dailyWages = new ArrayList<>();
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public double gettotalEmpWage() {
        return totalEmpWage;
    }

    public void settotalEmpWage(double totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public void addDailyWage(double wage) {
        dailyWages.add(wage);
    }

    public ArrayList<Double> getDailyWages() {
        return dailyWages;
    }
}

public class EmployeeWage implements EmpWage {
    private ArrayList<CompanyEmpWage> companyEmpWages;

    public EmployeeWage() {
        companyEmpWages = new ArrayList<>();
    }

    public void addCompany(String CompanyName) {
        companyEmpWages.add(new CompanyEmpWage(CompanyName));
    }

    public void CalculateEmpWage(int companyindex, int workhourperday, int workhourperrate) {
        double wage = workhourperday * workhourperrate;
        CompanyEmpWage companyEmpWage = companyEmpWages.get(companyindex);
        companyEmpWage.addDailyWage(wage); // Add daily wage to dailyWages list
        companyEmpWage.settotalEmpWage(companyEmpWage.gettotalEmpWage() + wage); // Update total wage
    }

    public double gettotalEmpWage(int companyIndex) {
        return companyEmpWages.get(companyIndex).gettotalEmpWage();
    }

    public static void main(String[] args) {
        EmployeeWage empWageBuilder = new EmployeeWage();
        empWageBuilder.addCompany("TCS");
        empWageBuilder.addCompany("Wipro");

        empWageBuilder.CalculateEmpWage(0, 40, 15);
        empWageBuilder.CalculateEmpWage(0, 30, 20);
        System.out.println("Total wage for " + empWageBuilder.companyEmpWages.get(0).getCompanyName() + ": " + empWageBuilder.gettotalEmpWage(0));
        System.out.println("Daily wages for " + empWageBuilder.companyEmpWages.get(0).getCompanyName() + ": " + empWageBuilder.companyEmpWages.get(0).getDailyWages());

        empWageBuilder.CalculateEmpWage(1, 45, 18);
        empWageBuilder.CalculateEmpWage(1, 35, 22);
        System.out.println("Total wage for " + empWageBuilder.companyEmpWages.get(1).getCompanyName() + ": " + empWageBuilder.gettotalEmpWage(1));
        System.out.println("Daily wages for " + empWageBuilder.companyEmpWages.get(1).getCompanyName() + ": " + empWageBuilder.companyEmpWages.get(1).getDailyWages());
    }
}
