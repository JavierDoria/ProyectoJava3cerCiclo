<%@page import="Entidad.Curso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizacion curso</title>
</head>
<body>
	<div class="container">
	<div class="col-lg-4">
		<h2>Detalle Curso</h2>
	
			<%
				Curso curso = (Curso)request.getAttribute("cursoData");
			%>
			
			<form action="CursoServlet" method ="post">
				<input type="hidden" name="idcurso" value="<%= (curso != null)? curso.getId():"" %>">
				<div class="form-group">
					<label class ="text-secundary">Codigo</label>
					<input class="form-group" type="text" name="txtCodigo" value ="<%=(curso != null)? curso.getCodigo():"" %> " >			
				</div>
				
				<div class="form-group">
					<label class ="text-secundary">Nombre</label>
					<input class="form-group" type="text" name="txtNombre" value ="<%=(curso != null)? curso.getNombre():"" %> " >			
				</div>
				
				<div class="form-group">
					<label class ="text-secundary">Nivel</label>
					<input class="form-group" type="text" name="txtNivel" value ="<%=(curso != null)? curso.getNivel():"" %> " >			
				</div>
				
				<div class="form-group">
					<label class ="text-secundary">Profesor</label>
					<input class="form-group" type="text" name="txtProfesor" value ="<%=(curso != null)? curso.getProfesor():"" %> " >			
				</div>
				
				<a class ="btn btn-primary" href ="CursoServlet?tipo=list" role ="button">Regresar al Listar</a>
				
			
			
			</form>
	</div>
	
	</div>

</body>
</html>