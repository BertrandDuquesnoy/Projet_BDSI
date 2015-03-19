<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<body>
	<div id="bandeau">
		<a href="http://www.telecomnancy.eu/" id="logoTN" class="logo-img"><img src="<%=request.getContextPath() %>/images/logoTN.png" alt= "Logo TELECOM Nancy" width="180" height="100"/></a>
		<%-- <img src="<%=request.getContextPath() %>/images/relations_internationales.png" style="align:center" width="100%" height="100px"/> --%>
		<h1 class="titre_page" style="position:absolute; top: 2%; left:50%" style=""><B>Liens Utiles</B></h1>
	</div>
	
		<div id="menu">
				<%@ include file="menu.jsp" %>
			
		</div>	
		<Strong><br/>Université de Lorraine :</Strong></br>
						<a href="http://www.univ-lorraine.fr/" target="_blank"><strong>http://www.univ-lorraine.fr/ </strong><br/>
						</a>
		<Strong><br/>Accueil-Info Etudiants / Guichet Unique :</Strong></br>
						<a href="http://welcome.univ-lorraine.fr/fr/vivre-lul/accueil-des-etudiants" target="_blank"><strong> http://welcome.univ-lorraine.fr/fr/vivre-lul/accueil-des-etudiants </strong><br/>
						</a>
		<Strong><br/>Partir à l'étranger  :</Strong></br>
						<a href="http://www.telecomnancy.eu/?id=329" target="_blank"><strong>http://www.telecomnancy.eu/?id=329 </strong><br/>
						</a>
		<Strong><br/>Etudier à l'étranger   :</Strong></br>
						<a href="http://www.etudiant.gouv.fr/pid20436/etudier-a-l-etranger.html" target="_blank"><strong>http://www.etudiant.gouv.fr/pid20436/etudier-a-l-etranger.html </strong><br/>
						</a>
	</body>
</html>