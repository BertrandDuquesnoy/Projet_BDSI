<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
	<script type="text/javascript">
	
		var value = "test";
		
		function updateComboBox(){
			/* value = cb.options[cb.selectedIndex].value; */
			alert("coucou");
		}
	</script>
	<script>
	
		function supprimerCategorie(){
			width = 400;
            height = 300;
            if(window.innerWidth){
                    var left = (window.innerWidth-width)/2;
                    var top = (window.innerHeight-height)/2;
            }else{
                    var left = (document.body.clientWidth-width)/2;
                    var top = (document.body.clientHeight-height)/2;
            }
            popup = window.open('','SuppC','menubar=no, scrollbars=no, top='+top+', left='+left+', width='+width+', height='+height+'');
            popup.document.writeln("Cat�gorie � supprimer : ");
            popup.document.writeln('<select id="comboBox"></select>');
            var cb = popup.document.getElementById("comboBox");
            popup.document.write('<p><a href="blog?modif=2&name='+value+'" onmouseover="updateComboBox()" onMouseUp="window.close()">Supprimer</a> <a href="" onclick=window.close();>Annuler</a>');
            
		}
	</script>
	<body>
		<%@ include file="header.jsp"%>
		<div id="options_admin">
			<p>
				<a href="blog?modif=1" style="text-decoration:none; color: #6C2466"> <span class="options_admin">Modifier</span></a>

				
		</div>
		<div id="accueil" style="width:20%"><%@ include file="menu.jsp" %></div>
		<div id="corps">
			<p>
						<span class="nb_etudiants_partis">Pourquoi ?  </span>
					</p>
					<p>
						Valorisation du dip�me
					</p>
					<p>
						<span class="nb_etudiants_partis">Comment ? </span>
					</p>
					<p>
						ERASMUS
					</p>
					<p>
						<span class="nb_etudiants_partis">O� ? </span>
					</p>
					<p>
						Lister les diff�rents pays o� un accord est sign�
						Le stage est r�alisable n�importe o�, c�est � l��tudiant de faire la d�marche et l��cole sera l� pour l�aider
					</p>
					<p>
						<span class="nb_etudiants_partis">Quand ?</span>
					</p>
					<p>
						Deuxi�me semestre de la 2�me ann�e*
						3�me ann�e
						Pendant les p�riodes de stage
					</p>
					
			</p>
		</div>
	</body>
</head><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>