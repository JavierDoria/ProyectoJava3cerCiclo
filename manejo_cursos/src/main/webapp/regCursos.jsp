<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class ="container">
	<div class ="col-lg-4">
		<h3>Registrar Cursos</h3>
		<form action ="CursoServlet" method ="post">
			<div class="form-group">
				<label>Codigo</label>
				<input class="form-control" type ="text" name="txtCodigo">
			</div>
			<div class="form-group">
				<label>Nombre</label>
				<input class ="form-control" type ="text" name="txtNombre">
			</div>
			<div class="form-group">
				<label>Nivel</label>
				<input class ="form-control" type ="text" name="txtNivel">
			</div>
			<div class="form-group">
				<label>Profesor</label>
				<input class ="form-control" type ="text" name="txtProfesor">
			</div>
			<br>
			<input type="submit" class="btn btn-primary" value="Registrar">
		</form>
	</div>
</div>

</body>
</html>