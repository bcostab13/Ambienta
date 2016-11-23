<%-- 
    Document   : proyecto
    Created on : 13/11/2016, 06:34:07 PM
    Author     : BRENDA
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Proyecto</title>
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css" />' />
        <!-- Custom CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/simple-sidebar.css" />' />
        <!-- Basic styles of the plugin -->
  	<link rel="stylesheet" href='<c:url value="/resources/rateyo/jquery.rateyo.css" />'/>        
        <script src='<c:url value="/resources/js/jquery-3.1.0.min.js" />'></script>
        <script src='<c:url value="/resources/js/proyecto.js" />'></script>
    </head>
    <body>
        <h1>Evaluacion</h1>
        <button onclick="f_sistemaexperto()">Prueba</button>
        
    </body>
</html>
