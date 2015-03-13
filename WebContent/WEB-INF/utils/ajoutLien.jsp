<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
<script type="text/javascript">
	function _submit(){
		var form = document.getElementById("f");
		form.submit();
		window.close();
	}
</script>
<body>
	<form action="page" method="post" id="f">
		<p>Intitulé : <input type="text" name="nouveauIntitule"/></p>
		<p>Lien : <input type="text" name="nouveauLien"/></p>
		<input type="hidden" name="id" value="${id}">

		<input type="button" class="ok_button" value="Enregistrer" onclick="_submit()"/>
		<input type="button" class="ok_button" value="Annuler" onclick="window.close()"/>
	</form>
</body>
</html>