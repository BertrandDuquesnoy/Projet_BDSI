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
			<B style="color: #6C2466"> Double diplome</B>
			<input type="radio" name="genre" value="Double diplome" ><br><pre>
			</pre><B style="color: #6C2466">Université</B>
			<input type="radio" name="genre" value="Université" ><br><pre>
			</pre><B style="color: #6C2466"> Logo </B><input type="file" name="icon" value="" size="15"/><pre>
			</pre><B style="color: #6C2466"> Nom</B><pre>
			<input type="text" name="Université" value="" size="15">  
			</pre><B style="color: #6C2466"> Site web </B><pre>
			<input type="text" name="Université" value="" size="15"/>
			</pre><B style="color: #6C2466"> Pays </B><pre>
			<input type="text" name="Université" value="" size="15"/>  
			</pre><B style="color: #6C2466"> Ville </B><pre>
			<input type="text" name="Université" value="" size="15"/> 
			</pre><B style="color: #6C2466">Adresse Postale </B><pre>
			<textarea rows="3"></textarea>
			</pre><B style="color: #6C2466"> Date de fondation (école, université)</B><pre>
			<input type="text" name="Université" value="" size="15"/>  
			</pre><B style="color: #6C2466"> Nombre d'étudiant </B><pre>
			<input type="text" name="Université" value="" size="15"/>
			</pre><B style="color: #6C2466"> Facebook (école, université) </B><pre>
			<input type="text" name="Université" value="" size="15"/>
			</pre><B style="color: #6C2466"> Twitter (école, université) </B><pre>
			<input type="text" name="Université" value="" size="15"/>  
			</pre><B style="color: #6C2466"> LinkedIn(école, université) </B><pre>
			<input type="text" name="Université" value="" size="15"/> 
			</pre><B style="color: #6C2466"> Présentation du partenariat </B><pre>
			<textarea rows="3"></textarea></pre>
			<p style="text-align:center;"><input type="button" name="Valider" value="Valider" size="15" /></p> 											
	</div>
	</body>
</html>