package com.Ronak;
import java.util.Scanner;

public class Biggernumber {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two number ");
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		int c=(a>b)?a:b;
		System.out.println("The Bigger number is :"+c);
	}

}