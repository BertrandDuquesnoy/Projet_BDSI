<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
</head>
	<script type="text/javascript">
		function ajouterLien(id){
			window.open('page?modif=&ajout=1&id='+id+'','ajoutLien','menubar=no, scrollbars=no, top=50, left=50, width=200, height=200');
		}
		
		function supprimerLien(id, id_lien){
			window.open('page?modif=&ajout=3&id='+id+'&id_lien='+id_lien+'','supprLien','menubar=no, scrollbars=no, top=50, left=50, width=400, height=50');
		}
	</script>
	<body>
	<c:set var="art" value="${page}"/>
	<%@ include file="header.jsp" %>
	<form method="post" action="page?id=${art.id}&modif=4&ajout=">
		<div style="float:left">
			<div id="options_admin">
				<p>
					<input type="submit" class="ok_button" value="Enregistrer"/>
				</p>
			</div>
			<div id="cote_gauche">
				<div id="infos_univ" class="infos">
					<p class="text_paragraph">
						${art.auteur} <br/>
						promotion: ${art.promotion}
					</p>
				</div>
				<div id="infos_univ_details" class="infos">
					<p>
						<span class="nb_etudiants_partis" style="text-align:center">Où suis-je partis</span>
					</p>
					<p class="text_paragraph">
						Entreprise : <input type="text" name ="entreprise" value="${art.entreprise}" /> <br/>
						Site de l'entreprise : <input type="text" name="urlEntreprise" value="${art.urlEntreprise}" /> <br/>
						Ville : <input type="text" name="ville" value="${art.ville}" /> <br/>
						Pays : <input type="text" name="pays" value="${art.pays}" /> <br/>
						Langue : <input type="text" name="langue" value="${art.langue}" /> <br/>
					</p>
				</div>
			</div>
			<div id="corps">
				<input type="text" name="titre" value="${art.titre}" class="titre_section">
				<p>
					<span class="nb_etudiants_partis">Ma première impression : </span>
				</p>
				<textarea name="premiereImpression" cols="100" rows="10">${art.premiereImpression}</textarea>
				<p>
					<span class="nb_etudiants_partis">Comment était l'entreprise ? </span>
				</p>
				<textarea name="commentImpression" cols="100" rows="10">${art.commentImpression}</textarea>
				<p>
					<span class="nb_etudiants_partis">Et la ville ? </span>
				</p>
				<textarea name="villeImpression" cols="100" rows="10">${art.villeImpression}</textarea>
				<p>
					<span class="nb_etudiants_partis">Un conseil ?</span>
				</p>
				<textarea name="conseil" cols="100" rows="10">${art.conseil}</textarea>
				<p>
					<span class="nb_etudiants_partis">Mes notes : </span>
				</p>
				<p>
					L'entreprise : <select name="noteEntreprise">
									<option <c:if test="${art.noteEntreprise == 1}">selected="selected"</c:if>>1</option>
									<option <c:if test="${art.noteEntreprise == 2}">selected="selected"</c:if>>2</option>
									<option <c:if test="${art.noteEntreprise == 3}">selected="selected"</c:if>>3</option>
									<option <c:if test="${art.noteEntreprise == 4}">selected="selected"</c:if>>4</option>
									<option <c:if test="${art.noteEntreprise == 5}">selected="selected"</c:if>>5</option>
								</select> / 5
								<br/>
					La ville :  <select name="noteVille">
									<option <c:if test="${art.noteVille == 1}">selected="selected"</c:if>>1</option>
									<option <c:if test="${art.noteVille == 2}">selected="selected"</c:if>>2</option>
									<option <c:if test="${art.noteVille == 3}">selected="selected"</c:if>>3</option>
									<option <c:if test="${art.noteVille == 4}">selected="selected"</c:if>>4</option>
									<option <c:if test="${art.noteVille == 5}">selected="selected"</c:if>>5</option>
								</select> / 5
								<br/>
				</p>
				<p>
					<span class="nb_etudiants_partis">Les liens qui m'ont aidé : </span>
				</p>
				<p>
					<c:if test="${art.nbLiens > 0}">
						<c:forEach var="i" begin="0" end="${art.nbLiens-1}">
							<input type="text" name="item${i}" value="${art.liensIntitule[i]}"/> <input type="text" name="lien${i}" value="${art.liens[i]}"/>
							<input type="button" value="Supprimer ce lien" class="ok_button" onclick="supprimerLien(${art.id},${i})" /> <br/>
						</c:forEach>
					</c:if>
					<input type="button" value="Ajouter un lien" class="ok_button" onclick="ajouterLien(${art.id})"/>
					<input type="hidden" name="nbLiens" value="${art.nbLiens}"/>
					<input type="hidden" name="id" value="${art.id}"/>
				</p>
			</div>
		</div>
	</form>
	</body>
</html>