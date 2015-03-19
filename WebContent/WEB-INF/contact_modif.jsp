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
				<a href="modalite?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>

				
		</div>
		<div id="menu">
				<%@ include file="menu.jsp" %>
			
		</div>	

	<div id="corps">
		<p class="titre_section">${st.nom}</p>
		<p><span class="Responsable" style="color: #6C2466"><B>Responsable Relations Internationales : <input type="text" name="resprelint" value="${con.RespRelInt}"/></B>
												<pre> <textarea name="description" cols="80" rows="5"> ${contact.description}</textarea> </pre>
												<pre> </pre>
																											
		
		<p style="color: #6C2466"><B>Assistante Relations Internationales : <input type="text" name="assrelint" value="${con.AssRelInt}"/> </B> 
												<pre> <textarea name="description" cols="80" rows="5"> ${contact.description}</textarea>  </pre>
												<pre> </pre>
												
		<p><span class="Directeur" style="color: #6C2466"><B><input type="text" name="directeur" value="${con.Dir}"/> </B> 
												<pre><textarea name="description" cols="80" rows="5"> ${contact.description}</textarea>  </pre>
												<pre> </pre>
		</p>
																	
	</div>
	</body>
</html>