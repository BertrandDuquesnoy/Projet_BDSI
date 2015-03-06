<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	   <title>Page d'accueil </title>
	   <link type="text/css" rel="stylesheet" href="CSS/style.css" />
</head>

<header>
	  <div id="bandeau">
		<a href="http://www.telecomnancy.eu/" id="logoTN" class="logo-img"><img src="images/logoTN.png" alt= "Logo TELECOM Nancy" width="180" height="100"/></a>
		<h1 class="titre_page" style="position:absolute; top: 2%; left:33%">PRESENTATION</h1>
		<p id="connexion">
			Nom Pr�nom / D�connexion </p>
		
			
	</header>

<body>

 <div id="cote_gauche">
	 
		<div id="Menu" >
		<ul id = "Onglets">
   <li><a href="#" title="Accueil">Accueil</a></li>
   <li><a href="#" title="Partir � l'�tranger">Partir � l'�tranger</a>
   
   
   
               <ul>          
		              <li><a href="#">Pr�sentation</a></li>
                      <li><a href="#">Modalit�</a></li>
         
               </ul>
         
   </li>
   
  
   <li><a href="#" title="Stages r�alis�s">Stages r�alis�s</a></li>
   <li><a href="#" title="Doubles dipl�mes">Doubles dipl�mes</a></li>
   <li><a href="#" title="Universit�">Universit�</a></li>
   <li><a href="#" title="FAQ">FAQ</a></li>
   <li><a href="#" title="Contact">Contact</a></li>
  
             </ul>
			
			
	    </div>
		
		
		
		
		<div id="lien_res_sociaux">
				<a href="${university.facebook_link}" id="logo_fb"><img src="images/facebook.png" width="30" height="30"/></a>
				<a href="${university.twitter_link }" id="logo_tw"><img src="images/twitter.png" width="30" height="30"/></a>
				<a href="${university.linkedin_link }" id="logo_ln"><img src="images/linkedin.png" width="30" height="30"/></a>
		</div>
	</div>
	<p>
				<span class="nb_etudiants_partis">Pourquoi ?</span>
			</p>
			<p>
				Valorisation du dipl�me
			</p>
			<p>
				<span class="nb_etudiants_partis">Comment ? </span>
			</p>
			<p>
				ERASMUS
			</p>
			<p>
				<span class="nb_etudiants_partis">O� ? </span>
			</p>
			<p>
				<div id="infos_univ" class="infos">
				<p class="text_paragraph">
					Auteur : Paul Cottin <br/>
					Promotion : 2016
				</p>
			</div>
			<div id="infos_univ_details" class="infos">
				<p>
					<span class="nb_etudiants_partis" style="text-align:center">Où suis-je partis</span>
				</p>
				<p class="text_paragraph">
					Entreprise : Dassault Aviation <br/>
					Site de l'entreprise : <a href="" class="lien_default">dassault.com</a> <br/>
					Ville : Moscou <br/>
					Pays : <img src="images/pays/canada.png"> Russie <br/>
					Langue : Anglais <br/>
				</p>
			</div>
			</p>
			<p>
				<span class="nb_etudiants_partis">Un conseil ?</span>
			</p>
			<p>
				Vas-y, la Russie c'est génial ! :)
			</p>
	 
	 
       
    </body>

</html>