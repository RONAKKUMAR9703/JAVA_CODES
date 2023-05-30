package com.Ronak;

import java.util.Scanner;

public class E_main {

	public static void main(String[] args) {
		
	       Employee employee1 = new Employee("Robert"+"        ", 1994,"             " + "64C- WallsStreet");
	        Employee employee2 = new Employee("Sam"+"           ", 2000,"             " + "68D- WallsStreet");
	        Employee employee3 = new Employee("John"+"          ", 1999,"             " +  "26B- WallsStreet");

	        System.out.println("Name       Year of Joining       Address");
	        employee1.display();
	        System.out.println();
	        employee2.display();
	        System.out.println();
	        employee3.display();

	}

}







