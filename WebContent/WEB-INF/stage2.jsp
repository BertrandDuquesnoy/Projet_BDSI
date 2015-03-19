<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>TN International</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css" />
</head>
	<body>
	<%@ include file="header.jsp" %>
	<div id="cote_gauche">
		<div id="infos_univ" class="infos">
			<p class="text_paragraph">
				<p align="center"><img src="${st.logo_path}" width="140" height="80" ></p><br/>
			</p>
			<a href="${st.url}" class="lien_default">Site : ${st.url }</a>
		</div>
		<div id="infos_univ_details" class="infos">
			<p class="text_paragraph">
				Ville : ${st.ville} <br/>
				Pays : ${st.pays} <br/>
				Langue : ${st.langue} <br/>
				Email de l'étudiant : <br/> 	${st.email} <br/>
			</p>
		</div>
		<!--  <div id="lien_res_sociaux">
				<a href="${st.facebook_link}" id="logo_fb"><img src="images/facebook.png" width="30" height="30"/></a>
				<a href="${st.twitter_link }" id="logo_tw"><img src="images/twitter.png" width="30" height="30"/></a>
				<a href="${st.linkedin_link }" id="logo_ln"><img src="images/linkedin.png" width="30" height="30"/></a>
		</div> -->
	</div>
	

	<div id="corps">
		<p class="titre_section">${st.nom}</p>
		<p><span class="Entreprise où a été effectué le stage" style="color: #6C2466">Entreprise où a été effectué le stage : ${st.nom}</span></p>
		
		<p style="color: #6C2466"> Liens utiles : </p>
		<p style="color: #6C2466"> Adresse : ${st.adresse}</p>
		<p style="color: #6C2466"> Numéro de téléphone : ${st.numTel} </p>
		
		<p><span class="Descriptif du stage" style="color: #6C2466">Descriptif du stage :  </span></p>
	</div>
	</body>
</html>