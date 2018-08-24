package com.loga.day3;

public class EmployeeDetails {
		private long employeeID;
		private String employeeName;
		private double basicSalary;
		private double netSalary;
		private double pf;
		private final double pt=200;;
		private double hra;
		private double medical;
		
		public EmployeeDetails() {
	
		}
		public EmployeeDetails(long employeeId, String employeeName, double basicSalary,double medical) {
			this.employeeID = employeeId;
			this.employeeName = employeeName;
			this.basicSalary = basicSalary;
			this.medical = medical;
		}
		public double netsalary() {
			pf=(0.12*basicSalary);
			
			hra=(basicSalary*0.5);
			double grossSalary=((hra+basicSalary+medical));
			double netSalary=(grossSalary-(pf+pt));
			return netSalary;
		}
public void displayEmployeeInformation() {
	System.out.println("EmployeeId : " + employeeID + "\nEmployee name: " + employeeName +  
			 "\nnetSalary: " + netSalary);
}
}
