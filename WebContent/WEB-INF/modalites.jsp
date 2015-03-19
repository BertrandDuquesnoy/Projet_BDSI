<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
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
            popup.document.writeln('<select id="comboBox"></select>');
            var cb = popup.document.getElementById("comboBox");
            popup.document.write('<p><a href="blog?modif=2&name='+value+'" onmouseover="updateComboBox()" onMouseUp="window.close()">Supprimer</a> <a href="" onclick=window.close();>Annuler</a>');
            
		}
	</script>
	<body>
		<%@ include file="header.jsp"%>
		<div id="options_admin">
			<p>
					<c:if test="${sessionScope.user.fonction == 'Administrateur' || sessionScope.user.fonction == 'Pôle Relations Internationales' || sessionScope.user.fonction == 'Responsable Relations Internationales'}">
			
				<a href="modalite?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>
		</c:if>

				
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			
					<p>
						<span class="nb_etudiants_partis">Les Conditions </span>
					</p>
					<p>
						<U>Projet de mobilité</U><br/>
						- Document validé par le responsable de l’approfondissement<br/>
						    • Motivation<br/>
						    • Cursus à l’étranger<br/>
						- Validation par le jury de mobilité<br/>

						<br/><U>Pour le 2ème semestre de la 2ème année</U><br/>
						- La validation de l’ensemble des thèmes des 3 premiers semestres du cursus d’Ingénieur de TELECOM Nancy<br/>
						- Une moyenne finale sur les 3 semestres supérieure ou égale à 12/20,<br/>
						- TOEIC validé,<br/>
						- 20 crédits CIPA obtenus,<br/>
						- Aucun dépassement de seuil d’absences injustifiées relevé sur les semestres écoulés.<br/>

						<br/><U>Pour la 3ème année</U><br/>
						- La validation de l’ensemble des thèmes des 4 premiers semestres du cursus d’Ingénieur à TELECOM Nancy<br/>
						- Une moyenne finale sur les 4 premiers semestres supérieure ou égale à 12/20,<br/>
						- TOEIC validé,<br/>
						- CIPA validé,<br/>
						- Aucun dépassement de seuil d’absences injustifiées sur les semestres écoulés.<br/>
					</p>
					<p>
						</br><span class="nb_etudiants_partis">Les financements</span>
					</p>
					<p>
						- ERASMUS<br/>
						- Région Lorraine<br/>
						- Région d’origine<br/>
						- Ambassades<br/>
						- Appels d’offres spécifiques<br/>
						- Université de Lorraine<br/>
					</p>					
			</p>
		</div>
	</body>
</html>