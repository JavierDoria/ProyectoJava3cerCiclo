<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
crossorigin="anonymous">
<title>Empleados</title>
</head>
<body>
	<h1>Formularios Empleados</h1>
	<div class ="container">
		<form action ="" method="post" class="form-group">
		
			<label for ="lbl_codigo"><b>Codigo:</b></label>
			<input type ="number" name ="txt_codigo" id="txt_codigo" class ="form-group" placeholder="Ejemplo: 001" required >
			<label for ="lbl_nombre"><b>Nombre</b></label>
			<input type ="text" name ="txt_nombre" id="txt_nombre" class ="form-group" placeholder="Ejemplo: E001" required>
			<label for="lbl_apellido"><b>Apellido</b></label>
			<input type ="text" name ="txt_apellido" id="txt_apellido" class ="form-group" placeholder="Ejemplo: E001" required>
			<label for="lbl_direccion"><b>Direccion</b></label>
			<input type =text" name="txt_direccion" id ="txt_direccion" class ="form-group" placeholder="Ejemplo: #Calle Mz Lt" required>
			<label for ="lbl_telefono"><b>Telefono</b></label>
			<input type ="number" name ="txt_telefono" id="txt_telefono" class="form-group" placeholder ="Ejemplo: 555555555" required>
			<label for="lbl_fn"><b>Fecha_Nacimiento</b></label>
			<input type="date" name="txt_fn" id="txt_fn" class="form-group" required>
			<select name ="drop_sangre" id ="drop_sangre" class="form-control">
				<option value ="1">opcion 1</option>
				<option value ="2">opcion 2</option>
				<option value ="3">opcion 3</option>
	</select>
	<br>
	<button type="button" name ="btn_agregar" id="btn_agregar" class ="btn btn-primary">Agregar</button>
		</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
	crossorigin="anonymous"></script>
</body>
</html>