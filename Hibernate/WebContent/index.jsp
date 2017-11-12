<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.controller.Controller"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World
<br><br>

<%-- <jsp:useBean id="adress" class="com.model.Address" scope="session"/> --%>
<%-- <jsp:useBean id="student" class="com.model.Student" scope="session"/> --%>
<%-- <jsp:setProperty name="adress" property="*"/>  --%>
<%-- <jsp:setProperty name="student" property="*"/> --%>
   
   

<form action="Servlet" method="get">
		
	First name<input type = "text" name = "fname"><br>
	Last name <input type = "text" name = "lname"><br>
	M name<input type = "text" name = "mname"><br>
	Street1 <input type = "text" name = "street1"><br>
	Street2 <input type = "text" name = "street2"><br>

		<input type="submit">
		
</form>
	


	
	
	</body>
</html>