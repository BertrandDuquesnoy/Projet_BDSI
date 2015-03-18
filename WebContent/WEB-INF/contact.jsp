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
		<%-- 	<p align="center"><img src="images/contacts.png" width="140" height="80" ></p><br/>--%>

		<div id="menu">
				<%@ include file="menu.jsp" %>
			
		</div>	

	<div id="corps">
		<p class="titre_section">${st.nom}</p>
		<p><span class="Responsable" style="color: #6C2466"><B>Responsable Relations Internationales : Herve Panetto</B>
												<pre> Herve.Panetto@telecomnancy.eu </pre>				  
												<pre> Telephone : 03 83 68 26 24</pre>				   
												<pre> Bureau : 2.12 </pre>
												<pre> </pre>
																											
		
		<p style="color: #6C2466"><B>Assistante Relations Internationales : Marine Bergiste </B> 
												<pre> Marine.Bergiste@telecomancy.eu</pre>		
												<pre> Telephone : 03 83 68 26 01 </pre>		
												<pre> Bureau : 2.34 </pre>
												<pre> </pre>
												
		<p><span class="Directeur" style="color: #6C2466"><B>Directeur : Olivier Festor </B> 
												<pre> Olivier.Festor@telecomancy.eu</pre>		
												<pre> Telephone : 03 83 68 26 01 </pre>		
												<pre> Bureau : 2.07 </pre>
												<pre> </pre>
		</p>
																	
	</div>
	</body>
</html>