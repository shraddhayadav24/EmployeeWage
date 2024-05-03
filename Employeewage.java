package com.employeewage.uc;

public class Employeewage {
	public static void main(String[] args) {
		
			int IS_FULL_TIME=1;
			double emp_check=Math.floor(Math.random()*10)%2;
			if(emp_check == IS_FULL_TIME) {
				System.out.println("employee is present");
			}else {
				System.out.println("employee is absent");
			}
			
		
}
}