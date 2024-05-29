package com.employeewage.uc;
public class EmployeeWage {
	 
	private String CompanyName;
	private int workinghourperday;
	private int workinghourperrate;
	private double totalEmpWage;
	
	public EmployeeWage(String CompanyName) {
		this.CompanyName=CompanyName;
		this.totalEmpWage=0.0;
	}
	
	public double CalculateEmpWage(int workinghourperday, int workinghourperrate) {
		double wage= workinghourperday*workinghourperrate;
		totalEmpWage = totalEmpWage+wage;
		return wage;
	}
	
	public double gettotalEmpWage() {
		return totalEmpWage;
	}
	
	
	public static void main(String[] args) {
		EmployeeWage employeeWage=new EmployeeWage("TCS");
		double company1 = employeeWage.CalculateEmpWage(8, 20);
		System.out.println(company1);
	}
	
	
}
