package com.greatlearning.department;
//parent class
public class SuperDepartment {

	public String departmentName(){
		return " Super Department ";
	}
	
	public String getTodaysWork() {
		return " No Work as of now ";
	}
	
	public String getWorkDeadline(){
		return " Nil ";
	}
	
	public String isTodayAHoliday() {
		return " Today is not a holiday ";
	}
	
	public static void main(String[] args) {
		//creating object of admin department
		AdminDepartment admin = new AdminDepartment();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		//creating objects of HR department
		HrDepartment hr = new HrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		//creating object of tech department
		TechDepartment tech = new TechDepartment();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
	}
}
