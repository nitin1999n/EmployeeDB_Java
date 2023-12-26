package com;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService e=new EmployeeServiceImp(); 
		System.out.println("========Welcome to Employee Data Base========");
		while(true) {
			System.out.println("=========Menu===========");
			System.out.println("1.Create Employee-Db \n2.Available Index  "
					+ "\n3.Add-Employee \n4.Display All \n5.Get Emp by ID ");
			System.out.println("6.Exit");
			System.out.println("Enter your Option:-");
			int op=sc.nextInt();
			switch(op) {
			case 1: System.out.println("Enter the size of Db:-");
					int size =sc.nextInt();
				e.createEmployeeDb(size);break;
			case 2: e.availableIndex();break;
			case 3: System.out.println();
					int in=sc.nextInt();
					e.addEmployee(in); break;
			case 4: e.displayAllEmp();break;
			case 5: System.out.println("Enter the Eid");
					int eid=sc.nextInt();
					e.addEmployee(eid);break;
			case 7:System.out.println("====Thank you Visit Again====");
					System.exit(0); break;
			default: System.out.println("Invalid Option");
			}
		}
		
	}
}
