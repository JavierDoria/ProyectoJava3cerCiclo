<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Principal</title>
</head>
<body>
	<div class ="container">
		<div class ="col-lg-2">
			<h3 class="h3">Cursos Virtuales</h3>
			<br>
			<table class ="table table hover">
				<thead>
					<tr></tr>
				
				</thead>
				<body>
					<tr>
						<td>
							<a href ="CursoServlet?tipo=list">Mantenimiento Cursos</a>
						</td>
					</tr>
					
					<tr>
						<td>
							<a href ="CursoServlet?tipo=list">Mantenimiento Estudiantes</a>
						</td>
					</tr>
					
					<tr>
						<td>
							<a href ="CursoServlet?tipo=list">Mantenimiento Profesores</a>
						</td>
					</tr>
					
					<tr>
						<td>
							<a href ="CursoServlet?tipo=list">Cerrar Secion</a>
						</td>
					</tr>
				</body>
			</table>
		</div>
	</div>



<script src="code.jquery.com/jquery-latest.js"></script> 
    <script src="cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> 
    <script src="cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>


</body>
</html>