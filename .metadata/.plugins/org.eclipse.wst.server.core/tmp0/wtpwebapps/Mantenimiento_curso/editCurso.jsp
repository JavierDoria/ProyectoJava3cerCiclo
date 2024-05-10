<%@page import="Entidad.Curso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<title>Modificar Curso</title>
</head>
<body>
	<div class="container">
		<div class="col-lg-4">
			<h2 class="h4">Actualizar Curso</h2>
			<%
				Curso curso=(Curso)request.getAttribute("cursoData");
			%>
			<form action="CursoServlet?tipo=edit"method ="post">
			<input type="hidden" name ="idCurso" value="<%=(curso != null)? curso.getId():"" %>">
			
			<div class="form-group">
				<label class="text-secundary">Codigo</label>
				<input class="form-group" type ="text" name="txtCodigo" value="<%=(curso != null)? curso.getCodigo():"" %>">
			</div>
			
			<div class="form-group">
				<label class="text-secundary">Nombre</label>
				<input class="form-group" type ="text" name="txtNombre" value="<%=(curso != null)? curso.getNombre():"" %>">
			</div>
			
			<div class="form-group">
				<label class="text-secundary">Nivel</label>
				<input class="form-group" type ="text" name="txtNivel" value="<%=(curso != null)? curso.getNivel():"" %>">
			</div>
			
			<div class="form-group">
				<label class="text-secundary">Profesor</label>
				<input class="form-group" type ="text" name="txtProfesor" value="<%=(curso != null)? curso.getProfesor():"" %>">
			</div>
			<br>
			<div class="button">
				<input class="btn btn-primary" type="submit" value ="Actualizar" >
				<a class="btn btn-primary" href="CursoServlet?tipo=list">Regresar Listado</a>
			</div>
			</form>
		
		</div>
	
	</div>
<script src="code.jquery.com/jquery-latest.js"></script> 
    <script src="cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> 
    <script src="cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</body>
</html>