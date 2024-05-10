<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizacion</title>
</head>
<body>
	<% String msg =(String)request.getAttribute("msj");%>
	<h2 align="center" >Mensaje: <%=msg %></h2>

</body>
</html>