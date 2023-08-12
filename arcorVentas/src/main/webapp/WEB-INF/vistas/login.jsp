<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/arcorVentas/res/css/styles.css">
<title>Login</title>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<style>

body {
	margin: 0;
  	padding: 0;
    background-image: url("/arcorVentas/res/img/Arcor-2.jpeg");
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center; /* Alinea la imagen en el centro */
}
/* Estilos para pantallas más pequeñas */
@media (max-width: 768px) {
    .form-login {
        width: 100%; /* Ancho completo en pantallas pequeñas */
        margin: 150px 0 0 0; /* Ajusta el margen para centrar verticalmente */
        /* Otros ajustes de estilos para pantallas pequeñas */
    }
}
</style>
</head>
<header><img class="imagen-zoom" src="/arcorVentas/res/img/logoarcor.jpg" alt="Logo de la empresa"></header>
<body>
<div class=form-container>
<%
String error = (String) request.getAttribute("error");
if (error != null && error.equals("true")) {
    // Código JavaScript para mostrar la alerta de error
	out.println("<script>Swal.fire('Error de Autenticación', 'Verifica tus credenciales', 'error');</script>");
}
%>
<section class="form-login">
<h5>Login</h5>
<form name= "loginForm" class="form" action="${pageContext.request.contextPath}/login" method="post"> <!-- Utilizamos la sintaxis de Thymeleaf para el atributo 'action' -->
  <label for="username">Usuario:</label><br>
  <input class="caja" type="text" name="username" placeholder="Introduce nombre"><br><br> <!-- Corregimos el nombre del campo a 'username' -->

  <label for="password">Clave de acceso:</label><br>
  <input class="caja" type="password" name="password" placeholder="Introduce contraseña"><br><br>
  
  <div style="display: flex; justify-content: center;">
    <input type="submit" value="Ingresar" class="boton-enviar">
  </div>
</form>
</section>

</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
<%@ include file='footer.jsp'%>
</body>
</html>