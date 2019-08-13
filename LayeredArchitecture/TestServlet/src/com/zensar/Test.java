package com.zensar;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Student;

public class Test {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setName("illipodA");
		s1.setPercentage(49);
		s1.setRollno(111);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		sess.beginTransaction();
		sess.save(s1);
		sess.getTransaction().commit();
		sess.close();

	}

		}


