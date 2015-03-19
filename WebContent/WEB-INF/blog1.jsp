<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
<title>blog</title>
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


	
<div id = "i1">	
<div id="cf1">
  <img class="bottom" src="<%=request.getContextPath() %>/images/pays/mexico.jpg" />
  <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_mexique.jpg" />

 </div>
 
 <div id ="p1">
 <p>Mexique</p>
 </div>
</div>


<div id = "i2">	
 <div id="cf2">
   <img class="bottom" src="<%=request.getContextPath() %>/images/pays/german.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_allemagne.jpg" /> 
 </div>
  <div id ="p2">
 <p>Allemagne</p>
 </div>
</div>
 
 
 <div id = "i3">	
 <div id="cf3">
   <img class="bottom" src="<%=request.getContextPath() %>/images/pays/canada.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_canada.jpg" />
</div>
<div id ="p3">
 <p>Canada</p>
 </div>
 </div>
 
 
 
 <div id = "i4">	

 <div id="cf4">
    <img class="bottom" src="<%=request.getContextPath() %>/images/pays/irland.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_irlande.jpg" />
 </div>
  <div id ="p4">
 <p>Irlande</p>
 </div>
 
 </div>
 
 
 <div id = "i5">	

 <div id="cf5">
    <img class="bottom" src="<%=request.getContextPath() %>/image/pays/tunis.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/ma_tunisie.jpg" />
 </div>
  <div id ="p5">
 <p>Tunisie</p>
 </div>
 
 </div>
 <div id = "i6">	

 <div id="cf6">
    <img class="bottom" src="<%=request.getContextPath() %>/images/pays/british.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_angleterre.jpg" /> 
 </div>
  <div id ="p6">
 <p>Grande bretagne</p>
 </div>
 
 </div>
 <div id = "i7">	

 <div id="cf7">
   <img class="bottom" src="<%=request.getContextPath() %>/images/pays/norvege.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_norvege.jpg" />
 </div>
  <div id ="p7">
 <p>Norvege</p>
 </div>
 
 </div>
 <div id = "i8">	

 <div id="cf8">
  <img class="bottom" src="<%=request.getContextPath() %>/images/pays/romania.jpg" />
   <img class="top" src="<%=request.getContextPath() %>/images/pays/ma_roumanie.jpg" />
 </div>
  <div id ="p8">
 <p>roumanie</p>
 </div>
 
 </div>
 <div id = "i9">	

 <div id="cf9">
   <img class="bottom" src="<%=request.getContextPath() %>/images/pays/spain.jpg" />
  <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_espagne.jpg" />
 </div>
  <div id ="p9">
 <p>Espagne</p>
 </div>
 
 </div>


 
 <div id = "i10">	

 <div id="cf10">
    <img class="bottom" src="<%=request.getContextPath() %>/images/pays/australie.jpg" />
  <img class="top" src="<%=request.getContextPath() %>/images/pays/mon_australie.jpg" />
 </div>
  <div id ="p10">
 <p>Espagne</p>
 </div>
 
 
 </div>

   
 
 </div>
 


</body>
</html>