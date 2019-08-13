package com.zensar;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/dekho")
public class calculate extends HttpServlet {
	
    	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		int a,b,c;
    		a=Integer.parseInt(request.getParameter("num1"));
    		b=Integer.parseInt(request.getParameter("num2"));
    		String s=request.getParameter("operation");
    		if(s.equals("Add"))
    			{
    			c=a+b;
    		RequestDispatcher rd=request.getRequestDispatcher("add");
    		request.setAttribute("c",c);
    		rd.forward(request,response);
    		}
    		
    		else if(s.equals("Subtract"))
			{
			c=a-b;
		RequestDispatcher rd=request.getRequestDispatcher("sub");
		request.setAttribute("c",c);
		rd.forward(request,response);
		}
		
    		else if(s.equals("Multiply"))
			{
			c=a*b;
		RequestDispatcher rd=request.getRequestDispatcher("mul");
		request.setAttribute("c",c);
		rd.forward(request,response);
		}
		
    		else if(s.equals("Divide"))
			{
			c=a/b;
		RequestDispatcher rd=request.getRequestDispatcher("div");
		request.setAttribute("c",c);
		rd.forward(request,response);
		}
		
    		
    	}
    	
    	}
