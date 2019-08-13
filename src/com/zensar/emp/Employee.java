package com.zensar.emp;
import java.util.Scanner;

public class Employee{
	private int empid;
	private String name;
    private double salary;
    private static int cnt;
    
    static
    {
    	cnt=0;
    }
    public Employee()
    {
    	cnt++; //to count no of objects
    }
    public Employee(int id,String n,double s)
    {
    	empid=id;
    	name=n;
    	salary=s;
    }
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("empid, name and salary");
		empid=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
	}
	public void display()
	{
		System.out.println(empid+" "+name+" "+salary);;
	}
	
	public String toString() {
		return empid+ " "+name+" "+salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public static void showCnt()
	{
		System.out.println("no of objects " +cnt);

	}
}

