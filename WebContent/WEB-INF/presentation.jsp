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
				<a href="blog?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>

				
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
						
						T�l�com Nancy poss�de des partenariats avec de nombreux pays:<br/>
						<br/><U>Les doubles dipl�mes:</U>
						<br/>L'Universit� du Qu�bec A Chicoutimi (UQAC), <strong>Canada</strong>, <a href="https://www-intranet.telecomnancy.univ-lorraine.fr/lib/exe/fetch.php/ri/presentation_telecom_nancy.pdf">Pr�sentation Chicoutimi 2014</a><br/>
						Sup'com, Tunis, <strong>Tunisie</strong><br/>
						Tecnologico de Monterrey, Monterrey, <strong>Mexique</strong><br/>
						University of Queensland, Brisbane, <strong>Australie</strong><br/>
						
						<br/><U>ERASMUS:</U><br/>
						Martin-Luther-Universit�t HalleWittenberg, <strong>Allemagne</strong><br/>
						Universidad autonoma, Madrid, <strong>Espagne</strong><br/>
						TKK Aalto, Helzinski, <strong>Finlande</strong><br/>
						University of Maynooth, <strong>Irlande</strong><br/>
						Politecnico di Bari, <strong>Italie</strong><br/>
						NTNU, Trondheim, <strong>Norv�ge</strong><br/>
						University of Science and Technology, Cracovie, <strong>Pologne</strong><br/>
						Universidade Nova de Lisboa, <strong>Portugal</strong><br/>
						Universitatea STEFAN CEL MARE, Suceava, <strong>Roumanie</strong><br/>
						Universitatea Din Pitesti, <strong>Roumanie</strong><br/>

						<br/><U>Stage:</U><br/>
						N'importe o�!!
							
					</p>
			</p>
		</div>
	</body>
</head>