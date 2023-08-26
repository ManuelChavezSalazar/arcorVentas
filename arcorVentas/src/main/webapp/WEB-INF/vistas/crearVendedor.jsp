<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Vendedor</title>
</head>
<body>
    <h1>Crear Vendedor</h1>
    
    <form:form modelAttribute="vendedor" action="/arcorVentas/CrearVendedor" method="post">
        <label for="idRuta">ID de Ruta:</label>
        <form:input path="idRuta" id="idRuta" /><br>
        
        <label for="nombreVendedor">Nombre del Vendedor:</label>
        <form:input path="nombreVendedor" id="nombreVendedor" /><br>
        
        <label for="correoVendedor">Correo del Vendedor:</label>
        <form:input path="correoVendedor" id="correoVendedor" /><br>
        
        <label for="fechaIngreso">Fecha de Ingreso:</label>
        <form:input path="fechaIngreso" id="fechaIngreso" /><br>
        
        <button type="submit">Crear Vendedor</button>
    </form:form>
</body>
</html>
