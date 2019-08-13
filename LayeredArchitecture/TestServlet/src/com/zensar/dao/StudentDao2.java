package com.zensar.dao;

import com.zensar.model.Student;

import java.sql.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDao2 {
		
	public void addStudent(Student s)
	{
		s.setName("illipodA");
		s.setPercentage(49);
		s.setRollno(111);
		
	}

	
	public List<Student> getAllStudent()
	{
		List<Student> list=new ArrayList<>();
			for(Student temp:list)
			{
				temp.display();
				}
			
		}
	public static void main(String[] args) {
		Student s=
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		sess.beginTransaction();
		sess.save(s);
		sess.getTransaction().commit();
		sess.close();
	}

}
