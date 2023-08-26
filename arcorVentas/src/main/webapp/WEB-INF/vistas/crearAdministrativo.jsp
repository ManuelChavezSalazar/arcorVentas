<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Administrativo</title>
</head>
<body>
    <h1>Crear Administrativo</h1>
    
    <form:form modelAttribute="administrativo" action="/arcorVentas/CrearAdministrativo" method="post">
    	 <label for="area">Área del Administrativo:</label>
        <form:input path="area" id="area" /><br>
        
        <label for="correoAdmin">Correo del Administrativo:</label>
        <form:input path="correoAdmin" id="correoAdmin" /><br>
        
        <!-- Puedes agregar más campos aquí según los atributos de Administrativo -->
        
        <button type="submit">Crear Administrativo</button>
    </form:form>
</body>
</html>
