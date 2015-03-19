<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Connexion</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<body>

	<div id="bandeau">
		<a href="http://www.telecomnancy.eu/" id="logoTN" class="logo-img"><img src="<%=request.getContextPath() %>/images/logoTN.png" alt= "Logo TELECOM Nancy" width="180" height="100"/></a>
		<%-- <img src="<%=request.getContextPath() %>/images/relations_internationales.png" style="align:center" width="100%" height="100px"/> --%>
		<h1 class="titre_page" style="position:absolute; top: 2%; left:40%" style=""><B>RELATIONS INTERNATIONALES</B></h1>
	</div>
<form action="login" method="post">
	<div id="margin" >
	<h1 class="titre_page" style="color: #660066";style="position : absolute; top: 20%; left:40%">
	
<table align="center"  border="10" >
  <tr>
    <td>Login </td>
    <td><input type="text" name="login" maxlength="300"></td>
  </tr><pre>
  <tr>
    <td>Password</td>
    <td><input type="password"name="pass" maxlength="300"></td>
  </tr></pre>
  <tr>
    <td colspan="2" align="center"><input type="submit" value="Connexion"></td>
  </tr>
</table>
</div>
</form>
    </body>
</html>