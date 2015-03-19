<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<h1 class="titre_page" style="position:absolute; top: 2%; left:33%">Relations Internationales</h1>
		<p id="connexion">
			${sessionScope.user.prenom} ${sessionScope.user.nom}<br/>
			<c:if test="${ !empty sessionScope.user.prenom}">
			<a href="<%=request.getContextPath() %>/login?disconnect=1" style="color:white">Déconnexion</a>
			</c:if>
			<c:if test="${empty sessionScope.user.prenom}">
			<a href="<%=request.getContextPath() %>/login" style="color:white">Connexion</a>
			</c:if>
		</p>
	</div>
	</body>
</html>
