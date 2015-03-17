<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	   <title>Page d'accueil </title>
	   <link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>

<%@ include file="header.jsp" %>

<body>

 <div id="accueil">
	 
		<%@include file="menu.jsp" %>
	 
	 <div id="corps">
	 	<iframe src="accueil?carte=1" class="carte" width="100%" height="500px"></iframe>
	 </div>
       
    </body>

</html>