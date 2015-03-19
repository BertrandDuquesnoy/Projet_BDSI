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
			<div id="menu">
				<%@ include file="menu.jsp" %>
			
		</div>	
		<div id="options_admin">
			<p>
					<c:if test="${sessionScope.user.fonction == 'Administrateur' || sessionScope.user.fonction == 'P�le Relations Internationales' || sessionScope.user.fonction == 'Responsable Relations Internationales'}">
			
				<a href="presentation?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>
		</c:if>

				
		</div>
		



<div id ="texte">
       <p> <span class="nb_etudiants_partis">Comment puis-je visualiser l'ensemble des stages effectu�s � l'�tranger ?</span></p>
<p>A partir de votre page d'accueil, cochez la case "Stages" situ� en bas de l'�cran, l'ensemble des stages effectu�s � l'�tranger s'afficheront alors sur la google Map, cliquez sur les marqueurs pour obtenir des informations sur un stage en particulier.
</p>
<p>
 <span class="nb_etudiants_partis">Comment puis-je faire partager mon ressenti d'un s�jour effectu� � l'�tranger ?</span></p>
<p>Vous pouvez partager votre exp�rience en �crivant un article sur le blog du site, qui sera publi� apr�s avoir �t� valid� par un mod�rateur.
</p>
<p>
<span class="nb_etudiants_partis">Comment puis-je noter une universit� ?</p>
<p>
Apr�s vous �tre authentifi�, si vous avez effectu� un s�jour dans une universit�, vous avez la possibilit� de lui attribuer une note entre 0 et 5 � en vous rendant dans l'onglet  "Universit�s"
</p>
<br/>
						    &nbsp&nbsp&nbsp&nbsp&nbsp�Relations internationales<br/>
	
<p>
<span class="nb_etudiants_partis">Comment puis-je ajouter un nouveau partenariat sur le site ?</span></p>
<p>Vous devez tout d'abord vous �tre authentifi� avant de pouvoir cr�er un nouveau partenariat. Une fois authentifi�, cliquez alors sur "Cr�ation partenariat" en haut de l'�cran, l'interface de cr�ation d'un partenariat s'ouvrira.
</p>
<p>
<span class="nb_etudiants_partis">Comment puis-je mod�rer les publications des �l�ves ?</span></p>
<p id ="pp1">Apr�s vous �tre authentifi�, � partir de votre page d'accueil, cliquez sur "Notifications" en haut de l'�cran, l'interface de mod�ration des publications s'ouvrira.
Vous pouvez alors consulter les avis en attente de validation propos�s par les �l�ves. Une fois ces avis jug�s conformes, vous devez cliquez sur le bouton "valider" pour rendre ces avis visibles par le personnel et les �tudiants de l'�cole. 
<p/>
		<div id = "pp2">
	
		<br/>
						  &nbsp&nbsp&nbsp&nbsp&nbsp �Visiteurs du site<br/>
        
        <p>
         <span class="nb_etudiants_partis">Puis-je m'identifier pour avoir acc�s � des informations compl�mentaires ?</span></p>
<p>Seuls les �l�ves et le personnel de T�l�com Nancy peuvent s'authentifier. Si vous souhaitez davantage d'informations concernant les s�jours � l'�tranger effectu�s par nos �l�ves, veuillez contacter le responsable des relations internationales de l'�cole : Herve.Panetto@telecomnancy.eu
        </p>
        </div>
    </div>        
    </body>
</html>