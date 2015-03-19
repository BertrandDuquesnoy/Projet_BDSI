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
            popup.document.writeln("Cat�gorie � supprimer : ");
            popup.document.writeln('<select id="comboBox"></select>');
            var cb = popup.document.getElementById("comboBox");
            popup.document.write('<p><a href="blog?modif=2&name='+value+'" onmouseover="updateComboBox()" onMouseUp="window.close()">Supprimer</a> <a href="" onclick=window.close();>Annuler</a>');
            
		}
	</script>
	<body>
		<%@ include file="header.jsp"%>
		<div id="options_admin">
			<p>
					<c:if test="${sessionScope.user.fonction == 'Administrateur' || sessionScope.user.fonction == 'P�le Relations Internationales' || sessionScope.user.fonction == 'Responsable Relations Internationales'}">
			
				<a href="presentation?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>
		</c:if>

				
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			<p>
						<span class="nb_etudiants_partis">Pourquoi partir � l'�tranger ?</span>
					</p>
					<p>
						Partir � l'�tranger pour un stage ou pour suivre un cursus universitaire est une excellente mani�re de valoriser son dipl�me. C'est une fa�on d'avoir un parcours original. De plus c'est une exp�rience tr�s enrichissante et recherch�e par les entreprises.
					</p>

					<p>
						</br><span class="nb_etudiants_partis">Comment ? </span>
					</p>
					<p>
						Il y a plusieurs moyens de partir � l'�tranger:<br/>
						<br/><U>Pour suivre un cursus universitaire: </U><br/>
						- Pour un <strong>double dipl�me</strong>, dans les universit�s partenaires<br/>
						- En <strong>ERASMUS</strong>, dans les universit�s partenaires. L'�cole peut cr�er des partenariats sur demande des �l�ves, mais pr�f�re utiliser les partenariats existants.<br/>
						
						<U><br/>Lors d'un <strong>stage.</strong></U> 
						<br/>- L'�tudiant fait la d�marche et l'�cole est l� pour l'aider.<br/>
					</p>

					<p>
						<br/><span class="nb_etudiants_partis">Quand ?</span>
					</p>
					<p>
						- Pour le deuxi�me semestre de la 2�me ann�e.<br/>
						- La 3�me ann�e.<br/>
						- Pendant les p�riodes de stage.<br/>
					</p>

					<p>
						<br/><span class="nb_etudiants_partis">O� ? </span>
					</p>
					<p>
						
						T�l�com Nancy poss�de des partenariats dans de nombreux pays:<br/>
						<br/><U>Les doubles dipl�mes:</U></br>
						<a href="http://www.uqam.ca/" target="_blank">Universit� du Qu�bec � Montr�al</a>, Montr�al, <strong>Canada</strong><br/>
						<a href="http://www.uqac.ca/" target="_blank">L'Universit� du Qu�bec A Chicoutimi (UQAC)</a>, Saguenay, <strong>Canada</strong>, <a href="https://www-intranet.telecomnancy.univ-lorraine.fr/lib/exe/fetch.php/ri/presentation_telecom_nancy.pdf" target="_blank">Pr�sentation Chicoutimi 2014</a><br/>
						<a href="http://www.supcom.mincom.tn/" target="_blank">Sup'com Tunis</a>, Tunis, <strong>Tunisie</strong><br/>
						<a href="http://www.itesm.mx/wps/portal?WCM_GLOBAL_CONTEXT=" target="_blank">Tecnologico de Monterrey</a>, Monterrey, <strong>Mexique</strong><br/>
						<a href="http://www.uq.edu.au/" target="_blank">University of Queensland</a>, Brisbane, <strong>Australie</strong><br/>
						
						<br/><U>ERASMUS:</U><br/>
						<a href="http://www.uni-halle.de/" target="_blank">Martin-Luther-Universit�t</a>, HalleWittenberg, <strong>Allemagne</strong><br/>
						<a href="http://www.upc.edu/" target="_blank">Universitat Politecnica de Catalunya</a>, Barcelona, <strong>Espagne</strong><br/>
						<a href="http://www.uam.es/ss/Satellite/es/home/" target="_blank">Universidad autonoma</a>, Madrid, <strong>Espagne</strong><br/>
						<a href="http://www.aalto.fi/en/" target="_blank">TKK Aalto</a>, Helzinski, <strong>Finlande</strong><br/>
						<a href="https://www.maynoothuniversity.ie/" target="_blank">University of Maynooth</a>, Maynooth, <strong>Irlande</strong><br/>
						<a href="http://www.poliba.it/" target="_blank">Politecnico di Bari</a>, Bari, <strong>Italie</strong><br/>
						<a href="http://www.ntnu.edu/" target="_blank">NTNU</a>, Trondheim, <strong>Norv�ge</strong><br/>
						<a href="http://www.agh.edu.pl/en" target="_blank">University of Science and Technology</a>, Cracovie, <strong>Pologne</strong><br/>
						<a href="http://www.unl.pt/" target="_blank">Universidade Nova de Lisboa</a>, Lisbonne, <strong>Portugal</strong><br/>
						<a href="http://www.upit.ro/" target="_blank">Universitatea Din Pitesti</a>, Pitesti, <strong>Roumanie</strong><br/>
						<a href="http://www.usv.ro/" target="_blank">Universitatea STEFAN CEL MARE</a>, Suceava, <strong>Roumanie</strong><br/>
						<a href="http://www.bris.ac.uk/" target="_blank">University of Bristol</a>, Bristol, <strong>Royaume-Uni</strong><br/>
						<a href="http://www.le.ac.uk/" target="_blank">University of Leicester</a>, Leicester, <strong>Royaume-Uni</strong><br/>
						
						<br/><U>Stage:</U><br/>
						N'importe o�!!
							
					</p>
			</p>
		</div>
	</body>
</html>