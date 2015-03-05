<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css" />
</head>
	<body>
		<%@ include file="header.jsp" %>
		
		<div id="accueil" style="width:20%"><p>Menu Accueil</p></div>
		<div id="corps">
			<form action="blog" method="post">
			<div id="options_admin">
				<input class="options_admin" type="submit" value="enregistrer"/>
			</div>
				<div id="ligne">
					<input type="text" class="categorie"  value="Tous les articles">
					<input type="text" class="categorie"  value="Les articles d'Asie">
					<input type="text" class="categorie"  value="Les articles d'Afrique">
				</div>
				<div id="ligne">
					<input type="text" class="categorie" value="Tous les articles">
					<input type="text" class="categorie" value="Les articles d'Asie">
					<input type="text" class="categorie" value="Les articles d'Afrique">
				</div>
				<div id="ligne">
					<input type="text" class="categorie" value="Tous les articles">
					<input type="text" class="categorie" value="Les articles d'Asie">
					<input type="text" class="categorie" value="Les articles d'Afrique">
				</div>
			</form>
		</div>
	</body>
</head>