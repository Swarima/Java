package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Addservelet extends HttpServlet {
	
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
{
	int a,b;
	a=Integer.parseInt(request.getParameter("num1"));
	b=Integer.parseInt(request.getParameter("num2"));
	int c=a+b;
	/**RequestDispatcher rd=request.getRequestDispatcher("sq");
	request.setAttribute("c",c);
	rd.forward(request,response);**/
	//response.getWriter().println("addition is"+c);
	//response.sendRedirect("sq"); //normal using response
	//response.sendRedirect("sq?c="+c);
	
	/**HttpSession session=request.getSession();
	session.setAttribute("c",c);
	response.sendRedirect("sq");**/

	Cookie cookies=new Cookie("c",c+"");
	response.addCookie(cookies);
	response.sendRedirect("sq");

	

}
	
}