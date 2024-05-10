<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
crossorigin="anonymous">
<title>Registro</title>
</head>
<body>
	<div class="container">
	<h2>Registrar Usuario</h2>
	<form action ="" name ="registro">
	
		<label for="names" >Nombres</label>
		<input type="text" name="names" id="name" placeholder="nombre">
		
		<label for="apellidos" >Apellidos</label>
		<input type="text" name="apellidos" id="apellidos" placeholder="apellidos">
		
		<label for="email" >Correo</label>
		<input type="email" name="email" id="email" placeholder="correo">
		
		<label for="password" >Contraseña</label>
		<input type="password" name="password" id="password" placeholder="Contraseña">
	
		<button type="submit" class="btn btn-primary">Registrar</button>
	
	</form>
	</div>
</body>
<script type="text/javascript" src="ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
<script type="text/javascript">
$(function(){
	$("form[name='registro']").validate({
		rules:{	
			email:{
				names :"required",
				apellidos: "required",
				password:{
					required :true,
					password:true
				},
				password:{
						names :"Ingrese su nombre",
						apellidos:"Ingrese apellido"
						},
						email:"Ingrese el correo"
						},
						submitHandler:function(from){
							form.submit();
							}
				});
});
</script>
</html>