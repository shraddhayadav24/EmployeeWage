package com.employeewage.uc;

class CompanyEmpWage {
    private String companyName;
    private double wagePerHour;
    private int workingDaysPerMonth;
    private int workingHoursPerDay;
    private double totalWage;

    public CompanyEmpWage(String companyName, double wagePerHour, int workingDaysPerMonth, int workingHoursPerDay) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public double calculateEmployeeWage() {
        int totalWorkingHours = workingDaysPerMonth * workingHoursPerDay;
        this.totalWage = totalWorkingHours * wagePerHour;
        return this.totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }
}

public class EmployeeWage {
    private static final int MAX_COMPANIES = 4;
    private static int numOfCompanies = 0;
    private static CompanyEmpWage[] companyEmpWages = new CompanyEmpWage[MAX_COMPANIES];

    public static void addCompanyEmpWage(String companyName, double wagePerHour, int workingDaysPerMonth, int workingHoursPerDay) {
        if (numOfCompanies < MAX_COMPANIES) {
            companyEmpWages[numOfCompanies] = new CompanyEmpWage(companyName, wagePerHour, workingDaysPerMonth, workingHoursPerDay);
            numOfCompanies++;
        } else {
            System.out.println("Invalid Company");
        }
    }

    public static void computeEmployeeWages() {
        for (int i = 0; i < numOfCompanies; i++) {
            double totalWage = companyEmpWages[i].calculateEmployeeWage();
            System.out.println(companyEmpWages[i].getCompanyName() + " total employee wage is: " + totalWage);
        }
    }

    public static void main(String[] args) {
        addCompanyEmpWage("TCS", 15, 20, 8); 
        addCompanyEmpWage("Wipro", 20, 22, 7);
        computeEmployeeWages();
    }
}
