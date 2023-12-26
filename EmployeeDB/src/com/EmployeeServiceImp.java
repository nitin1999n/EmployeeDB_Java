package com;

import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {
	
	Employee[] eDB;
	Scanner ip=new Scanner(System.in);
	
	@Override
	public void createEmployeeDb(int size) {
		eDB=new Employee[size];
		System.out.println("Employee Db had been created with size: "+size);
	}
	
	@Override
	public void availableIndex() {
		int c=0;
		System.out.println("====Available Index====");
		for(int i=0;i<eDB.length;i++) {
			if(eDB[i]==null) {
				System.out.print(i+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.print("Database is Full...!!!");
		}
		System.out.println();
	}
	
	@Override
	public void addEmployee(int in) {
		if(in>eDB.length) {
			System.out.println("Invalid Index No");
		}
		else if(eDB[in]!=null) {
			System.out.println("Its Already Occupied..!!");
		}
		else {
			System.out.println("Enter Emp Id");
			int eid=ip.nextInt(); 		
		}
	}

	@Override
	public void displayAllEmp() {
		System.out.println("====Employee-Details=====");
		int c=0;
		for(int i=0;i<eDB.length;i++) {
			if(eDB[i]!=null) {
				System.out.println(eDB[i]);
				c++;
			}
		}
		if(c==0) {
			System.out.println("DataBase is Empty...!!!");
		}	
	}
	
	@Override
	public void getEmpById(int eid) {
		System.out.println("====Employee-By-Eid====");
		int c=0;
		for(Employee ele:eDB) {
			if(ele!=null) {
			if(ele.getEid()==eid) {
				System.out.println(ele);
				c++;break;
			}
			}
		}
		if(c==0) {
			System.out.println("EId not found...!!!");
		}
	}
}
