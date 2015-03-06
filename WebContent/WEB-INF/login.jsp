<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login in</title>
<link rel="stylesheet" type="text/css" href="CSS/global.css">
</head>
<body>
<%-- Copyright 2010 ESIAL SIE. All rights reserved.  --%>
<%
           if (session.getAttribute("userId") == null) {
%>
<li><form id="login" method="POST" action="PersonServlet" class="webform-confirmation">
        <input type="text" name="text_login" value="Identifiant" size="15" onFocus="if(this.value=='Identifiant')javascript:this.value=''"/>
        <input type="password" name="text_pass" value="Password" size="15" onFocus="javascript:this.value=''"/>
        <input type="hidden" name="action" value="login"/>
        <input type="hidden" name="goback" value="<%= request.getRequestURL()+"?"+request.getQueryString() %>"/>
        <input type="submit" name="log" value="Login"/>
    </form></li>
<%            } else {
%>
    <li><a href="PersonServlet?unlog=1">Logout</a></li>
    <li><a href="viewPerson.jsp?id=<%= session.getAttribute("userId") %>">Profil</a></li>
<%            }
%>
</body>
</html>