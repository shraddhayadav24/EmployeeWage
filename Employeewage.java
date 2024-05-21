package com.employeewage.uc;
public class EmployeeWage{
private double empwageperhour;
private int workinghoursperday;
private int workingdayspermonth;


public EmployeeWage(double empwageperhour, int workinghoursperday, int workingdayspermonth) {
	this.empwageperhour=empwageperhour;
	this.workingdayspermonth=workingdayspermonth;
	this.workinghoursperday=workinghoursperday;
}

public static double CalculateEmpwageCompanies(double empwageperhour, int workinghoursperday, int workingdayspermonth) {
	int totalworkinghours= workinghoursperday * workingdayspermonth;
	double totalWage= totalworkinghours * empwageperhour;
	return totalWage;
}

public static void main(String[] args) {
	double Company1 =EmployeeWage.CalculateEmpwageCompanies(15.0, 8, 30);
	System.out.println("The total EmpWage for Cpmpany 1:  " + Company1);
	
	double Company2 =EmployeeWage.CalculateEmpwageCompanies(10.0, 8, 20);
	System.out.println("The total EmpWage for Cpmpany 2:  "+Company2);
	
}
}
