package com.Ronak;
import java.util.*;
public class Account_class {
	
	private String AccName;
	private int Balance;
	
	public Account_class()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("write ACCount name :");
		 AccName =s.nextLine();
		 System.out.println("write your balance :");
		 Balance =s.nextInt();
		
	}
	public Account_class(String s,int a)
	{
		AccName=s;
		Balance=a;
	}
	public void display()
	{
		System.out.println(AccName+" "+Balance);
		
	}
}