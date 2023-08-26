<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Crear Supervisor</title>
</head>
<body>
    <h1>Crear Supervisor</h1>
    
    <form:form modelAttribute="supervisor" action="/arcorVentas/CrearSupervisor" method="post">
        <label for="nombreSupervisor">Nombre del Supervisor:</label>
        <form:input path="nombreSupervisor" id="nombreSupervisor" /><br>
        
        <label for="correoSupervisor">Correo del Supervisor:</label>
        <form:input path="correoSupervisor" id="correoSupervisor" /><br>
        
        <!-- Puedes agregar más campos aquí según los atributos de Supervisor -->
        
        <button type="submit">Crear Supervisor</button>
    </form:form>
</body>
</html>
