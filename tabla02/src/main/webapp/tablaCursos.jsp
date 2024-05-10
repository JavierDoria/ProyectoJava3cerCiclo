<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
crossorigin="anonymous">


<title>Tabla de Cursos</title>
</head>
<body>
<div class="col-lg-8">
	<h3>Cursos Disponibles</h3>
	
	<form action="subjectServlet" method="post">
		<div class ="form-group">
		<label>Codigo</label>
		<input class ="form-control" type ="text" name="txtCodigo" value ="">
		</div>
		<br>
		
		<div class ="form-group">
		<label>Curso</label>
		<input class ="form-control" type ="text" name="txtCurso" value="">
		</div>
		<br>
		
		<div class="form-group">
		<label>Alumno</label>
		<input class="form-control" type="text" name="txtAlumno" value="">
		</div>
		<br>
	
		<div class ="form-group">
		<label>Profesor</label>
		<input class ="for-control" type ="text" name="txtProfesor" value ="">
		</div>
		<br>
		<input type="submit" class ="btn btn-info" value="Enviar Datos">
		</form>
		<br>
		
		<table class="table"border ="1">
			<thead>
			<tr>
				<th>Id</th>
				<th>Codigo</th>
				<th>Curso</th>
				<th>Alumno</th>
				<th>Profesor</th>
				<th>Opciones</th>
			<tr>
			</thead>
			<tbody>
			<tr>
				<td>1</td>
				<td>2024</td>
				<td>Matematica</td>
				<td>Doria Crisostomo, Javier</td>
				<td>Sin Nombre</td>
				<td>
					<button type ="button" class="btn btn-success">Editar</button>
					<button type ="button" class="btn btn-danger">Eliminar</button>
				</td>
			</tr>
			<tr>
				<td>2</td>
				<td>2024</td>
				<td>Comunicacion</td>
				<td>Doria Crisostomo, Javier</td>
				<td>Sin Nombre</td>
				<td>
					
					<input type ="submit" value ="Editor">
					<input type ="submit" value ="Eliminar">
				</td>
			</tr>
			<tr>
				<td>3</td>
				<td>2024</td>
				<td>Informatica</td>
				<td>Doria Crisostomo, Javier</td>
				<td>Sin Nombre</td>
				<td>
					<input type ="submit" value ="Editor">
					<input type ="submit" value ="Eliminar">
				</td>
			</tr>
			</tbody>
		</table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
	crossorigin="anonymous"></script>

</body>
</html>