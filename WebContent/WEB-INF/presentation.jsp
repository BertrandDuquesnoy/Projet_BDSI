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
			
				<a href="presentation?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>
		</c:if>

				
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			<p>
						<span class="nb_etudiants_partis">Pourquoi partir à l'étranger ?</span>
					</p>
					<p>
						Partir à l'étranger pour un stage ou pour suivre un cursus universitaire est une excellente manière de valoriser son diplôme. C'est une façon d'avoir un parcours original. De plus c'est une expérience très enrichissante et recherchée par les entreprises.
					</p>

					<p>
						</br><span class="nb_etudiants_partis">Comment ? </span>
					</p>
					<p>
						Il y a plusieurs moyens de partir à l'étranger:<br/>
						<br/><U>Pour suivre un cursus universitaire: </U><br/>
						- Pour un <strong>double diplôme</strong>, dans les universités partenaires<br/>
						- En <strong>ERASMUS</strong>, dans les universités partenaires. L'école peut créer des partenariats sur demande des élèves, mais préfère utiliser les partenariats existants.<br/>
						
						<U><br/>Lors d'un <strong>stage.</strong></U> 
						<br/>- L'étudiant fait la démarche et l'école est là pour l'aider.<br/>
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
						
						Télécom Nancy possède des partenariats dans de nombreux pays:<br/>
						<br/><U>Les doubles diplômes:</U></br>
						<a href="http://www.uqam.ca/" target="_blank">Université du Québec à Montréal</a>, Montréal, <strong>Canada</strong><br/>
						<a href="http://www.uqac.ca/" target="_blank">L'Université du Québec A Chicoutimi (UQAC)</a>, Saguenay, <strong>Canada</strong>, <a href="https://www-intranet.telecomnancy.univ-lorraine.fr/lib/exe/fetch.php/ri/presentation_telecom_nancy.pdf" target="_blank">Présentation Chicoutimi 2014</a><br/>
						<a href="http://www.supcom.mincom.tn/" target="_blank">Sup'com Tunis</a>, Tunis, <strong>Tunisie</strong><br/>
						<a href="http://www.itesm.mx/wps/portal?WCM_GLOBAL_CONTEXT=" target="_blank">Tecnologico de Monterrey</a>, Monterrey, <strong>Mexique</strong><br/>
						<a href="http://www.uq.edu.au/" target="_blank">University of Queensland</a>, Brisbane, <strong>Australie</strong><br/>
						
						<br/><U>ERASMUS:</U><br/>
						<a href="http://www.uni-halle.de/" target="_blank">Martin-Luther-Universität</a>, HalleWittenberg, <strong>Allemagne</strong><br/>
						<a href="http://www.upc.edu/" target="_blank">Universitat Politecnica de Catalunya</a>, Barcelona, <strong>Espagne</strong><br/>
						<a href="http://www.uam.es/ss/Satellite/es/home/" target="_blank">Universidad autonoma</a>, Madrid, <strong>Espagne</strong><br/>
						<a href="http://www.aalto.fi/en/" target="_blank">TKK Aalto</a>, Helzinski, <strong>Finlande</strong><br/>
						<a href="https://www.maynoothuniversity.ie/" target="_blank">University of Maynooth</a>, Maynooth, <strong>Irlande</strong><br/>
						<a href="http://www.poliba.it/" target="_blank">Politecnico di Bari</a>, Bari, <strong>Italie</strong><br/>
						<a href="http://www.ntnu.edu/" target="_blank">NTNU</a>, Trondheim, <strong>Norvège</strong><br/>
						<a href="http://www.agh.edu.pl/en" target="_blank">University of Science and Technology</a>, Cracovie, <strong>Pologne</strong><br/>
						<a href="http://www.unl.pt/" target="_blank">Universidade Nova de Lisboa</a>, Lisbonne, <strong>Portugal</strong><br/>
						<a href="http://www.upit.ro/" target="_blank">Universitatea Din Pitesti</a>, Pitesti, <strong>Roumanie</strong><br/>
						<a href="http://www.usv.ro/" target="_blank">Universitatea STEFAN CEL MARE</a>, Suceava, <strong>Roumanie</strong><br/>
						<a href="http://www.bris.ac.uk/" target="_blank">University of Bristol</a>, Bristol, <strong>Royaume-Uni</strong><br/>
						<a href="http://www.le.ac.uk/" target="_blank">University of Leicester</a>, Leicester, <strong>Royaume-Uni</strong><br/>
						
						<br/><U>Stage:</U><br/>
						N'importe où!!
							
					</p>
			</p>
		</div>
	</body>
</html>