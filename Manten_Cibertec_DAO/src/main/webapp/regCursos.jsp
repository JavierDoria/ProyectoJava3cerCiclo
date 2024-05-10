<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registro Cursos</title>
</head>
<body>
	<div class="contanier">
		<div class ="col-lg-4">
			<hi>Registrar Cursos</hi>
			
			<form action="CursoServlet?tipo=regist" method ="post">
				<div class ="form-group">
					<label>Codigo</label>
					<input class="form-control"type ="text" name="txtCodigo">
				</div>
				
				<div class ="form-group">
					<label>Nombre</label>
					<input class="form-control"type ="text" name="txtNombre">
				</div>
				
				<div class ="form-group">
					<label>Nivel</label>
					<input class="form-control"type ="text" name="txtNivel">
				</div>
				
				<div class ="form-group">
					<label>Profesor</label>
					<input class="form-control"type ="text" name="txtProfesor">
				</div>
				
				<div class ="button">
					<input type ="submit" class ="btn btn-primary" value ="Registrar">
				</div>
				<br>
				<div class ="button">
					<input type ="submit" class ="btn btn-primary" value ="Registrar">
					<a class ="btn btn-primary" href ="CursoServlet?tipo=list" role ="button">Listar</a>
				</div>
			</form>
		</div>
	</div>
	<script src="code.jquery.com/jquery-latest.js"></script> 
    <script src="cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> 
    <script src="cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>