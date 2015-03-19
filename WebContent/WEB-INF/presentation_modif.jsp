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
						<textarea name="pourquoi" cols="120" rows="10"> ${presentation.pourquoi}</textarea><br/>
					</p>

					<p>
						</br><span class="nb_etudiants_partis">Comment ? </span>
					</p>
					<p>
						Il y a plusieurs moyens de partir à l'étranger:<br/>
						<br/><U>Pour suivre un cursus universitaire: </U><br/>
						<textarea name="comment" cols="120" rows="10"> ${presentation.comment}</textarea><br/>
												
						<U><br/>Lors d'un <strong>stage.</strong></U> <br/>
						<textarea name="stage" cols="120" rows="10"> ${presentation.stage}</textarea><br/>
					</p>

					<p>
						<br/><span class="nb_etudiants_partis">Quand ?</span>
					</p>
					<p>
						<textarea name="quand" cols="120" rows="10"> ${presentation.quand}</textarea><br/>
					</p>

					<p>
						<br/><span class="nb_etudiants_partis">Où ? </span>
					</p>
					<p>
						<textarea name="ou1" cols="120" rows="10"> ${presentation.ou1}</textarea><br/>
						<br/><U>Les doubles diplômes:</U><br/>
						<textarea name="ou2" cols="120" rows="10"> ${presentation.ou2}</textarea><br/>
						
						<br/><U>ERASMUS:</U><br/>
						<textarea name="ou3" cols="120" rows="10"> ${presentation.ou3}</textarea><br/>

						<br/><U>Stage:</U><br/>
						<textarea name="ou4" cols="120" rows="10"> ${presentation.ou4}</textarea><br/>
					</p>
					<p style="margin-left:562px;">

			<input class="options_admin" type="submit" value="enregistrer"/>

				
	</p>
				</p>
			</form>
			</div>
	</body>
</html>