package com.learning.project;
//Default constructor
class Employee{
	int id;
	String name;
	void display() {
		
		System.out.println(id +" "+name);
	}
}
//Parameterized Construtor
class Employee1{
	int empid;
	String empname;
	public Employee1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	void empresult() {
		
		System.out.println(empid +" " + empname);
	}
}


public class Constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default construtor");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.id = 10;
		e1.name = "Teja";
		e2.id = 20;
		e2.name = "Hanu";
		e1.display();
		e2.display();
		System.out.println("Parameterized Constructor");
		Employee1 emp1 = new Employee1(30,"Ravi");
		Employee1 emp2 = new Employee1(40,"Sachin");
		emp1.empresult();
		emp2.empresult();

	}
}
