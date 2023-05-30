package com.Ronak;

import java.util.Scanner;

public class Atm_process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Atm_action r =new Atm_action();
		r.setAccName("ramesh");
		r.setBalance(50000);
		
		System.out.println(r.getAccName());
	
		System.out.println(r.getBalance());
		System.out.println("Your Transaction limit is 5 ");
		int t=5;

		do
		{
		System.out.println("Enter Nuber 1 for withdrawal or 2 for deposit :");

		Scanner s =new Scanner(System.in);
		int a = s.nextInt();
		t--;

		switch(a)
		{
		case 1:
			r.withdrawal();
			break;
		case 2:
			r.deposit();
			break;
		default :
			System.out.println("plz Enter  1 or 2 ");
		}

		}while(t!=0);
		}

	
}
