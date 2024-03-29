package com.zensar.model;

import javax.persistence.*;

import com.zensar.services.StudentService;
@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private double percentage;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public void display()
	{
		System.out.println(rollno+"\t"+name+"\t"+percentage);
	}
	
}
