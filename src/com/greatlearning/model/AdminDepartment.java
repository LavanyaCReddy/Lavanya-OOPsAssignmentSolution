package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	        String departmentName;
			String getTodaysWork;
			String getWorkDeadline;
			
			public String getDepartmentName() {
				return "Admin Department";
			}
			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}
			public String getGetTodaysWork() {
				return "Complete your documents Submission";
			}
			public void setGetTodaysWork(String getTodaysWork) {
				this.getTodaysWork = getTodaysWork;
			}
			public String getGetWorkDeadline() {
				return "Complete by EOD ";
			}
			public void setSetWorkDeadline(String getWorkDeadline) {
				this.getWorkDeadline = getWorkDeadline;
			}

}
