<%@page import="entidades.Curso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado Cursos</title>
</head>
<body>
<div class="container">
	<div class ="row">
		<div class ="col-6 col-sm-4">
		<h3>Cursos Disponibles</h3>
		
		<table class ="table-wraped table-bordered">
		<thead>
			<tr>
				<th>Id</th>
				<th>Codigo</th>
				<th>Nombre</th>
				<th>Nivel</th>
				<th>Profesor</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<Curso> listCurso = (List<Curso>)  request.getAttribute("list");
				
				if(listCurso != null){
					for(Curso item: listCurso){
			%>	
				<tr>
					<td><%= item.getId() %></td>
					<td><%= item.getCodigo() %></td>
					<td><%= item.getNombre() %></td>
					<td><%= item.getNivel() %></td>
					<td><%= item.getProfesor() %></td>
				</tr>
			<% 
					}
			} else{
				%>

					<h5>Lista es Nula</h5>
				
				<%
				
			}
			%>	
		</tbody>
		</table>
		</div>
	</div>
</div>
</body>
</html>