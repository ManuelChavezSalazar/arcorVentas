 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Usuario</title>
</head>
<body>
    <h1>Crear Usuario</h1>
    
    <form:form modelAttribute="usuario" action="/arcorVentas/CrearUsuario" method="post">
        <label for="run">RUN:</label>
        <form:input path="run" id="run" /><br>
        
        <label for="nombre">Nombre:</label>
        <form:input path="nombre" id="nombre" /><br>
        
        <label for="apellido">Apellido:</label>
        <form:input path="apellido" id="apellido" /><br>
              
        <label for="tipo">Tipo de Usuario:</label>
        <form:select path="tipo" id="tipo">
            <form:option value="Vendedor">Vendedor</form:option>
            <form:option value="Supervisor">Supervisor</form:option>
            <form:option value="Administrativo">Administrativo</form:option>
        </form:select><br>
        
        <button type="submit">Crear</button>
    </form:form>

</body>
</html>