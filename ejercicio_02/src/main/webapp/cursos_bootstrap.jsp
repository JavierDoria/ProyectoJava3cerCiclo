<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
crossorigin="anonymous">

<title>Listado cursos</title>
</head>
<body>
	<div class="col-lg-8">
	<h2>Cursos Disponibles<span class="badge bg-secondary">Nuevos</span></h2>
	
	<table class = "table table-success table-striped">
		<thead>
		<tr class ="bg-info">
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
				<button type="button" class ="btn btn-primary">Editar</button>
				<button type="button" class ="btn btn-danger">Eliminar</button>
			</td>
		</tr>
		<tr>
			<td>2</td>
			<td>1956</td>
			<td>Desarrollo de Aplicaciones Moviles 1</td>
			<td>Avanzado</td>
			<td>Diana Vera</td>
			<td>
				<button type="button" class ="btn btn-primary">Editar</button>
				<button type="button" class ="btn btn-danger">Eliminar</button>
			</td>
		</tr>
		<tr>
			<td>3</td>
			<td>7878</td>
			<td>Programacion Orientada Objetos 1</td>
			<td>Intermedio</td>
			<td>Julio Sanchez<</td>
			<td>
				<button type="button" class ="btn btn-primary">Editar</button>
				<button type="button" class ="btn btn-danger">Eliminar</button>
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