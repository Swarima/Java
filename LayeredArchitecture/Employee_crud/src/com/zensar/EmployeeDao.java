package com.zensar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	private static Connection conn;
	public Connection createConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	return conn;
	}
	
public int addEmployee(Employee employee)
{
PreparedStatement ps;
try {
	Connection con=createConnection();
	ps = con.prepareStatement("insert into Employee values(?,?,?)");

	ps.setInt(1,employee.getEmployee_id());
	ps.setString(2,employee.getEmployee_Name());
	ps.setInt(3,employee.getSalary());
	int result=ps.executeUpdate();
	return result;
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return 0;
}
}
public List<Employee> getAllEmployees()
{	Connection con=createConnection();

	List<Employee> list=new ArrayList<Employee>();
	Statement st;
	try {
		st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee");
		while(rs.next())
		{
			int employee_Id=rs.getInt("employee_Id");
			String employee_Name=rs.getString("employee_Name");
			int salary=rs.getInt("salary");
			Employee e=new Employee(employee_Id,employee_Name,salary);
			list.add(e);
		}
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	
	return list;
}
	
	

}
