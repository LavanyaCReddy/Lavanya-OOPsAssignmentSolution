package com.greatlearning.driverclass;


	import com.greatlearning.model.AdminDepartment;
	import com.greatlearning.model.HrDepartment;
	//import com.greatlearning.model.SuperDepartment;
	import com.greatlearning.model.TechDepartment;

	public class Main {
		public static void main(String[] args) {
			AdminDepartment admin= new AdminDepartment();
			System.out.println("Welcome to "+admin.getDepartmentName() + "\n" 
			                    + admin.getGetTodaysWork()+ "\n "
			                    + admin.getGetWorkDeadline()+ "\n"
			                    + admin.getIsTodayAHoliday());
			System.out.println("\n");
			
	        HrDepartment hr = new HrDepartment();
	        System.out.println("Welcome to "+hr.getDepartmentName() + "\n" 
	                + hr.getGetTodaysWork()+ "\n "
	                + hr.getGetWorkDeadline()+ "\n"
	                + hr.getDoActivity()+ "\n"
	                + hr.getIsTodayAHoliday());
	        System.out.println("\n");
			
	        
	        TechDepartment tech = new TechDepartment();
	        System.out.println("Welcome to "+tech.getDepartmentName() + "\n" 
	                + tech.getGetTodaysWork()+ "\n "
	                + tech.getGetWorkDeadline()+ "\n"
	                + tech.getGetTechStackInformation()+ "\n"
	                + tech.getIsTodayAHoliday());

			
			}
	}





