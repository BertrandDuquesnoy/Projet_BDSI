<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css" />
</head>
	<body>
	<div id="bandeau">
		<a href="http://www.telecomnancy.eu/" id="logoTN" class="logo-img"><img src="images/logoTN.png" alt= "Logo TELECOM Nancy" width="180" height="100"/></a>
		<h1 class="titre_page" style="position:absolute; top: 2%; left:33%">RELATIONS INTERNATIONALES</h1>
		<p id="connexion">
			${personne.prenom} ${personne.nom}<br/>
			<a href="">Déconnection</a>
		</p>
	</div>
	</body>
</html>
