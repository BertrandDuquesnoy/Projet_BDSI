<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css" />
</head>
	<body>
	<!-- <div id="bandeau">
		<a href="http://www.telecomnancy.eu/" id="logoTN" class="logo-img"><img src="images/logoTN.png" alt= "Logo TELECOM Nancy" width="180" height="100"/></a>
		<h1 class="titre_page" style="position:absolute; top: 2%; left:33%">RELATIONS INTERNATIONALES</h1>
		<p id="connexion">
			Prénom Nom <br/>
			<a href="">Déconnection</a>
		</p>
	</div> -->
	<%@ include file="header.jsp" %>
	<div id="cote_gauche">
		<div id="infos_univ" class="infos">
			<p class="text_paragraph">
				<p align="center"><img src="images/logo_univ/uqac.jpg" width="140" height="80" style="align:center" /></p>
				Université du Québec à  Chicoutimi
			</p>
			<a href="http://www.uqac.ca" class="lien_default">Site : www.uqac.ca</a>
		</div>
		<div id="infos_univ_details" class="infos">
			<p class="text_paragraph">
				Ville : Saguenay <br/>
				Pays : <img src="images/pays/canada.png"> Canada <br/>
				Type : Université publique <br/>
				Langue : Français <br/>
				Date de fondation : 1969 <br/>
				Nombre d'étudiants : 6500 <br/>
			</p>
			<div id="lien_convention">
				<a href="conventions/convention1.pdf" class="lien_default" style="align:center; color: #6C2466; text-decoration: underline">Convention en pdf</a>
			</div>
		</div>
		<div id="lien_res_sociaux">
				<a href="https://www.facebook.com/TELECOMNancy" id="logo_fb"><img src="images/facebook.png" width="30" height="30"/></a>
				<a href="https://twitter.com/telecomnancy" id="logo_tw"><img src="images/twitter.png" width="30" height="30"/></a>
				<a href="https://www.linkedin.com/company/telecom-nancy" id="logo_ln"><img src="images/linkedin.png" width="30" height="30"/></a>
		</div>
	</div>
	
	<div>
		<p id="options_admin"><span class="options_admin">Suprrimer la fiche</span>   <span class="options_admin">Modifier</span></p>
	</div>
	<div id="corps">
		<p class="titre_section">Université du Québec à Chicoutimi 
			<img src="images/etoileNotation.jpg" width="25px" height="25px">
			<img src="images/etoileNotation.jpg" width="25px" height="25px">
			<img src="images/etoileNotation.jpg" width="25px" height="25px">
			<img src="images/etoileVide.png" width="25px" height="25px">
			<img src="images/etoileVide.png" width="25px" height="25px"> 
			<span style="color: #6C2466">3.7/5</span>
		</p>
		<p>
			L'Université du Québec à Chicoutimi (UQAC) est une université francophone située au cœur de Chicoutimi, un arrondissement de la ville de Saguenay, dans la province de Québec, au Canada. Elle est affiliée à l'Université du Québec (UQ).
Fondée en 1969, elle figure parmi les plus modernes au Québec. Outre son campus principal, l'université dispose de centres d'études à La Malbaie, Saint-Félicien, Alma et Sept-Îles. En 2004, 6 648 étudiants y étaient inscrits, ce qui en fait la troisième des neuf institutions membres de l'UQ, après l'UQAM et l'UQTR. Ses chercheurs en technologies de l'aluminium, en foresterie, en études sur le givrage, en géologie et en histoire des populations sont particulièrement bien reconnus.
		</p>
		<p><span class="nb_etudiants_partis">Nombre d'étudiants de TELECOM Nancy, partis dans cette université : 3</span></p>
		<p><span class="nb_etudiants_partis">Liste des étudiants :  </span></p>
		<p>Alexandre Adam - Promo 2015 - Marketing <span class="voir_plus">(voir plus) </span> <hr class="separateur"/> </p>
	</div>
	</body>
</html>