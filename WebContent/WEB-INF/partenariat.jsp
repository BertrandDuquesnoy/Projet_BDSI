<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Partenariats</title>
</head>
<body>
	<%@ include file="headerpartenariat.jsp" %>
		<%-- 	<p align="center"><img src="images/contacts.png" width="140" height="80" ></p><br/>--%>

		<div id="menu">
				<%@ include file="menu.jsp" %>
			
		</div>	

	<div id="corps">
		<p class="titre_section">${st.nom}</p>
			<B style="color: #6C2466">Double diplome</B><input type="radio" name="Double diplome" value="" size="1"/>
			<B style="color: #6C2466">Université </B><input type="radio" name="Université" value="" size="1" />
			<B style="color: #6C2466"><pre> Logo </B><input type="file" name="icon" value="" size="15"/>
			<B style="color: #6C2466"><pre> Nom</B>
			<input type="text" name="Université" value="" size="15">  
			<B style="color: #6C2466"><pre> Site web </B>
			<input type="text" name="Université" value="" size="15"/>
			<B style="color: #6C2466"><pre> Pays </B>
			<input type="text" name="Université" value="" size="15"/>  
			<B style="color: #6C2466"><pre> Ville </B>
			<input type="text" name="Université" value="" size="15"/> 
			<B style="color: #6C2466"><pre> Adresse Postale </B>
			<textarea rows="3"></textarea>
			<B style="color: #6C2466"><pre> Date de fondation (école, université)</B>
			<input type="text" name="Université" value="" size="15"/>  
			<B style="color: #6C2466"><pre> Nombre d'étudiant </B>
			<input type="text" name="Université" value="" size="15"/>
			<B style="color: #6C2466"><pre> Facebook (école, université) </B>
			<input type="text" name="Université" value="" size="15"/>
			<B style="color: #6C2466"><pre> Twitter (école, université) </B>
			<input type="text" name="Université" value="" size="15"/>  
			<B style="color: #6C2466"><pre> LinkedIn(école, université) </B>
			<input type="text" name="Université" value="" size="15"/> 
			<B style="color: #6C2466"><pre> Présentation du partenariat </B>
			<textarea rows="3"></textarea></pre>
			<input type="button" name="Valider" value="Valider" size="15"/> 
														
	</div>
	</body>
</html>