package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class calculateservlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		int mark1=Integer.parseInt(request.getParameter("mark1"));
		int mark2=Integer.parseInt(request.getParameter("mark2"));
		int mark3=Integer.parseInt(request.getParameter("mark3"));
		int mark4=Integer.parseInt(request.getParameter("mark4"));
		int mark5=Integer.parseInt(request.getParameter("mark5"));
		
		int total=mark1+mark2+mark3+mark4+mark5;
		int percentage=total/5;
		if(percentage>=90) {
			pw.print("<p style=color:green>Your Grade is O</p>");
		}
		else if(percentage>=80 && percentage<90) {
			pw.print("<p style=color:green>Your Grade is A</p>");
		}
		else if(percentage>=70 && percentage<80) {
			pw.print("<p style=color:yellow>Your Grade is B</p>");
		}
		else if(percentage>=60 && percentage<70) {
			pw.print("<p style=color:orange>Your Grade is C</p>");
		}
		else {
			pw.print("<p style=color:red>Your Grade is F</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
