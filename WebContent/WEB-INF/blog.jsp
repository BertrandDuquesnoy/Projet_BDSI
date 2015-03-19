<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
	<body>
		<%@ include file="header.jsp"%>
		<div id="options_admin">
			<p>
				<c:if test="${sessionScope.user.fonction == 'Administrateur' || sessionScope.user.fonction == 'Pôle Relations Internationales' || sessionScope.user.fonction == 'Responsable Relations Internationales'}"> 
				<span class="options_admin">Ajouter une catégorie</span>
				</c:if>
			</p>
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		
		<div id="corps">
			<div>
				<c:if test="${bb.nbCategories > 0}">
					<c:forEach var="i" begin="0" end="${bb.nbCategories-1}">
						<div class="i">
							<div class="cf">
							<img class="bottom"	src="<%=request.getContextPath()%>${bb.flag_path[i]}" onclick='window.location.href="blog/page?pays=${bb.pays[i]}"'/> 
							<img class="top" src="<%=request.getContextPath()%>${bb.img_path[i]}" onclick='window.location.href="blog/page?id=${bb.pays[i]}"'/>
							<%-- <input type="button" class="categorie" name="${i}" value="${bb.list[i]}" onclick='window.location.href="blog/page?id=${i}"'> --%>
							</div>
							<div id="p">
								<p>${bb.pays[i]}</p>
							</div>
						</div>
					</c:forEach>
				</c:if>
			</div>
		</div>
	</body>
</head>