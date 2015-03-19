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
	<div id="options_admin">
	<p>
			<p style="margin-left:500px;">

				
		</div>
		<div id="menu">
				<%@ include file="menu.jsp" %>
			
		</div>	

	<div id="corps">
		<form action="contact" method="post">
		<input class="options_admin" type="submit" value="enregistrer"/>
		<p class="titre_section">${st.nom}</p>
		<p class="Responsable" style="color: #6C2466"><B>Responsable Relations Internationales : <input type="text" name="resprelint" value="${con.RespRelInt}"/></B>
												<pre/><textarea name="c_respoRelInt" cols="80" rows="5"> ${contact.description}</textarea> 
												
																											
		
		<p style="color: #6C2466"><B>Assistante Relations Internationales : <input type="text" name="assrelint" value="${con.AssRelInt}"/> </B> </p>
												<pre/> <textarea name="c_assRelInt" cols="80" rows="5"> ${contact.description}</textarea>
												
		<p class="Directeur" style="color: #6C2466"><B>Directeur : <input type="text" name="directeur" value="${con.Dir}"/> </B> </p>
												<pre/><textarea name="c_directeur" cols="80" rows="5"> ${contact.description}</textarea>
												
		
		<p style="color: #6C2466"><B>Assistante Relations Internationales : <input type="text" name="assrelint" value="${con.AssRelInt}"/> </B></p> 
												<pre/> <textarea name="c_assRelInt" cols="80" rows="5"> ${contact.description}</textarea>
												
		<p style="color: #6C2466"><B>Secrétaire Générale : <input type="text" name="secGen" value="${con.AssRelInt}"/> </B></p> 
												<pre/> <textarea name="c_secGen" cols="80" rows="5"> ${contact.description}</textarea>
												
		<p style="color: #6C2466"><B>Adresse : <input type="text" name="adresse" value="${con.AssRelInt}"/> </B></p> 
												<pre/> <textarea name="c_adresse" cols="80" rows="5"> ${contact.description}</textarea>
		
		</form>															
	</div>
	</body>
</html>