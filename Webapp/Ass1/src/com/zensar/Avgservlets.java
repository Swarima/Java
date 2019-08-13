package com.zensar;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @WebServlet("/display")
public class Avgservlets extends HttpServlet {
       
        public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sub1;	
		int sub2;
		int sub3;
		int sub4;
		int sub5;
		sub1=Integer.parseInt(request.getParameter("mark1"));
		sub2=Integer.parseInt(request.getParameter("mark2"));
		sub3=Integer.parseInt(request.getParameter("mark3"));
		sub4=Integer.parseInt(request.getParameter("mark4"));
		sub5=Integer.parseInt(request.getParameter("mark5"));
		double avg=(sub1+sub2+sub3+sub4+sub5)/5;
		response.getWriter().println("Average is"+avg);
        }
}
