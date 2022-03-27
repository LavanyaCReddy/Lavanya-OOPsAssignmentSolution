package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {
	String  departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String getTechStackInformation;
	
	
	public String getDepartmentName() {
		return "Tech Department";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName; 
	}
	
	public String getGetTodaysWork() {
		return "Complete coding of module 1";
	}
	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	
	public String getGetWorkDeadline() {
		return "Complete by EOD";
	}
	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	public String getGetTechStackInformation() {
		return "core Java";
	}
	public void setGetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;
	}
			
}



