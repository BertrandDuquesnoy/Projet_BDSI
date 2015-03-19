<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	   <title>Page d'accueil </title>
	   <link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<body>

 <div id="cote_gauche">
	 
		<div id="Menu" >
		<ul id = "Onglets">
   <li><a href="<%=request.getContextPath() %>/accueil" title="Accueil">Accueil</a></li>
   <li><a href="#" title="Partir à l'étranger">Partir à l'étranger</a>
   
   
   
               <ul>          
		              <li><a href="<%=request.getContextPath() %>/partirEtranger/presentation">Présentation</a></li>
                      <li><a href="<%=request.getContextPath() %>/partirEtranger/modalite">Modalités</a></li>
                      
         
               </ul>
         
   </li>
   
  
   <li><a href="<%=request.getContextPath() %>/accueil/stages" title="Stages réalisés">Stages réalisés</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/doubleDiplome" title="Doubles diplômes">Doubles diplômes</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/universite" title="Université">Universités</a></li>
   <li><a href="<%=request.getContextPath() %>/blog" title="Blog">Blog</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/faq" title="FAQ">FAQ</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/contact" title="Contact">Contacts</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/liens" title="Liens utiles">Liens utiles</a></li>
  
             </ul>
			
			
	    </div>
		
		
		
		
		<div id="lien_res_sociaux">
				<a href="${university.facebook_link}" id="logo_fb"><img src="<%=request.getContextPath() %>/images/facebook.png" width="30" height="30"/></a>
				<a href="${university.twitter_link }" id="logo_tw"><img src="<%=request.getContextPath() %>/images/twitter.png" width="30" height="30"/></a>
				<a href="${university.linkedin_link }" id="logo_ln"><img src="<%=request.getContextPath() %>/images/linkedin.png" width="30" height="30"/></a>
		</div>
	</div>
</body>
</html>
