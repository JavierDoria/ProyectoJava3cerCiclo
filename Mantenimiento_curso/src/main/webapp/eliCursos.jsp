<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar</title>
</head>
<body>
		<form action="CursoServlet">
			<div class="form-group">
				<label class ="text-secundary">Ingresa ID a Eliminar</label>
				<input class="form-group" type="number" name="txtId" placeholder ="ID" >			
			</div>
			<button type="submit">Enviar</button>
		</form>
		<a class ="btn btn-primary" href="CursoServlet?tipo=list" role ="button">Ir a listado</a>

</body>
</html>