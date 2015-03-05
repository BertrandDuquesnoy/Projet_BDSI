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
		<div id="options_admin">
			<p>
				<span class="options_admin">Supprimer une catégorie</span>  
				<a href="blog?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier une catégorie</span></a>
				<span class="options_admin">Ajouter une catégorie</span>
			</p>
		</div>
		<div id="accueil" style="width:20%"><p>Menu Accueil</p></div>
		<div id="corps">
			<form>
				<c:forEach var="i" begin="0" end="8">
					<c:choose>
						<c:when test="${(i%3)==0 }">
						<div id="ligne">
							<input type="submit" class="categorie" name="${i}" value="${bb.list[i]}">
						</div>
					</c:when>
					<c:otherwise>
						<input type="submit" class="categorie" name="${i}" value="${bb.list[i]}">
					</c:otherwise>
					</c:choose>
				</c:forEach>
			</form>
		</div>
	</body>
</head>