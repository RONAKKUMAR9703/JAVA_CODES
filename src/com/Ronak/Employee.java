package com.Ronak;

public class Employee {
	
	String name;
    int yearOfJoining;
    String address;

    public Employee(String n, int y, String a) 
    {
        name = n;
        yearOfJoining = y;
        address = a;
    }

    public void display() {
    	
        System.out.printf(name+" "+yearOfJoining+" "+address);
    }

}
