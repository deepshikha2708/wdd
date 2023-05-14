<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section{
	width:20%;
	margin-top:15%;
	margin-left:auto;
	margin-right:auto;
	border:1px solid black;
	padding:1%;
	}
</style>
</head>
<body>
<section>
<%
String studentname=(String)request.getParameter("studentname");
String fathername=(String)request.getParameter("fathername");
String mothername=(String)request.getParameter("mothername");
String gender=(String)request.getParameter("gender");
String date=(String)request.getParameter("date");
String email=(String)request.getParameter("email");
String level=(String)request.getParameter("level");
String mobile=(String)request.getParameter("mobile");

out.print("Student name: "+ studentname+"<br>");
out.print("Father name: "+ fathername+"<br>");
out.print("Mother name: "+ mothername+"<br>");
out.print("Gender: "+ gender+"<br>");
out.print("Date: "+ date+"<br>");
out.print("Email: "+ email+"<br>");
out.print("Education Level: "+ level+"<br>");
out.print("Mobile: "+ mobile+"<br>");
%>
</section>
</body>
</html>
