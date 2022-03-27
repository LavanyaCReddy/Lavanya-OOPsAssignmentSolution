package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
	String departmentName;
	String  getTodaysWork;
	String  getWorkDeadline;
	String doActivity;
	
	public String getDepartmentName() {
		return "Hr Department";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getGetTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
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
	
	public String getDoActivity() {
		return "team Lunch";
	}
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}
	

}


