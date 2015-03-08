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
/* var geocoder;*/
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
		temp = tab[i].split('$£$');
		if(temp[temp.length-1] == "univ"){
			/* alert(temp[0]+', '+temp[1]+', '+temp[2]+', '+temp[3]+', '+temp[4]+', '+temp[5]); */
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
	          title : "Nano technos Inc."
	      });
	    var text = "titre : "+titre+", description : "+description+", item : "+item+", lien : "+lien;
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
	



function displayInternships() {
  var address1 = "Marseille";
  var address2 = "Grenoble";
  var address3 = "Strasbourg";
  var address4 = "Brest";

//stage 1
  geocoder.geocode( { 'address': address1}, function(results, status) {
      var marker1 = new google.maps.Marker({
          icon: 'http://maps.google.com/mapfiles/ms/icons/blue-dot.png',
          map: map,
          position: results[0].geometry.location,
          title : "poissonnerie des belles eaux"
      });
    var text1 = "il est frais mon poisson !";
    var window1 = new google.maps.InfoWindow({
      content: text1
    });
      google.maps.event.addListener(marker1, 'click', function() {
        window1.open(map,marker1);
      });
    });

//stage 2
  geocoder.geocode( { 'address': address2}, function(results, status) {
      var marker2 = new google.maps.Marker({
          icon: 'http://maps.google.com/mapfiles/ms/icons/blue-dot.png',
          map: map,
          position: results[0].geometry.location,
          title : "Nano technos Inc."
      });
    var text2 = "For the very good ones";
    var window2 = new google.maps.InfoWindow({
      content: text2
    });
      google.maps.event.addListener(marker2, 'click', function() {
        window2.open(map,marker2);
      });
    });

//stage 3
  geocoder.geocode( { 'address': address3}, function(results, status) {
      var marker3 = new google.maps.Marker({
          icon: 'http://maps.google.com/mapfiles/ms/icons/blue-dot.png',
          map: map,
          position: results[0].geometry.location,
          title : "Big Company"
      });
    var text3 = "We are big, help us to be bigger !";
    var window3 = new google.maps.InfoWindow({
      content: text3
    });
      google.maps.event.addListener(marker3, 'click', function() {
        window3.open(map,marker3);
      });
    });
//stage 4
  geocoder.geocode( { 'address': address4}, function(results, status) {
      var marker4 = new google.maps.Marker({
          icon: 'http://maps.google.com/mapfiles/ms/icons/blue-dot.png',
          map: map,
          position: results[0].geometry.location,
          title : "Confiserie des bons bonbons"
      });
    var text4 = "On fait des bons bonbons, c'est sympa non ?  =)";
    var window4 = new google.maps.InfoWindow({
      content: text4
    });
      google.maps.event.addListener(marker4, 'click', function() {
        window4.open(map,marker4);
      });
    });
}







function displayDoubleDiploma() {
  var address1 = "Paris";

//Double diplôme 1
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
      <input type="button" value="Exécuter la fonction displayUniversities" onclick="displayUniversities()">
      <input type="button" value="Exécuter la fonction displayInternships" onclick="displayInternships()">
      <input type="button" value="Exécuter la fonction displayDoubleDiploma" onclick="displayDoubleDiploma()">

    </div>
    <div id="map-canvas"></div>
  </body>
</html>

