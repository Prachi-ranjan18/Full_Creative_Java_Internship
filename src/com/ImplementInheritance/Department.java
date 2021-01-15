package com.ImplementInheritance;
///Here we are implementing multilevel inheritance
public class Department extends Faculty {
	String hod="Mr. Navneet Verma";
	String dept_Name="Computer Science & Engineering";
	public void show() {
		System.out.println("Head of department of "+ dept_Name +" is "+hod);
		System.out.println("Professors of CSE: ");
	}
	public static void main(String[] args) {
		College college=new College();
		college.information("Diploma of computer science engineering, Batchelor of Computer Science, Masters in Computer Science");Faculty faculty = new Faculty();
		Department department = new Department();
		department.show();
		faculty.information("Mr. Sahayog sharma", 50000, "Professor","CSE");
		faculty.information("Mrs. Sulekh mitra", 35000, "Assistant Professor","CSE");
	}
	
}
