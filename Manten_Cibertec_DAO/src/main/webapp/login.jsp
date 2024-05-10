<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

 	<%
				String error = (String)request.getAttribute("mensaje");
			
	%>
			

	<div class = "container"style="margin-top:80px">
	<form action="LoginServlet"method="post">
		<div class="card" style="width: 30rem">
			<div class="card-body">
				<h2 class="h3">Iniciar Sesion</h2>
				<input type="text" name="txtUsuario" class="form-control mt-2" placeholder ="Ingrese Usuario" required="required">
				<input type ="password" name ="txtClave" class="form-control" placeholder="Ingrese Clave" required="required">
				<input type="submit" class="btn btn-prmary btn-block mt-2" value ="Ingresar"> 
			</div>
			<%
				if(error != null){
			%>
			<em><%=error%></em>
			<% 
				}			
			%> 			
			
			
		</div>
	</form>
	
	
	</div>




	<script src="code.jquery.com/jquery-latest.js"></script> 
    <script src="cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> 
    <script src="cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</body>
</html>