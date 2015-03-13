<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<body>
	<%@ include file="header.jsp"%>
	<form action="university?id=${university.id}" method="post">
		<div id="cote_gauche">
			<div id="infos_univ" class="infos">
				<p class="text_paragraph">
				<p align="center">
					<img src="${university.logo_path}" width="140" height="80"
						style="align: center" />
				</p>

				Nom : <input type="text" name="nom_universite"
					value="${university.nom}" />
				</p>
				<p>
					Site : <input type="text" class="lien_default" name="url"
						value="${university.url}" />
				</p>
			</div>
			<div id="infos_univ_details" class="infos">
				<p class="text_paragraph">
					Ville : <input type="text" name="ville" value="${university.ville}" />
					<br /> Pays : <img src="images/pays/canada.png"> <input
						type="text" name="pays" value="${university.pays}" /> <br />
					Type : <input type="text" name="type" value="${university.type}" />
					<br /> Langue : <input type="text" name="langue"
						value="${university.langue}" /> <br /> Date de fondation : <input
						type="text" name="dateFondation"
						value="${university.dateFondation}" /> <br /> Nombre d'étudiants
					: <input type="text" name="nbEtudiants"
						value="${university.nbEtudiants}" /> <br />
				</p>
				<div id="lien_convention">
					<p>
						Convention : <input type="text" name="convention_path"
							value="${university.convention_path}" />
					</p>
				</div>
			</div>
			<div>
				<ul>
					<li><img src="images/facebook.png" width="30" height="30" /><input
						type="text" name="facebook_link"
						value="${university.facebook_link}" id="logo_fb" /></li>
					<li><img src="images/twitter.png" width="30" height="30" /><input
						type="text" name="twitter_link"
						value="${university.twitter_link }" id="logo_tw" /></li>
					<li><img src="images/linkedin.png" width="30" height="30" />
						<input type="text" name="linkedin_link"	value="${university.linkedin_link }" id="logo_ln" /></li>
				</ul>
			</div>
		</div>

		<div>
			<input type="submit" id="options_admin" class="options_admin"
				value="Enregistrer" />
		</div>
		<div id="corps">
			<p class="titre_section">
				${university.nom}
				<c:set var="cpt" value="0" scope="page" />
				<c:if test="${university.note > 1}">
					<c:forEach var="i" begin="0" end="${university.note-1}">
						<c:set var="cpt" value="${cpt+1}" />
						<img src="images/etoileNotation.jpg" width="25px" height="25px">
					</c:forEach>
				</c:if>
				<c:if test="${cpt < 5}">
					<c:forEach var="i" begin="0" end="${5-cpt-1}">
						<img src="images/etoileVide.png" width="25px" height="25px" />
					</c:forEach>
				</c:if>
				<span style="color: #6C2466">${university.note}/5</span>
			</p>
			<textarea name="description" cols="80" rows="20"> ${university.description}</textarea>
		</div>
	</form>
</body>
</html>