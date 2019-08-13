package com.zensar.ui;

import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.model.Student;
import com.zensar.services.StudentService;

@WebServlet("/studserv")
public class Studentservlet extends HttpServlet {
		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("text");
			Student s=new Student();
			String operation=request.getParameter("btn");
			StudentService ss=new StudentService();
			System.out.println(operation);
			if(operation.equals("register"))
			{			
				s.setName(request.getParameter("name"));
				s.setRollno(Integer.parseInt(request.getParameter("rollno")));
			s.setPercentage(Integer.parseInt(request.getParameter("percentage")));
			//s.display();
		//System.out.println("hi");
		
		ss.insertIntoTable(s);
		response.setContentType("text/html");
		response.getWriter().println("<h2> thankyou for register </h2>");
			}
			else if(operation.equals("show"))
			{
				List<Student> list=ss.getAllStudent();
				for(Student temp:list)
			{
					response.setContentType("text/html");
					response.getWriter().println("<h2>"+temp.getRollno()+" "+temp.getName()+" "+temp.getPercentage()+"</h2>");
										
			}
			
			}
			
		}
}