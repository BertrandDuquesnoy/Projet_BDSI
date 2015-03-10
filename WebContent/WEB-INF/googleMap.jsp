<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Geocoding service</title>
    <link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
    <style>
      html, body, #map-canvas {
        height: 100%;
        margin: 0px;
        padding: 0px
      }
      #panel {
        position: absolute;
        top: 5px;
        left: 50%;
        margin-left: -180px;
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
      }
    </style>
    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&signed_in=true"></script>
    <script>

var map; 

var univ = {
		id: Array(),
		titre: Array(), 
		description: Array(),
		item: Array(),
		lien: Array(),
		adresse: Array()
};
var stage = {
		id: Array(),
		titre: Array(), 
		description: Array(),
		item: Array(),
		lien: Array(),
		adresse: Array()
};
var dd = {
		id: Array(),
		titre: Array(), 
		description: Array(),
		item: Array(),
		lien: Array(),
		adresse: Array()
};


constructArray("${string}");

function initialize() {
  geocoder = new google.maps.Geocoder();
  var centreEurope = new google.maps.LatLng(46.779231, 6.659431);
  var mapOptions = {
    zoom: 6,
    center: centreEurope
	}
  map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

}

function constructArray(s){
	tab = s.split('&_&');
	c = tab.length-1;
	for(var i=0; i<c; i++){
		temp = tab[i].split('$�$');
		if(temp[temp.length-1] == "univ"){
			(univ.id).push(temp[0]);
			(univ.titre).push(temp[1]);
			(univ.description).push(temp[2]);
			(univ.item).push(temp[3]);
			(univ.lien).push(temp[4]);
			(univ.adresse).push(temp[5]);
		}
		else if(temp[temp.length-1] == "stage"){
			(stage.id).push(temp[0]);
			(stage.titre).push(temp[1]);
			(stage.description).push(temp[2]);
			(stage.item).push(temp[3]);
			(stage.lien).push(temp[4]);
			(stage.adresse).push(temp[5]);
		}
		else if(temp[temp.length-1] == "dd"){
			(dd.id).push(temp[0]);
			(dd.titre).push(temp[1]);
			(dd.description).push(temp[2]);
			(dd.item).push(temp[3]);
			(dd.lien).push(temp[4]);
			(dd.adresse).push(temp[5]);
		}
	}
}

function callBack(titre, description, item, lien, couleur){
	return function(results, status){
		var marker = new google.maps.Marker({
	          icon: 'http://maps.google.com/mapfiles/ms/icons/'+couleur+'-dot.png',
	          map: map,
	          position: results[0].geometry.location,
	          title : titre
	      });
	    var text = '<h1>'+titre+'</h1><p>'+description+'</p><p>'+item+' : <a href="'+lien+'">'+lien+'</a>';
	    var win = new google.maps.InfoWindow({
	      content: text
	    });
	      google.maps.event.addListener(marker, 'click', function() {
	        win.open(map,marker);
	      });
	};
}

function displayUniversities() {
	n = univ.titre.length;
	for(var i = 0; i < n; i++){
		var geocoder = new google.maps.Geocoder();
		geoOptions = {'address':univ.adresse[i]};
		geocoder.geocode(geoOptions, callBack(univ.titre[i], univ.description[i], univ.item[i], univ.lien[i], "green"));
	}
}
	

function displayInternships(){
	n = stage.titre.length;
	for(var i = 0; i < n; i++){
		var geocoder = new google.maps.Geocoder();
		geoOptions = {'address':stage.adresse[i]};
		geocoder.geocode(geoOptions, callBack(stage.titre[i], stage.description[i], stage.item[i], stage.lien[i], "blue"));
	}
}


function displayDoubleDiploma() {
  var address1 = "Paris";

//Double dipl�me 1
  geocoder.geocode( { 'address': address1}, function(results, status) {
      var marker1 = new google.maps.Marker({
          map: map,
          position: results[0].geometry.location,
          title : "Telecom Management"
      });
    var text1 = "Pour ceux qui aiment le management";
    var window1 = new google.maps.InfoWindow({
      content: text1
    });
      google.maps.event.addListener(marker1, 'click', function() {
        window1.open(map,marker1);
      });
    });
}















google.maps.event.addDomListener(window, 'load', initialize);

	</script>
	</head>
	<body>
    <div id="panel">
      <input type="button" value="Ex�cuter la fonction displayUniversities" onclick="displayUniversities()">
      <input type="button" value="Ex�cuter la fonction displayInternships" onclick="displayInternships()">
      <input type="button" value="Ex�cuter la fonction displayDoubleDiploma" onclick="displayDoubleDiploma()">

    </div>
    <div id="map-canvas"></div>
  </body>
</html>

