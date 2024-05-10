<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 02</title>
</head>
<body>
<div class ="col-lg-8">
	<h3> Registrar Cursos</h3>
	
	<form action ="subjectServlet" method="post">
		<div class ="form-group">
		<label>Codigo</label>
		<input class ="form-control" type = "text" name="txtCodigo" value ="">
		</div>
		<br>
		<div class ="form-group">
		<label>Nombre</label>
		<input class ="form-control" type = "text" name="txtNombre" value ="">
		</div>
		<br>
		<div class ="form-group">
		<label>Nivel</label>
		<input class ="form-control" type = "text" name="txtNivel" value ="">
		</div>
		<br>
		<div class ="form-group">
		<label>Profesor</label>
		<input class ="form-control" type = "text" name="txtProfesor" value ="">
		</div>
		<br>
		<input type ="submit" class = "btn-primary"value ="Enviar Datos">
	</form>
	<br>
	
	<table class = "table"border ="1">
		<thead>
		<tr>
			<th>Id</th>
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Nivel</th>
			<th>Profesor</th>
			<th>Opciones</th>
		</tr>
		</thead>
		<tbody>
		<tr>
			<td>1</td>
			<td>2414</td>
			<td>Seguridad de Aplicaiones</td>
			<td>Intermedio</td>
			<td>Jose Gomez</td>
			<td>
				<input type="submit" value ="Editar">
				<input type="submit" value ="Eliminar">
			</td>
		</tr>
		<tr>
			<td>2</td>
			<td>1956</td>
			<td>Desarrollo de Aplicaciones Moviles 1</td>
			<td>Avanzado</td>
			<td>Diana Vera</td>
			<td>
				<input type="submit" value ="Editar">
				<input type="submit" value ="Eliminar">
			</td>
		</tr>
		<tr>
			<td>3</td>
			<td>7878</td>
			<td>Programacion Orientada Objetos 1</td>
			<td>Intermedio</td>
			<td>Julio Sanchez<</td>
			<td>
				<input type="submit" value ="Editar">
				<input type="submit" value ="Eliminar">
			</td>
		</tr>
		</tbody>
	</table>
	
</div>
</body>

</html>