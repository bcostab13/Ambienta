<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ambienta</title>
    
    <style type="text/css">
            
            #map { 
            height: 100%;
            width:100%;            
            position: absolute;
            z-index: -1; }
            
            #indicador1 {
            	top: 300px;
            	left: 100px;
            	height:100px;
            	width: 100px;
            	position: absolute;
            	z-index:0;  
            	display:block;          	
            }
          </style>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css" />' />
    <!-- Custom CSS -->
    <link rel="stylesheet" href='<c:url value="/resources/css/simple-sidebar2.css" />' />
    <!-- Basic styles of the plugin -->
    <link rel="stylesheet" href="<c:url value="/resources/rateyo/jquery.rateyo.css" />"/>
    <link rel="stylesheet" href="/resources/css/explorador.css"/> 
         
</head>

<body>
	
    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <div class="panel-group" style="margin:15px">
			    <div class="panel panel-primary">
			      <div class="panel-heading">Nivel de Aceptación</div>
			      <div class="panel-body">Bajo</div>
			    </div>
			    
			    <div class="panel panel-primary">
			      <div class="panel-heading">Obtener Material Impreso</div>			      
			    </div>
			    
			    <!-- panel group de opiniones -->
			    <div class="panel-group" style="margin-top:5px">
				  <div class="panel panel-primary">
				    <div class="panel-heading">
				      <h4 class="panel-title">
				        <a data-toggle="collapse" href="#collapse1">Ver Opiniones(2)</a>
				      </h4>
				    </div>
				    <div id="collapse1" class="panel-collapse collapse" style="padding: 5px">
				      		      	        
				    </div>
				  </div>
				</div>				
			    			    
			  </div>
        </div>
        <!-- /#sidebar-wrapper -->
		
		<!-- Mapa general -->
		<div id="map"></div>
		<!-- /Mapa General -->
		
		<!-- Indicadores -->
		
		<!-- /Indicadores -->
		
        <!-- Page Content -->
        <div id="page-content-wrapper">
<!--            <div id="map"></div>-->
            <div class="container-fluid">
                
            	<h1 id="pruebaSE">Proyecto Minero</h1>                
                 
                
                <div id="flDatos">                   
                    <div id="rateYo"></div> 
                </div>
                
                <div id="flBiologico">                   
                    <div id="rateYo"></div> 
                </div>
                
                <div id="flFisico">                   
                    <div id="rateYo"></div> 
                </div>
                
                <div id="flSocial">                   
                    <div id="rateYo"></div> 
                </div>
                
                      
                <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                
                
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->    
    <script src='<c:url value="/resources/js/jquery-3.1.0.min.js"/>' >
    	$("pruebaSE").click(function(){
            $.ajax({
            url: "web/explo",
            context: document.body
          }).done(function() {
            $( this ).addClass( "done" );
          });
        });
    </script>
    
    <!-- Star Rating Java Script -->
    <script src='<c:url value="/resources/rateyo/jquery.rateyo.js" /> '></script>

    <!-- Bootstrap Core JavaScript -->    
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    
    <!-- Configuración del mapa -->
    <script type="text/javascript">		
       function initMap() {
           var myLatLng = {lat: -11.5241973, lng: -75.9070376};

           // Create a map object and specify the DOM element for display.
           var map = new google.maps.Map(document.getElementById('map'), {
             center: myLatLng,
             scrollwheel: true,
             zoom: 12
           });

           // Create a marker and set its position.
           var marker = new google.maps.Marker({
             map: map,
             position: myLatLng,
             title: 'Hello World!'
           });
         }
     </script>     
     
     <script async defer
         src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCnEDeZNubnCd1_1N27jSK-FgPNvxqvOsI&callback=initMap">
     </script>		  
	<!-- /Configuración del mapa -->
	
    <!-- Menu Toggle Script -->
    <script>
    $(function () {
    	 
    	  $("#rateYo").rateYo({
    	    rating: 3.6,
    	    ratedFill: "#E74C3C",
    	    starWidth: "20px",
            readOnly: true
    	  });
    	 
    	});
    
    
    
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>