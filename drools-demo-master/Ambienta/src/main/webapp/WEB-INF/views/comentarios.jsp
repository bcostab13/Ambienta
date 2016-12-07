<%-- 
    Document   : comentarios
    Created on : 26/11/2016, 05:32:58 PM
    Author     : BRENDA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css" />' />
        <!-- Custom CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/simple-sidebar.css" />' />
        <!-- Basic styles of the plugin -->
  	<link rel="stylesheet" href="<c:url value="/resources/rateyo/jquery.rateyo.css" />"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/empresa.css" />"/>
        <script src="<c:url value="/resources/js/comentarios.js" />"></script>
        <script src='<c:url value="/resources/js/jquery-3.1.0.min.js" />'></script>
        <!--<script src='<c:url value="/resources/js/proyecto.js" />'></script>-->
        <title>JSP Page</title>
        
            
    </head>
    <body>
        <h1>Analisis de Sentimientos</h1>
        <button onclick="analisisSent()">Presioname</button>
    </body>
</html>
