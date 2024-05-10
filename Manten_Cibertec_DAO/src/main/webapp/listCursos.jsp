<%@page import="entidades.Curso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Listar Cursos</title>
</head>
<body>
	<div class ="container">
		<div class="row">
			<div class ="col-6 col-sm-4">
				<h1>Cursos Disponibles</h1>
				
				<table class="table-wraped">
					<thead>
						<tr>
							<th>id</th>
							<th>Codigo</th>
							<th>Nombre</th>
							<th>Nivel</th>
							<th>Profesor</th>
							<th>Acciones</th>
						</tr>
					</thead>
					
					<tbody>
					<%
						List<Curso> listCurso = (List<Curso>)request.getAttribute("lista");
					if(listCurso != null){
						for(Curso item: listCurso){
					%>
						<tr>
							<td><%=item.getId() %></td>
							<td><%=item.getCodigo() %></td>
							<td><%=item.getNombre() %></td>
							<td><%=item.getNivel() %></td>
							<td><%=item.getProfesor() %></td>
							<td>
								<a href="CursoServlet?tipo=info&id=<%= item.getId() %>">
									<img alt="" src="img/ic_info-1.svg" width ="15" height="15" title="Detalle">
								</a>
								<a href="CursoServlet?tipo=modif&id=<%= item.getId() %>">
								<img alt="" src="img/ic_edit.svg" width ="15" height="15" title="Editar">
								</a>
								<a href="CursoServlet?tipo=delete&id=<%= item.getId() %>">
								<img alt="" src="img/delete-delete-6.svg" width ="15" height="15" title="Eliminar">
								</a>
								
								
							</td>
						</tr>
					<%
						}
					}
					%>
					</tbody>
				</table>
				<br>
				<a class="btn btn-primary"  href ="regCursos.jsp" role ="button">Nuevo Curso</a>
			</div>
		</div>
	
	</div>



	<script src="code.jquery.com/jquery-latest.js"></script> 
    <script src="cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> 
    <script src="cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>