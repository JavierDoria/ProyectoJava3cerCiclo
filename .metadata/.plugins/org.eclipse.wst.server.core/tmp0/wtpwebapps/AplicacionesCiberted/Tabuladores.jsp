<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
crossorigin="anonymous">
<title>Ciberted</title>

</head>
<body>
<div class ="container">
	<div>
	<ul class ="nav nav-tabs">
		<li class ="nav-item">
			<a class ="nav-link active" aria-current="page" href="#">Principal</a>			
		</li>
		<li class="nav-item dropdown">
			<a class ="nav-link dropdown-toggle " data-bs-toggle="dropdown" href ="#" role ="button" aria-expanded="false">Mantenedores</a>
				<ul class="dropdown-menu">
					<li><a class="dropdown-item" href="#" >Productos</a></li>
					<li><a class="dropdown-item" href="#">Ventas</a></li>
					<li><a class="dropdown-item" href="#">Almacen</a></li>
					<li><a class="dropdown-item" href="#">Ayuda</a></li>
				</ul>
		</li>
		<li class ="nav-item" >
			<a class="nav-link" href="#">Reportes</a>
		</li>
		<li class ="nav-item">
			<a class ="nav-link disable">Soporte</a>
		</li>
	</ul>
	</div>
	
	<br>
	<div class="accordion" id="accordionPanelsStayOpenExample">
  		<div class="accordion-item">
    		<h2 class="accordion-header" id="panelsStayOpen-headingOne">
      			<button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseOne" aria-expanded="true" aria-controls="panelsStayOpen-collapseOne">
        			Principales Noticias
      			</button>
    </h2>
    <div id="panelsStayOpen-collapseOne" class="accordion-collapse collapse show" aria-labelledby="panelsStayOpen-headingOne">
      	<div class="accordion-body">
        	<strong>Aviso Importante</strong> It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.
     	 </div>
    </div>
	
	</div>
	<div class="accordion-item">
    		<h2 class="accordion-header" id="panelsStayOpen-headingOne">
      			<button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseOne" aria-expanded="true" aria-controls="panelsStayOpen-collapseOne">
       				 Ultimas Noticias
      			</button>
    </h2>
    <div id="panelsStayOpen-collapseOne" class="accordion-collapse collapse show" aria-labelledby="panelsStayOpen-headingOne">
      	<div class="accordion-body">
       	 	<strong>Aviso Importante</strong> It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow.
      	</div>
    </div>
	</div>
</div>
<br>
<div class="card text-center">
	<div class ="card-header">
		footer
	</div>
	<div class="card-body">
		<h5 class="card-tittle">Ciberted</h5>
		<p class ="card-text">Creado y soportado por Cibertec</p>
		<a href="#" class ="btn btn-primary">Contactenos</a>
	</div>
	<div class ="card-footer text-muted">
		2023
	</div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
	crossorigin="anonymous"></script>
</html>