<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="options_admin">
	<p>
		<a href="blog?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>
	</p>
	</div>
	<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
	<div id="corps">
		<p class="titre_section">Liste des universités : </p>
		<c:if test="${list.nbUniv > 0}">
			<c:forEach var="i" begin="0" end="${list.nbUniv-1}">
				<div class="ligne">
					<a href="<%=request.getContextPath() %>/universite?id=${list.id[i]}" style="text-decoration: none; color: white">
						${list.noms[i]} - ${list.duree[i]} - ${list.annee[i]} - ${list.pays[i]}
					</a> 
				</div>
			</c:forEach>
		</c:if>
	</div>
</body>
</html>