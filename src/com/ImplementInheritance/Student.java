package com.ImplementInheritance;
//Encapsulation Implementation

public class Student extends College implements Accounts {
	private String name="Divya";
	private int roll_no=4916128;
	private String department="CSE";
	private String semester="7th";
	private String batch="2016-2020";
	private int fee = 25000;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no=roll_no;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester=semester;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch=batch;
	}
	public void fees() {
		System.out.println("\nRemaining fee : "+(total-fee));
	}
	@Override
	public void maintainace() {
		System.out.print("\nRemaining fee after submission of Maintainance charges "+(total-fee-5000));
		
	}
}
