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
						<input type="text" name="projetMobilite" value="${moda.projetMobilite}"/><br/>

						<br/><U>Pour le 2�me semestre de la 2�me ann�e</U><br/>
						<input type="text" name="deuxiemeAnnee" value="${moda.deuxiemeAnnee}"/><br/>
						<br/><U>Pour la 3�me ann�e</U><br/>
						<input type="text" name="troisiemeAnnee" value="${moda.troisiemeAnnee}"/><br/>
					</p>
					<p>
						</br><span class="nb_etudiants_partis">Les financements</span>
					</p>
					<p>
						<input type="text" name="financements" value="${moda.financements}"/><br/>
					</p>				
					</p>
				</form>
		</div>
	</body>
</html>