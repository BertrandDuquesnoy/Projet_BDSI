<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
<title>Insert title here</title>
</head>
<script type="text/javascript"> 
	function _submit(){
		var f = document.getElementsByTagName("div");
		window.location = "page?modif="+f[1].id+"&ajout=&id="+f[0].id+"&id_lien="+f[2].id+"";
		window.close();
	} 
</script>
<body>
	<p align="center">Êtes vous sûr de vouloir supprimer ${text} ?</p>
	<div id="${id}" align="center">
		<input type="button" value="Oui" class="ok_button" onclick="_submit()"/> <input type="button" value="Non" class="ok_button" onclick="window.close()"/>
	</div>
	<div id="${modif}"></div>
	<div id="${id_lien}"></div>
</body>
</html>