package com.employeewage.uc;

public class Employeewage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_PER_HOUR_RATE=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;
	
public static void main(String[] args) {
	int empHrs=0,totalempHrs=0, totalWorkingDays=0;
	
	while(totalempHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
		totalWorkingDays++;
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		switch(empCheck){
		case IS_PART_TIME:
			empHrs=4;
			break;
		
		case IS_FULL_TIME:
			empHrs=8;
			break;
			
		default:
			empHrs=0;
		}
		totalempHrs+=empHrs;
		System.out.println("Day#: " + totalWorkingDays+ "EMP HRS:" +empHrs );
	}
	int totalEmpWage=totalempHrs * EMP_PER_HOUR_RATE;
	System.out.println("Total employeewage: "+ totalEmpWage);
	}
	
}

