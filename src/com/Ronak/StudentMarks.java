package com.Ronak;

import java.util.Scanner;

public class StudentMarks 
{

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of 4 student ");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c= sc.nextInt();
		int d=sc.nextInt();
		int total =a+b+c+d;
		float avg = total/4;
		
		if (avg >=90)
		{
			System.out.println("Student grade is A");
		}
		else if (avg>=80 &&avg <90)
		{
			System.out.println("Student grade is B");
		}
		else if (avg>=70 && avg <80)
		{
			System.out.println("Student grade is c");
		}
		else 
		{
			System.out.println("Student is FAil");
		}
			
	}
}
