package com.ImplementInheritance;
// this college class is also showing an example of Hierarchical inheritance
//because College class has become root class for faculty & students
public class College {
	int clg_Id=49161001;
	String clg_Name="Geeta Engineering College";
	String university_Name="Kurukshetra University, Kurukshetra";
	String courses;
	String departments;
	public void information(String courses) {
		this.courses=courses;
		System.out.println("College Name: "+clg_Name);
		System.out.println("College Id: "+clg_Id);
		System.out.println("Aflliated to: "+university_Name);
		System.out.println("Courses available: "+courses);
	}
	//method overloading.....
	public void information(String courses,String departments) {
		this.courses=courses;
		this.departments=departments;
		System.out.println("College Name: "+clg_Name);
		System.out.println("College Id: "+clg_Id);
		System.out.println("College Name: "+clg_Name);
		System.out.println("Aflliated to: "+university_Name);
		System.out.println("Courses available: "+courses);
		System.out.println("Departments available: "+departments);
	}
}
