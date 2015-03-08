<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
	<body>
	<%@ include file="header.jsp" %>
	<div id="cote_gauche">
		<div id="infos_univ" class="infos">
			<p class="text_paragraph">
				<p align="center"><img src="${dd.logo_path}" width="140" height="80" style="align:center" /></p>
				${dd.nom}
			</p>
			<a href="${university.url}" class="lien_default">Site : ${university.url }</a>
		</div>
		<div id="infos_univ_details" class="infos">
			<p class="text_paragraph">
				Ville : ${university.ville} <br/>
				Pays : <img src="images/pays/canada.png"> ${university.pays} <br/>
				Type : ${university.type} <br/>
				Langue : ${university.langue} <br/>
				Date de fondation : ${university.dateFondation} <br/>
				Nombre d'étudiants : ${university.nbEtudiants} <br/>
			</p>
			<div id="lien_convention">
				<a href="${university.convention_path }" class="lien_default" style="align:center; color: #6C2466; text-decoration: underline">Convention en pdf</a>
			</div>
		</div>
		<div id="lien_res_sociaux">
				<a href="${university.facebook_link}" id="logo_fb"><img src="images/facebook.png" width="30" height="30"/></a>
				<a href="${university.twitter_link }" id="logo_tw"><img src="images/twitter.png" width="30" height="30"/></a>
				<a href="${university.linkedin_link }" id="logo_ln"><img src="images/linkedin.png" width="30" height="30"/></a>
		</div>
	</div>
	
	<div>
		<p id="options_admin"><span class="options_admin">Supprimer la fiche</span>  <a href="university?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin"> Modifier</span></a></p>
	</div>
	<div id="corps">
		<p class="titre_section">${university.nom} 
			<c:set var="cpt" value="0" scope="page"/>
			<c:if test="${university.note > 1}">
				<c:forEach var="i" begin="0" end="${university.note-1}">	
					<c:set var="cpt" value="${cpt+1}"/>
					<img src="images/etoileNotation.jpg" width="25px" height="25px">
				</c:forEach>
			</c:if>
			<c:if test="${cpt < 5}">
				<c:forEach var="i" begin="0" end="${5-cpt-1}">
					<img src="images/etoileVide.png" width="25px" height="25px"/>
				</c:forEach>
			</c:if>
			<span style="color: #6C2466">${university.note}/5</span>
		</p>
		<p>
			${university.description}
		</p>
		<p><span class="nb_etudiants_partis">Nombre d'étudiants de TELECOM Nancy, partis dans cette université : ${university.nbEtudiants}</span></p>
		<p><span class="nb_etudiants_partis">Liste des étudiants :  </span></p>
		<c:forEach items="${ university.personnes }" varStatus="boucle">
			<p>${university.personnes[boucle.index].prenom} ${university.personnes[boucle.index].nom} - ${university.personnes[boucle.index].promo} - ${university.personnes[boucle.index].departement} <span class="voir_plus">(voir plus) </span> <hr class="separateur"/> </p>
		</c:forEach>
	</div>
	</body>
</html>