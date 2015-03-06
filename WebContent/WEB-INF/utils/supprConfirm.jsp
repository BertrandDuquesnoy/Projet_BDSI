<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript"> 
	function _submit(){
		var f = document.getElementsByTagName("div");
		window.location = "page?modif=2&ajout=&id="+f[0].id+"";
		window.close();
	} 
</script>
<body>
	<p align="center">Êtes vous sûr de vouloir supprimer cet article ?</p>
	<div id="${id}" align="center">
		<input type="button" value="Oui" onclick="_submit()"/> <input type="button" value="Non" onclick="window.close()"/>
	</div>
</body>
</html>