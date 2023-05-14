package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



public class login extends HttpServlet {

protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 

	PrintWriter pw =res.getWriter();
	res.setContentType("text/html");
	String name= req.getParameter("username");
	String pwd = req.getParameter("userpass");
	boolean status=false;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wdd?useSSL=false","root","St@sneha27");
		
		java.sql.PreparedStatement ps = connection.prepareStatement("select * from table1 where username = ? and password = ?");
		ps.setString(1, name);
		ps.setString(2, pwd);
		System.out.println(ps);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
	}
	catch(SQLException | ClassNotFoundException e) {
		System.out.println(e);
	}
	
	if(status) {
		pw.print("<p style=color:green>welcome </p>");
	}
	else {
		pw.print("<p style=color:red>Username and Password invalid</p>");
	}
	
	
	}

protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 
doGet(req,res);
}
