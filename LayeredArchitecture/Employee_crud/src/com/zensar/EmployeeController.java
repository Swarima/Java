package com.zensar;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

public class EmployeeController extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		//addEmployee(request, response);
	}

	public void viewAllEmployee(HttpServletRequest request,HttpServletResponse response)
	{
		EmployeeDao ed=new EmployeeDao();
		List<Employee> list=ed.getAllEmployees();
		HttpSession session=request.getSession();
		session.setAttribute("list", list);
	}
	private void addEmployee(HttpServletRequest request, HttpServletResponse response) {
		int Employee_Id=Integer.parseInt(request.getParameter("EmployeeId"));
		String Employee_Name=request.getParameter("EmployeeName");
		int salary=Integer.parseInt(request.getParameter("Salary"));
//System.out.println(Employee_Id);
	
	EmployeeDao ed=new EmployeeDao();
	int result=ed.addEmployee(new Employee(Employee_Id,Employee_Name,salary));
	try {
		response.sendRedirect("Sucess.jsp");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
