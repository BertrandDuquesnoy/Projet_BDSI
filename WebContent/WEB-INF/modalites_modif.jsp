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
		<div id="options_admin">
			<p>
				<a href="blog?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>

				
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			
					<p>
						<span class="nb_etudiants_partis">Les Conditions </span>
					</p>
					<p>
						<U><input type="text" name="projetMobiliteTitre" value="${mod.projetMobiliteTitre}"/></U><br/>
						<input type="text" name="projetMobilite" value="${mod.projetMobilite}"/><br/>

						<br/><U>Pour le 2ème semestre de la 2ème année</U><br/>
						<input type="text" name="deuxiemeAnnee" value="${mod.deuxiemeAnnee}"/><br/>
						<br/><U>Pour la 3ème année</U><br/>
						<input type="text" name="troisiemeAnnee" value="${mod.troisiemeAnnee}"/><br/>
					</p>
					<p>
						</br><span class="nb_etudiants_partis">Les financements</span>
					</p>
					<p>
						<input type="text" name="financements" value="${mod.financements}"/><br/>
					</p>					
			</p>
		</div>
	</body>
</head>