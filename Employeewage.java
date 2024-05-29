package com.employeewage.uc;

class CompanyEmpWage{
	private String CompanyName;
	private double totalEmpWage;
	
	public CompanyEmpWage(String CompanyName) {
		this.CompanyName=CompanyName;
		this.totalEmpWage=0.0;
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	
	public double gettotalEmpWage() {
		return totalEmpWage;
	}
	
	public double settotalEmpWage(double totalEmpWage) {
		return this.totalEmpWage=totalEmpWage;
	}
}


public class EmployeeWage {
	 private CompanyEmpWage[] companyEmpWages;
	 private int numofCompanies;
	 
	 public EmployeeWage() {
		 companyEmpWages =new CompanyEmpWage[5];
		 numofCompanies=0;
	 }
	 
	 public void addCompany(String CompanyName) {
		 companyEmpWages[numofCompanies]= new CompanyEmpWage(CompanyName);
		 numofCompanies++;
	 }
	 
	 public void CalculateEmpWage(int companyindex, int workhourperday, int workhourperrate) {
		 double wage= workhourperday * workhourperrate;
		 companyEmpWages[companyindex].settotalEmpWage(companyEmpWages[companyindex].gettotalEmpWage() + wage);
		 
	 }
	 public double gettotalEmpWage(int companyIndex) {
	        return companyEmpWages[companyIndex].gettotalEmpWage();
	    }
	
	 public static void main(String[] args) {
	        EmployeeWage empWageBuilder = new EmployeeWage();
	        empWageBuilder.addCompany("TCS");
	        empWageBuilder.addCompany("Wipro");

	        
	        empWageBuilder.CalculateEmpWage(0, 40, 15);
	        empWageBuilder.CalculateEmpWage(0, 30, 20);
	        System.out.println("Total wage for " + empWageBuilder.companyEmpWages[0].getCompanyName() + ": " + empWageBuilder.gettotalEmpWage(0));

	        
	        empWageBuilder.CalculateEmpWage(1, 45, 18);
	        empWageBuilder.CalculateEmpWage(1, 35, 22);
	        System.out.println("Total wage for " + empWageBuilder.companyEmpWages[1].getCompanyName() + ": " + empWageBuilder.gettotalEmpWage(1));
	    }
	}


