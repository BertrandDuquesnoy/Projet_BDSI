<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TN International</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	
	<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
	<div id="corps">
		<p class="titre_section">Liste des stages : </p>
		<c:if test="${list.nbStages > 0}">
			<c:forEach var="i" begin="0" end="${list.nbStages-1}">
				<div class="ligne">
					<a href="<%=request.getContextPath() %>/stage?id=${list.id[i]}" style="text-decoration: none; color: white">
						${list.nom[i]} - ${list.annee[i]} - ${list.pays[i]}
					</a> 
				</div>
			</c:forEach>
		</c:if>
	</div>
</body>
</html>