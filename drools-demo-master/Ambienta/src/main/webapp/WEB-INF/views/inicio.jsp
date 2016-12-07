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
        <script src="<c:url value="/resources/js/inicio.js" />"></script>
    </head>
    <body>
        <div id="principal" style="text-align: center">            
            <img src="/resources/images/blanco.png" >
            <br><br>
            <div id="poblador" style="color: #c8e5bc">
                <div class="titulo-opcion">
                    <img class="icon-opcion" src="/resources/images/usuario.png">
                    <div class="texto-titulo">Poblador</div>
                </div>
                <div class="login">
                    <div class="container">
                        <div class="row" style="margin-bottom: 5px">
                            <label class="col-md-1">Usuario:</label>
                            <div class="col-md-3"><input type="text" class="form-control" id="us_po"/></div>
                        </div>
                        <div class="row" style="margin-bottom: 5px;">
                            <label class="col-md-1">Password:</label>
                            <div class="col-md-3"><input type="text" class="form-control" id="pss_po"/></div>
                        </div>
                        <div class="row" style="margin-bottom: 5px;" >
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary" onclick="login_poblador">Ingresar</button>
                            </div>
                            <div class="col-md-2">
                                <button type="button" class="btn btn-success">Registrarse</button>
                            </div>
                        </div>                        
                    </div>
                </div>
            </div>
            <div id="empresa" style="color: #c8e5bc" onclick="">
                <div class="titulo-opcion">
                    <img class="icon-opcion" src="/resources/images/minero.png">
                    <div class="texto-titulo">Empresa Minera</div>
                </div>
                <div class="login">
                    <div class="container">
                        <div class="row" style="margin-bottom: 5px;">
                            <label class="col-md-1">Usuario:</label>
                            <div class="col-md-3"><input type="text" class="form-control"/></div>
                        </div>
                        <div class="row" style="margin-bottom: 5px;">
                            <label class="col-md-1">Password:</label>
                            <div class="col-md-3"><input type="text" class="form-control"/></div>
                        </div>
                        <div class="row" style="margin-bottom: 5px;" >
                            <div class="col-md-2">
                                <button type="button" class="btn btn-primary" onclick="login_empresa()">Ingresar</button>
                            </div>                            
                            <div class="col-md-2">
                                <button type="button" class="btn btn-success">Registrarse</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
