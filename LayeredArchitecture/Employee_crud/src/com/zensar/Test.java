package com.zensar;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		EmployeeDao ed=new EmployeeDao();
		ed.createConnection();
		Employee employee =new Employee();
		//ed.addEmployee(employee );
		//System.out.println(ed.addEmployee(employee));
		List<Employee> list=ed.getAllEmployees();
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
	}
	

}
