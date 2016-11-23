<%-- 
    Document   : inicio
    Created on : 18/10/2016, 10:46:41 PM
    Author     : BRENDA
--%>

<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <meta name="description" content="Portal de participacion ciudadana en proyectos mineros">
        <meta name="author" content="Brenda Costa">
        <title>Ambienta</title>
        
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css" />' />
        <!-- Custom CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/simple-sidebar.css" />' />
        <!-- Basic styles of the plugin -->
  	<link rel="stylesheet" href="<c:url value="/resources/rateyo/jquery.rateyo.css" />"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/inicio.css" />"/>
        <!--JQuery-->
        <script src="<c:url value="/resources/js/jquery-3.1.0.min.js" />"></script>
    </head>
    <body>
        <div id="principal">
            <label style="color: #c8e5bc">Seleccione la opción que le corresponde:</label>
            <br>
            <div id="poblador" style="color: #c8e5bc"><p><a href="<c:url value="explorador.htm"/>">Poblador</a></p></div>
            <div id="empresa" style="color: #c8e5bc" onclick=""><p><a href="<c:url value="empresa.htm"/>">Empresa Minera</a></p></div>
        </div>
    </body>
</html>
