<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<div class="container">
		<div class ="col-lg-4">
			<h3>Registrar Clientes</h3>
			<form action="ClientesServlet" method ="post">
				<div class="form-group">
					<label>Nombre Dueño</label>
					<input class="form-control" type="text" name="txtNombre">
				</div>
				<div class ="form-group">
					<label>Nombre Mascota</label>
					<input class="form-control" type ="text"name ="txtMascota">
				</div>
				<div class="form-group">
					<label>Fecha Cita</label>
					<input class="form-control" type="text" name="txtCita">	
				</div>
				<div class="form-group">
					<label>Dni</label>
					<input class="form-control" type="text" name="txtDni">	
				</div>
				<div class="form-group">
					<label>Nacionalidad</label>
					<input class="form-control" type="text" name="txtNacionalidad">	
				</div>
				<br>
				<input type ="submit"  class="btn btn-primary"value="registrar">			
			</form>
		</div>
	</div>
</body>
</html>