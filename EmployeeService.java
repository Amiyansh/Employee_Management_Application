//package com.sj.empmanagmentapplication;

//import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.TreeSet;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	
	Employee emp1=new Employee(1, "Supriya Dongre(mam)", 32, " Java Developer Teacher", "IT", 125000);
	Employee emp2=new Employee(2, "Mithuna (mam)", 30, " Java Developer Teacher","CO", 127000);
	Employee emp3=new Employee(3, "Nikitha Sharma", 23, "Software Engineer","IT", 70000);
	Employee emp4=new Employee(4, "Jyoti Yadav", 24, "AI Engineer","IT",  30000);
	Employee emp5=new Employee(5, "Parkash Meheta", 23, "Technical Lead","IT",  25000);
	Employee emp6=new Employee(6, "Aachal Mekhare", 25, "Technical Support","IT",  20000);
	Employee emp7=new Employee(7, "Md. Shoeb Ahmed", 24, "Site Engineer","Construction",  10000);
	Employee emp8=new Employee(8, "Jayesh Nagpurkar", 26, "Technical Head","IT",  25000);
	Employee emp9=new Employee(9, "Anpur Sindhuja", 24, "Autocad Specialist","Designer",  15000);
	Employee emp10=new Employee(10, "Prannath Tripathi", 26, "All Rounder","IT",  12000);
	Employee emp11=new Employee(11, "Mayuri Deshmukh", 24, "Junior Engineer","IT",  28000);
	Employee emp12=new Employee(12, "Md Arbab Anjum", 24, "Technical Support","IT",  18000);
	Employee emp13=new Employee(13, "Vinay..", 24, "Trainee","IT",  30000);
	Employee emp14=new Employee(14, "Priyabrat Swain", 25, "Team Manager","IT",  19000);
	Employee emp15=new Employee(15, "Amiyanshu Basu", 25, "Nothing","NA",  00000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;
	
	public EmployeeService() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		empset.add(emp6);
		empset.add(emp7);
		empset.add(emp8);
		empset.add(emp9);
		empset.add(emp11);
		empset.add(emp12);
		empset.add(emp13);
		empset.add(emp14);
		empset.add(emp15);
		
		
	}
	
	//view all employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view emp based on there id
	public void viewEmp(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	//delete emp
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	//add emp
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Desiganation");
		desiganation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, desiganation, department, sal);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
	}
	
	}
		