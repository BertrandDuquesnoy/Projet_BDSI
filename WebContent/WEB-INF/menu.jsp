<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	   <title>Page d'accueil </title>
	   <link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<body>

 <div id="cote_gauche">
	 
		<div id="Menu" >
		<ul id = "Onglets">
   <li><a href="<%=request.getContextPath() %>/accueil" title="Accueil">Accueil</a></li>
   <li><a href="#" title="Partir � l'�tranger">Partir � l'�tranger</a>
   
   
   
               <ul>          
		              <li><a href="<%=request.getContextPath() %>/partirEtranger/presentation">Pr�sentation</a></li>
                      <li><a href="<%=request.getContextPath() %>/partirEtranger/modalite">Modalit�</a></li>
                      
         
               </ul>
         
   </li>
   
  
   <li><a href="<%=request.getContextPath() %>/accueil/stages" title="Stages r�alis�s">Stages r�alis�s</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/doubleDiplome" title="Doubles dipl�mes">Doubles dipl�mes</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/universite" title="Universit�">Universit�</a></li>
   <li><a href="#" title="FAQ">FAQ</a></li>
   <li><a href="#" title="Contact">Contact</a></li>
  
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