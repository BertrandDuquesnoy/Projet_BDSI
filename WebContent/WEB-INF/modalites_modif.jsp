<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<body>
		<%@ include file="header.jsp"%>
		<form action="modalite?modif=2" method="post">
		<div id="options_admin">
			<input class="options_admin" type="submit" value="enregistrer"/>
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			
					<p>
						<span class="nb_etudiants_partis">Les Conditions </span>
					</p>
					<p>
						<U><input type="text" name="projetMobiliteTitre" value="${moda.projetMobiliteTitre}"/></U><br/>
						<pre><textarea name="condproj" cols="120" rows="10"> ${modalites.condproj}</textarea><br/>
</pre><br/>

						<br/><U>Pour le 2ème semestre de la 2ème année</U><br/>
						<textarea name="cond2" cols="120" rows="10"> ${modalites.cond2}</textarea><br/>
						<br/><U>Pour la 3ème année</U><br/>
						<textarea name="cond3" cols="120" rows="10"> ${modalites.cond3}</textarea><br/>
					</p>
					<p>
						</br><span class="nb_etudiants_partis">Les financements</span>
					</p>
					<p>
						<textarea name="financements" cols="120" rows="10"> ${modalites.financements}</textarea><br/>
					</p>				
					</p>
				</form>
		</div>
	</body>
</html>
