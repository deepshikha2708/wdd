<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int find_factorial(int n)
{
	if(n==0)
		return 1;
	return n*find_factorial(n-1);
}
%>
<%
String inp=request.getParameter("num");
if(inp!=null)
{
	int px=Integer.parseInt(inp);
	int fact=find_factorial(px);
	out.println("<h1 style=color:blue>Factorial = " + fact+"</h1");
}
%>

</body>
</html>
