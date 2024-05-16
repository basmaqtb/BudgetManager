<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@page isELIgnored="fa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	
	
	<%
	String name=(String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends= (List<String>) request.getAttribute("f");
	LocalDateTime time=(LocalDateTime) request.getAttribute("time");

	%>
	
	<h1>Name is    <%=name%>
	</h1>
	
	<h1>
	Id is <%=id%>
	</h1>
	
	<h1>
	time is 
	${time}
	</h1>
	
	
	<h1>${f }</h1>
				
</body>
</html>
