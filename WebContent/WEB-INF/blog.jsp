<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
	<script type="text/javascript">
	
		var value = "test";
		
		function updateComboBox(){
			/* value = cb.options[cb.selectedIndex].value; */
			alert("coucou");
		}
	</script>
	<script>
	
		function supprimerCategorie(){
			width = 400;
            height = 300;
            if(window.innerWidth){
                    var left = (window.innerWidth-width)/2;
                    var top = (window.innerHeight-height)/2;
            }else{
                    var left = (document.body.clientWidth-width)/2;
                    var top = (document.body.clientHeight-height)/2;
            }
            popup = window.open('','SuppC','menubar=no, scrollbars=no, top='+top+', left='+left+', width='+width+', height='+height+'');
            popup.document.writeln("Catégorie à supprimer : ");
            popup.document.writeln('<select id="comboBox"><c:forEach var="i" begin="0" end="${bb.nbCategories-1}"><option>${bb.pays[i]}</option></c:forEach></select>');
            var cb = popup.document.getElementById("comboBox");
            popup.document.write('<p><a href="blog?modif=2&name='+value+'" onmouseover="updateComboBox()" onMouseUp="window.close()">Supprimer</a> <a href="" onclick=window.close();>Annuler</a>');
            
		}
	</script>
	<body>
		<%@ include file="header.jsp"%>
		<div id="options_admin">
			<p>
				<c:if test="${sessionScope.user.fonction == 'Administrateur' || sessionScope.user.fonction == 'Pôle Relations Internationales' || sessionScope.user.fonction == 'Responsable Relations Internationales'}">
				<span class="options_admin" onclick="supprimerCategorie()">Supprimer une catégorie</span>  
				<a href="blog?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier une catÃ©gorie</span></a>
				<span class="options_admin">Ajouter une catégorie</span>
				</c:if>
			</p>
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		
		<div id="corps">
			<div>
				<c:forEach var="i" begin="0" end="${bb.nbCategories-1}">
					<%-- <c:choose>
						<c:when test="${(i%3)==0 }"> --%>
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
					<%-- 	</c:when> --%>
					<%-- 	<c:when test="${(i%3)==1}">
							<span style="vertical-align:bottom; float:left; display:inline-block;margin:30px; "><input type="button" class="tuile" name="${i}" style="background:url(<%=request.getContextPath() %>${list.logo_path[i]}) no-repeat; background-size: 250px 100px; color: black; border: none"  onclick='window.location.href="<%=request.getContextPath() %>/universite?id=${list.id[i]}&modif="'/><br/>${bb.list[i]}</span>
							<input type="button" class="paysCat" name="${i}" value="${bb.pays[i]}" onclick='window.location.href="blog/page?id=${i}"'>
						</c:when>
						<c:otherwise>
							<input type="button" class="categorie" name="${i}" value="${bb.pays[i]}" onclick='window.location.href="blog/page?id=${i}"'>
						</c:otherwise>
					</c:choose> --%>
				</c:forEach>
			</div>
		</div>
	</body>
</head>