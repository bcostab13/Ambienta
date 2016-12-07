<%-- 
    Document   : registroProyecto
    Created on : 29/11/2016, 11:32:53 PM
    Author     : BRENDA
--%>

<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Panel de Control</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css"/>     

    <!-- Custom CSS -->
    <link rel="stylesheet" href="/resources/css/simple-sidebar.css"/>  
    

</head>

<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Ambienta
                    </a>
                </li>
                <li>
                    <a id="datosEmp" href="#" >Datos de la Empresa</a>
                </li>
                <li>
                    <a id="registroProy" href="#">Registro de Proyectos</a>
                </li>
                <li>
                    <a id="consultaProy" href="#">Consulta de Proyectos</a>
                </li>
                <li>
                    <a id="verInd" href="#">Ver Indicadores</a>
                </li>
                <li>
                    <a id="datosEmp" href="#">Salir</a>
                </li>                
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>Simple Sidebar</h1>
                        <p>This template has a responsive menu toggling system. The menu will appear collapsed on smaller screens, and will appear non-collapsed on larger screens. When toggled using the button below, the menu will appear/disappear. On small screens, the page content will be pushed off canvas.</p>
                        <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                        <a href="#" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="/resources/js/jquery-3.1.0.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/resources/js/bootstrap.min.js"></script>
    
    <script src="/resources/js/registroProyecto.js"></script>
      

</body>

</html>