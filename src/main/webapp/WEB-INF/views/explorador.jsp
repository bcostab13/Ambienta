<%@ include file="/WEB-INF/views/include.jsp" %>

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
            
            #map { height: 100%;
            width:100%;
            position: absolute;
            z-index: -1; }
            
            #indicador1 {
            	top: 300px;
            	left: 100px;
            	heigth:100px;
            	width: 100px;
            	position: absolute;
            	z-index:0;  
            	display:block;          	
            }
          </style>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css" />' />
    <!-- Custom CSS -->
    <link rel="stylesheet" href='<c:url value="/resources/css/simple-sidebar.css" />' />
    
    <link href="<c:url value="/resources/star-rating/css/star-rating.css" />" media="all" rel="stylesheet" type="text/css" />
  
	<script src="<c:url value="/resources/star-rating/js/star-rating.js" />" type="text/javascript"></script>
   
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
				    <div id="collapse1" class="panel-collapse collapse">
				      <div class="panel-body">Mi opinion importa</div>				      
				    </div>
				  </div>
				</div>				
			    			    
			  </div>
        </div>
        <!-- /#sidebar-wrapper -->
		
		<!-- Mapa general -->
		<div id="map">Hola</div>
		<!-- /Mapa General -->
		
		<!-- Indicadores -->
		<div id="indicador1">
			<input id="input-id" name="input-name" type="number" class="rating" min=1 max=10 step=2 data-size="lg" data-rtl="true">
		</div>
		<!-- /Indicadores -->
		
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
            	<h1>Simple Sidebar</h1>                
                
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
                <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                
                
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->    
    <script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>">
    	$("#input-id").rating({min:1, max:10, step:2, size:'lg'});
    </script>

    <!-- Bootstrap Core JavaScript -->    
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>