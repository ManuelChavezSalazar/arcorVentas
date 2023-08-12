<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
<link rel="stylesheet" type="text/css" href="/arcorVentas/res/css/styles.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
	
<%@ include file='navbar.jsp'%>
<style>
body {
	background-image: url("/arcorVentas/res/img/arcor.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
⁄
</style>
</head>
<body>

	<div class="menu"></div>

	<img class="imagen-zoom" src="/arcorVentas/res/img/logoarcor.jpg"
		alt="Logo de la empresa">

	<div class="cuerpo pb-5">
		<!-- Agrega la clase "pb-5" para dar un relleno inferior al cuerpo -->
		<h1>ARCOR EN CHILE</h1>
		<p class="mb-4 bold-paragraph">Arcor, empresa multilatina con más de 60 años de trayectoria, adquiere la totalidad del patrimonio de la empresa chilena Dos en Uno, con el objetivo de internacionalizar aún más sus negocios en Latinoamérica.

Industria de alimentos Dos en Uno S.A. tiene su origen hace más de cincuenta años en el barrio Franklin. Conocida principalmente por el afamado y querido chicle “Dos en Uno”, convirtiéndose en el símbolo genérico de la goma de mascar en Chile.

En 1993 se inauguró la segunda Planta Industrial de Arcor, ubicada en el sector de Cerrillos, donde se fabrican principalmente productos de la categoría galletas y chocolates.

En 1999 Arcor puso en funcionamiento un moderno centro de distribución clave para el abastecimiento del mercado nacional e internacional. Centro que cuenta con 10.000 m2 y 17.000 posiciones para pallets..</p>
		
		<h1>NUESTRO NEGOCIO</h1>
		<p class="mb-5 bold-paragraph">La producción de golosinas es la actividad que dio origen a la empresa Arcor en 1951 y la que, en mayor medida, ha contribuido a su renombre y prestigio internacional. Arcor es el primer productor de caramelos del mundo; el principal exportador de golosinas de Argentina, Brasil y Chile. En Chile es líder en el mercado de chicles y caramelos.

Hoy Arcor se encuentra presente en las categorías de Galletas, Chicles, Chocolates, Caramelos y Conservas..</p>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
<%@ include file='footer.jsp'%>
</body>
</html>