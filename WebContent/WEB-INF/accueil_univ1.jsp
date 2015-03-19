<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
<title>Université</title>
</head>
<body>
<%@ include file="header.jsp"%>

 <div id="cote_gauche">
	 
		<div id="Menu" >
		<ul id = "Onglets">
   <li><a href="<%=request.getContextPath() %>/accueil" title="Accueil">Accueil</a></li>
   <li><a href="#" title="Partir à l'étranger">Partir à l'étranger</a>
   
   
   
               <ul>          
		              <li><a href="<%=request.getContextPath() %>/partirEtranger/presentation">Présentation</a></li>
                      <li><a href="<%=request.getContextPath() %>/partirEtranger/modalite">Modalité</a></li>
                      
         
               </ul>
         
   </li>
   
  
   <li><a href="<%=request.getContextPath() %>/accueil/stages" title="Stages réalisés">Stages réalisés</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/doubleDiplome" title="Doubles diplômes">Doubles diplômes</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/universite" title="Université">Université</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/blog" title="Blog">Blog</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/faq" title="FAQ">FAQ</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/contact" title="Contact">Contact</a></li>
   <li><a href="<%=request.getContextPath() %>/accueil/Liens utiles" title="Liens utiles">Liens utiles</a></li>
  
             </ul>
			
			
	    </div>
		
		
		
		
		<div id="lien_res_sociaux">
				<a href="${university.facebook_link}" id="logo_fb"><img src="<%=request.getContextPath() %>/images/facebook.png" width="30" height="30"/></a>
				<a href="${university.twitter_link }" id="logo_tw"><img src="<%=request.getContextPath() %>/images/twitter.png" width="30" height="30"/></a>
				<a href="${university.linkedin_link }" id="logo_ln"><img src="<%=request.getContextPath() %>/images/linkedin.png" width="30" height="30"/></a>
		</div>
	</div>



	
	
	<div id ="p1">
    <img src="<%=request.getContextPath() %>/images/logo_univ/Instituto_Tecnológico_de_Monterrey.png" /><br/>
	</br>
    Instituto Tecnológico de Monterrey
</div>


<div id ="p2">
   <img src="<%=request.getContextPath() %>/images/logo_univ/Martin_Luther_Universitat.jpg" /><br/>
   </br>
    Martin Luther Universitat
</div>


<div id ="p3">
    <img src="<%=request.getContextPath() %>/images/logo_univ/National_University_of_Ireland.jpg" /><br/>
	</br>
   National University of Ireland
</div>

<div id ="p4">
    <img src="<%=request.getContextPath() %>/images/logo_univ/Norwegian_University_of_Science_and_Technology.png" /><br/>
	</br>
   Norwegian University of Science and Technology
</div>

<div id ="p5">
    <img src="<%=request.getContextPath() %>/images/logo_univ/SupCom_Tunis.gif" /><br/>
	</br>
              SupCom Tunis
</div>

<div id ="p6">
    <img src="<%=request.getContextPath() %>/images/logo_univ/The_University_of_Queensland.jpg" /><br/>
	</br>
   The University of Queensland
</div>


<div id ="p7">
    <img src="<%=request.getContextPath() %>/images/logo_univ/Universitat_Politècnica_de_Catalunya.jpg" /><br/>
	</br>
  Universitat Politècnica de Catalunya
</div>

<div id ="p8">
    <img src="C<%=request.getContextPath() %>/images/logo_univ/Universidad_autonoma_de_Madrid.gif" /><br/>
	</br>
  Universidad autonoma de Madrid
</div>

<div id ="p9">
    <img src="<%=request.getContextPath() %>/images/logo_univ/Universitatea_Stefan_cel_Mare.gif" /><br/>
	</br>
  Universitatea Stefan cel Mare
</div>

<div id ="p10">
    <img src="C<%=request.getContextPath() %>/images/logo_univ/Universitatea_din_Pitesti.gif" /><br/>
	</br>
    Universitatea din Pitesti
</div>

<div id ="p11">
    <img src="C<%=request.getContextPath() %>/images/logo_univ/University_of_Bristol.gif" /><br/>
	</br>
    University_of_Bristol
</div>

<div id ="p12">
    <img src="<%=request.getContextPath() %>/images/logo_univ/University_of_Leicester.jpg" /><br/>
	</br>
   University of Leicester
</div>


<div id ="p13">
    <img src="C<%=request.getContextPath() %>/images/logo_univ/UQAC.jpg" /><br/>
	</br>
    UQAC     
</div>
<div id ="p14">
    <img src="<%=request.getContextPath() %>/images/logo_univ/UQAM.jpg" /><br/>
	</br>
    UQAM
</div>


</body>
</html>