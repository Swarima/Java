package com.zensar.dao;


import com.zensar.model.Student;

import java.sql.*;
import java.util.*;

public class StudentDao {
	
	private static Connection conn;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","root");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("class loaded");
		
	}
	
	
	public void addStudent(Student s)
	{
		try {
			
		PreparedStatement	ps=conn.prepareStatement("insert into stud values(?,?,?)");
		ps.setInt(1,s.getRollno());
		ps.setString(2,s.getName());
		ps.setDouble(3,s.getPercentage());
		ps.execute();
		conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
System.out.println("class connection");

	}
	
	public List<Student> getAllStudent()
	{
		List<Student> list=new ArrayList<>();
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs=st.executeQuery("select * from Stud");
			while(rs.next())
			{
				Student s=new Student();
				s.setRollno(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setPercentage(rs.getInt(3));
				list.add(s);
			}
			for(Student temp:list)
			{
				temp.display();
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}

}
