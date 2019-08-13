package com.zensar.services;



import java.sql.SQLException;
import java.util.*;

//import java.sql.*;

import com.zensar.dao.StudentDao;
import com.zensar.model.Student;

public class StudentService {
private StudentDao dao;

	public void insertIntoTable(Student s)
	{
		dao=new StudentDao();
		dao.addStudent(s);
	}
	public List<Student> getAllStudent()                        
	{
		dao=new StudentDao();
		return dao.getAllStudent();
	}
	
}
