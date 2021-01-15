package com.ImplementInheritance;

public class Faculty extends College {
	String name;
	double salary;
	String designation;
	String department;
	//constructor overloading....
	Faculty(){
		super();
	}
	Faculty(String name, double salary, String designation, String department){
		//super();
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.department=department;
	}
	//method overriding.....
	public void information(String name, double salary, String designation, String department){
		
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+designation);
		System.out.print("Department assigned : "+department+"\n");
	}
}
