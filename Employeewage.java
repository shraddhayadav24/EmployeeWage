package com.employeewage.uc;

import java.util.ArrayList;

interface EmpWage{
	public void addCompany(String CompanyName);
	public void CalculateEmpWage(int companyindex, int workhourperday, int workhourperrate);
}

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


public class EmployeeWage implements EmpWage {
//	private CompanyEmpWage[] companyEmpWages;
//	 private int numofCompanies;
		
	private ArrayList<CompanyEmpWage> companyEmpWages;
	

	 public EmployeeWage() {
		 
		 companyEmpWages=new ArrayList<>();
		 
//		 companyEmpWages =new CompanyEmpWage[5];
//		 numofCompanies=0;
	 }
	 
	 public void addCompany(String CompanyName) {
//		 companyEmpWages[numofCompanies]= new CompanyEmpWage(CompanyName);
//		  numofCompanies++;
		 companyEmpWages.add(new CompanyEmpWage(CompanyName));
	 }
	 
	 public void CalculateEmpWage(int companyindex, int workhourperday, int workhourperrate) {
		 double wage= workhourperday * workhourperrate;
		// companyEmpWages[companyindex].settotalEmpWage(companyEmpWages[companyindex].gettotalEmpWage() + wage);
		 CompanyEmpWage companyEmpWage=companyEmpWages.get(companyindex);
		 companyEmpWage.settotalEmpWage(companyEmpWage.gettotalEmpWage() + wage);
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

	        
	        empWageBuilder.CalculateEmpWage(1, 45, 18);
	        empWageBuilder.CalculateEmpWage(1, 35, 22);
	        System.out.println("Total wage for " + empWageBuilder.companyEmpWages.get(1).getCompanyName() + ": " + empWageBuilder.gettotalEmpWage(1));
	    }
	}