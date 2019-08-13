package com.zensar;

public class Employee {
private int employee_id;
private String employee_Name;
private int salary;
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_Name() {
	return employee_Name;
}
public void setEmployee_Name(String employee_Name) {
	this.employee_Name = employee_Name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", employee_Name=" + employee_Name + ", salary=" + salary + "]";
}
public Employee(int employee_id, String employee_Name, int salary) {
	super();
	this.employee_id = employee_id;
	this.employee_Name = employee_Name;
	this.salary = salary;
}
public Employee() {
	super();
}


}
