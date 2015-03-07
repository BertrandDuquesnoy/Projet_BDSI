<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css" />
</head>
	<script type="text/javascript">
		function ajouterLien(id){
			window.open('page?modif=&ajout=1&id='+id+'','ajoutLien','menubar=no, scrollbars=no, top=50, left=50, width=200, height=200');
		}
		
		function supprimerLien(id, id_lien){
			window.open('page?modif=&ajout=3&id='+id+'&id_lien='+id_lien+'','supprLien','menubar=no, scrollbars=no, top=50, left=50, width=200, height=200');
		}
	</script>
	<body>
	<%@ include file="header.jsp" %>
	<form >
		<div style="float:left">
			<div id="options_admin">
				<p>
					<input type="submit" value="Enregistrer"/>
				</p>
			</div>
			<div id="cote_gauche">
				<div id="infos_univ" class="infos">
					<p class="text_paragraph">
						Auteur : Paul Cottin <br/>
						Promotion : 2016
					</p>
				</div>
				<div id="infos_univ_details" class="infos">
					<p>
						<span class="nb_etudiants_partis" style="text-align:center">O� suis-je partis</span>
					</p>
					<p class="text_paragraph">
						Entreprise : <input type="text" value="Dassault Aviation" /> <br/>
						Site de l'entreprise : <input type="text" value="dassault.com" /> <br/>
						Ville : <input type="text" value="Moscou" /> <br/>
						Pays : <img src="images/pays/canada.png"> <input type="text" value="Russie" /> <br/>
						Langue : <input type="text" value="Anglais" /> <br/>
					</p>
				</div>
			</div>
			<div id="corps">
				<input type="text" value="Mon stage chez Dassault Aviation" class="titre_section">
				<p>
					<span class="nb_etudiants_partis">Ma première impression : </span>
				</p>
				<textarea name="premiereImpression" cols="100" rows="10">Mon voyage s'est déroulé super bien, c'est vraiment une entreprise formidable</textarea>
				<p>
					<span class="nb_etudiants_partis">Comment était l'entreprise ? </span>
				</p>
				<textarea name="commentImpression" cols="100" rows="10">Clairement, un vrai bonheur, je repars bosser là-bas dès que je peux !</textarea>
				<p>
					<span class="nb_etudiants_partis">Et la ville ? </span>
				</p>
				<textarea name="villeImpression" cols="100" rows="10">Moscou ? Mais c'était juste génial, le Kremlin je recommande vivement, le métro également est une vraie pièce de musée</textarea>
				<p>
					<span class="nb_etudiants_partis">Un conseil ?</span>
				</p>
				<textarea name="conseil" cols="100" rows="10">Vas-y, la Russie c'est génial ! :)</textarea>
				<p>
					<span class="nb_etudiants_partis">Mes notes : </span>
				</p>
				<p>
					L'entreprise : <select name="noteEntreprise"><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option></select> / 5<br/>
					La ville :  <select name="noteVille"><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option></select> / 5<br/>
				</p>
				<p>
					<span class="nb_etudiants_partis">Les liens qui m'ont aidé : </span>
				</p>
				<p>
					<c:if test="${page.nbLiens > 1}">
						<c:forEach var="i" begin="0" end="${page.nbLiens-1}">
							<input type="text" name="lien${i}" value="${page.liensIntitule[i]}"/> <input type="text" value="${page.liens[i]}"/>
							<input type="button" value="Supprimer ce lien" onclick="supprimerLien(${page.id},${i})" /> <br/>
						</c:forEach>
					</c:if>
					<input type="button" value="Ajouter un lien" class="ok_button" onclick="ajouterLien(${page.id})"/>
				</p>
			</div>
		</div>
	</form>
	</body>
</html>