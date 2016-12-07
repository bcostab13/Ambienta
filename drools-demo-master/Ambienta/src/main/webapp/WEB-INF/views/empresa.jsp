<%-- 
    Document   : empresa
    Created on : 27/10/2016, 08:02:08 PM
    Author     : BRENDA
--%>

<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css" />' />
        <!-- Custom CSS -->
        <link rel="stylesheet" href='<c:url value="/resources/css/simple-sidebar.css" />' />
        <!-- Basic styles of the plugin -->
  	<link rel="stylesheet" href="<c:url value="/resources/rateyo/jquery.rateyo.css" />"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/empresa.css" />"/>
        <script src="<c:url value="/resources/js/empresa.js" />"></script>
        <title>Registro de Proyecto</title>
    </head>
    <body>
        
        <div id="contenedor" class="container">
            <!--<form class="container">-->
            <h2 style="color: #339900;margin-bottom: 10px;">Registro de la Empresa</h2>
            <hr id="hr1"/>
            <br>
            
            <div class="row" style="margin-bottom: 5px; margin-top: 5px;">
                <div class="col-md-1">Nombre:</div>
                <div class="col-md-7"><input id="txt_razonsocial" class="form-control" type="text" style=""/></div>
                <div class="col-md-1">RUC:</div>
                <div class="col-md-3"><input id="txt_ruc" class="form-control" type="text" style=""/></div>
            </div>

            <div class="row" style="margin-bottom: 5px; margin-top: 5px;">
                <div class="col-md-1">Correo:</div>
                <div class="col-md-7"><input id="txt_correo" class="form-control" type="text" style=""/></div>
            </div>
            <div class="row">
                <div class="col-md-1">Teléfono:</div>
                <div class="col-md-3"><input id="txt_telefono" class="form-control" type="text" style=""/></div>
                <div class="col-md-1">Fax:</div>
                <div class="col-md-3"><input id="txt_fax" class="form-control" type="text" style=""/></div>                    
            </div>
            <div class="row" style="margin-bottom: 5px; margin-top: 5px;">
                <div class="col-md-1">Dirección:</div>
                <div class="col-md-7"><input id="txt_direccion" class="form-control" type="text" style=""/></div>
            </div>
            <div class="row" style="margin-bottom: 5px; margin-top: 5px;">
                <div class="col-md-1">Dpto:</div>
                <div class="col-md-3">
                    <select class="form-control">
                        <option>--Seleccione--</option>                            
                    </select>
                </div>
                <div class="col-md-1">Provincia:</div>
                <div class="col-md-3">
                    <select class="form-control">
                        <option>--Seleccione--</option>                            
                    </select>
                </div>
                <div class="col-md-1">Distrito:</div>
                <div class="col-md-3">
                    <select class="form-control">
                        <option>--Seleccione--</option>                            
                    </select>
                </div>
            </div>
            
            <h3 style="color: #339900;margin-bottom: 10px;">Responsable</h3>
            <div class="row" style="margin-bottom: 5px; margin-top: 5px;">
                <div class="col-md-1">Nombre:</div>
                <div class="col-md-7"><input id="txt_nombre" class="form-control" type="text" style=""/></div>
                <div class="col-md-1">DNI:</div>
                <div class="col-md-3"><input id="txt_dni" class="form-control" type="text" style=""/></div>
            </div>
            <div class="row" style="margin-bottom: 5px; margin-top: 5px;">
                <div class="col-md-1">Correo:</div>
                <div class="col-md-7"><input id="txt_correo_resp" class="form-control" type="text" style=""/></div>
            </div>
            <div class="row">
                <div class="col-md-1">Teléfono:</div>
                <div class="col-md-3"><input id="txt_telefono_resp" class="form-control" type="text" style=""/></div>
                <div class="col-md-1">Cargo:</div>
                <div class="col-md-3"><input id="txt_cargo" class="form-control" type="text" style=""/></div>                    
            </div>
            
            <button type="button" class="btn btn-danger btn-lg" style="margin: 10px"><span class="glyphicon glyphicon-play" style="margin-right: 5px"></span>Registrar</button>
        </div>
    </body>
</html>
