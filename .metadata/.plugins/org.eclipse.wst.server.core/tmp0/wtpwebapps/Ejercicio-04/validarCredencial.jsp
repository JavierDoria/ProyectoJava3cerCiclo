<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validacion</title>
</head>
<body>
	<%
		String mensaje ="";
		String rol = request.getParameter("cboRol");
		String credencial=request.getParameter("txtCredencial");
		mensaje ="Datos Validados Correctamente";
		request.setAttribute("msj", mensaje);
		pageContext.forward("respuestaValidacion.jsp");
	%>
</body>
</html>