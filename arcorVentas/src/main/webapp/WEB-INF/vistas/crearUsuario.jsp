<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
        crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="/arcorVentas/res/css/styles.css">

    <meta charset="UTF-8">
    <style>
        body {
            background-image: url("/arcorVentas/res/img/imagelogin.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
        
  label {
    font-weight: bold;
  }

    </style>

    <title>Formulario de Usuario</title>
</head>

<body>
    <%@ include file='navbar.jsp'%>
    <img class="imagen-zoom" src="/arcorVentas/res/img/logoarcor.jpg"
		alt="Logo de la empresa">
    <div class="usuario" style="display: flex; justify-content: center;">

        <form action="/arcorVentas/CrearUsuario" method="post" class="mb-5 mt-5">
            <h1 class="tituloUsuario">Formulario de Usuario</h1>
            <label for="nombre">Nombre:</label><br>
            <input type="text" id="nombre" name="nombre"><br><br>
            <label for="apellido">Apellido:</label><br>
            <input type="text" id="apellido" name="apellido"><br><br>
            <label for="run">RUN:</label><br>
            <input type="text" id="run" name="run"><br><br>
            <label for="tipo">Tipo:</label><br>
            <input type="text" id="tipo" name="tipo"><br><br>

            <div style="display: flex; justify-content: center;" class="mb-5">
                <input type="submit" value="Enviar" class="boton-enviar">
            </div>

        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
        crossorigin="anonymous"></script>

    <%@ include file='footer.jsp'%>

</body>

</html>
