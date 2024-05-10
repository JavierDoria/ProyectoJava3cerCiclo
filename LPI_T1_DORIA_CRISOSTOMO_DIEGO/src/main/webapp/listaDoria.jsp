<%@page import="entidades.Clientes" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente</title>
</head>
<body>
<div class ="container">
	<div class ="row">
	<div class ="col-6 col-sm-4">
	<h3>Clientes</h3>
	<table class="table-wraped table-bordered">
	<thead>
		<tr>
			<th>Codigo</th>
			<th>Nombre Dueño</th>
			<th>Nombre Mascota</th>
			<th>Fecha De Cita</th>
			<th>Dni</th>
			<th>Nacionalidad</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<Clientes>listCliente =(List<Clientes>) request.getAttribute("lista");
			if(listCliente != null){
				for(Clientes item: listCliente){
					
		%>	
			<tr>
				<td><%= item.getCodigo() %></td>
				<td><%= item.getNombreDuenio() %></td>
				<td><%= item.getNombreMascota() %></td>
				<td><%= item.getFechaCita() %></td>
				<td><%= item.getDni() %></td>
				<td><%= item.getNacionalidad() %></td>
			
			</tr>
		<% 		
				}
			}
		%>
	</tbody>
	</table>
	</div>
	</div>
</div>
</body>
</html>