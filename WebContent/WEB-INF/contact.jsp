<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contacts</title>
</head>
<body>
	<%@ include file="headercontact.jsp" %>

		<div id="menu">
				<%@ include file="menu.jsp" %>
			<div id="options_admin">
					<c:if test="${sessionScope.user.fonction == 'Administrateur' || sessionScope.user.fonction == 'Pôle Relations Internationales' || sessionScope.user.fonction == 'Responsable Relations Internationales'}">
			
				<a href="contact?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>
				</c:if>
		
		</div>
		</div>	

	<div id="corps">
		<p class="titre_section">${st.nom}</p>
														
		<p><span class="Directeur" style="color: #6C2466"><B>Directeur : Olivier Festor </B> 
												<pre> Olivier.Festor@telecomancy.eu</pre>		
												<pre> Telephone : 03 83 68 26 01 </pre>		
												<pre> Bureau : 2.07 </pre>
												<pre> </pre>
		</p>
		
		<p><span class="Responsable" style="color: #6C2466"><B>Responsable Relations Internationales : Herve Panetto</B>
												<pre> Herve.Panetto@telecomnancy.eu </pre>
												<pre> contact-international@telecomnancy.eu</pre>	
												<pre> Telephone : 03 83 68 26 24</pre>				   
												<pre> Bureau : 2.12 </pre>
												<pre> </pre>
		</p>
																											
		
		<p><span class="Assistante" style="color: #6C2466"><B>Assistante Relations Internationales : Marine Bergiste </B> 
												<pre> Marine.Bergiste@telecomancy.eu</pre>	
												<pre> contact-international@telecomnancy.eu</pre>	
												<pre> Telephone : 03 83 68 26 01 </pre>		
												<pre> Bureau : 2.34 </pre>
												<pre> </pre>
		</p>
												
		<p><span class="Secrétaire" style="color: #6C2466"><B>Secrétaire Générale : Cathy Lett </B> 
												<pre> Cathy.Lett@telecomancy.eu</pre>		
												<pre> Telephone : 03 83 68 26 01 </pre>	
												<pre> Bureau : 2.34 </pre>
												<pre> </pre>
		</p>
												
		<p><span class="Adresse" style="color: #6C2466"><B>Adresse : TELECOM Nancy - Universite de Lorraine</B> 
												<pre> 193, avenue Paul Muller - CS 90172 - 54602 Villers-lès-Nancy</pre>		
												<pre> Telephone : +33 (0)3 83 68 26 00 </pre>		
												<pre> Fax : +33 (0)3 83 68 26 09 </pre>
												<pre> contact@telecomnancy.eu </pre>
												<pre> </pre>	
		</p>
																												
	</div>
	</body>
</html>