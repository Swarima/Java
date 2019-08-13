package com.zensar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Addservlet extends HttpServlet {
		protected void se(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//int a=Integer.parseInt(request.getParameter("num1"));
			//int b=Integer.parseInt(request.getParameter("num2"));
			int c=(int)request.getAttribute("c");
			//c=a+b;
			response.getWriter().println("Addition is"+c);
			
		
		
		
		
		}
}