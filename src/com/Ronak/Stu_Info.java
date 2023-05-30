package com.Ronak;
import java.util.*;
public class Stu_Info {
		
		private String AccName;
		private int Balance;
		
		
		
		public String getAccName()
		{
			return AccName;
		}
		
		public void setAccName(String n)
		{
			AccName=n;
		}
		public int getBalance()
		{
			return Balance;
		}
		
		public void setBalance(int x)
		{
			Balance=x;
		}
		
		public void withdrawal()
		{  
			System.out.println("Enter amount you want to withdraw:");
			Scanner r =new Scanner(System.in);
			int amount = r.nextInt();
			 
			if (Balance -amount >1000) {
				Balance=Balance - amount;
				System.out.println("your amount is withdrawal  ");
				System.out.println("your remaining blance is "+Balance);
				
			}
			else {
				System.out.println("you cannot withdraw money ");
				System.out.println("thankyou ");
			}
			
		}
		public void deposit()
		{
			System.out.println("Enter amount you want to deposit:");
			Scanner r =new Scanner(System.in);
			int amount = r.nextInt();
			
			Balance =Balance +amount ;
			System.out.println("your amount is deposite successfull ");
			System.out.println("your new balance is  "+Balance);
			
		}
			
}
