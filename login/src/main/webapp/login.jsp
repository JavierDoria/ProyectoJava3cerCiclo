<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
crossorigin="anonymous">

<title>Validar</title>
</head>
<body>
	<div class ="container">
		<h2>Iniciar Secion</h2>
		
		<form action="" name ="registro">
		
		<label for="email">Correo</label>
		<input type="email" name="email" id="email" placeholder="Correo"/>
		
		
		<label for="password">Clave</label>
		<input type="password" name="password" id="password" placeholder="contraseña">
		
		
		<button type="submit" class="btn btn-primary" onclick="validar()">Iniciar seccion</button>
		</form>
	</div>
</body>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
<script type="text/javascript">
//JQuery=es una libreria de javascrip......
function validar(){
	const contraseña =document.querySelector('#password').value;
	if(contraseña.length < 5 ){
		alert("Contraseña muy corta") 
	}
}

</script>
</html>