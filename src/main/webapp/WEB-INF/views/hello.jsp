<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
            html, body { height: 100%; margin: 0; padding: 0; }
            #map { height: 100%; }
          </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div id="map"></div>
        
        <script type="text/javascript">

            var map;
            function initMap() {
              map = new google.maps.Map(document.getElementById('map'), {
                center: {lat: -34.397, lng: 150.644},
                zoom: 8
              });
            }
        </script>
        <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCnEDeZNubnCd1_1N27jSK-FgPNvxqvOsI&callback=initMap">
        </script>
    </body>
</html>
