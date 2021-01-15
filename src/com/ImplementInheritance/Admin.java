package com.ImplementInheritance;

public class Admin extends Student {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Divya");
		student.setBatch("2018-2022");
		student.setRoll_no(4916128);
		System.out.print("Name : "+ student.getName()+ "\nRollno-:"+student.getRoll_no()+"\nBatch : "+student.getBatch());
		student.fees();
		student.maintainace();
	}

}
