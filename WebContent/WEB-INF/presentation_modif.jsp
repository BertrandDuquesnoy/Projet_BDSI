<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
	<body>
		<body>
		<%@ include file="header.jsp"%>
		<form action="presentation?modif=2" method="post">
		<div id="options_admin">
			<input class="options_admin" type="submit" value="enregistrer"/>
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			
			<p>
						<span class="nb_etudiants_partis">Pourquoi partir à l'étranger ?</span>
					</p>
					<p>
						<input type="text" name="pourquoi" value="${pre.pourquoi}"/><br/>
					</p>

					<p>
						</br><span class="nb_etudiants_partis">Comment ? </span>
					</p>
					<p>
						Il y a plusieurs moyens de partir à l'étranger:<br/>
						<br/><U>Pour suivre un cursus universitaire: </U><br/>
						<input type="text" name="comment" value="${pre.comment}"/><br/>
												
						<U><br/>Lors d'un <strong>stage.</strong></U> <br/>
						<input type="text" name="stage" value="${pre.stage}"/><br/>
					</p>

					<p>
						<br/><span class="nb_etudiants_partis">Quand ?</span>
					</p>
					<p>
						- Pour le deuxième semestre de la 2ème année.<br/>
						- La 3ème année.<br/>
						- Pendant les périodes de stage.<br/>
					</p>

					<p>
						<br/><span class="nb_etudiants_partis">Où ? </span>
					</p>
					<p>
						<input type="text" name="ou1" value="${pre.ou1}"/><br/>
						<br/><U>Les doubles diplômes:</U><br/>
						<input type="text" name="ou2" value="${pre.ou2}"/><br/>
						
						<br/><U>ERASMUS:</U><br/>
						<input type="text" name="ou3" value="${pre.ou3}"/><br/>

						<br/><U>Stage:</U><br/>
						<input type="text" name="ou4" value="${pre.ou4}"/><br/>
					</p>
				</p>
			</form>
			</div>
	</body>
</html>