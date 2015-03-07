<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link type="text/css" rel="stylesheet" href="../CSS/style.css" />
<script type="text/javascript">
function supprimerArticle(id){
	fen = window.open('page?modif=&ajout=2&id='+id+'','suppArt','menubar=no, scrollbars=no, top=50, left=50, width=400, height=100');
}
</script>
</head>
	<body>
	<%@ include file="header.jsp" %>
		<c:if test="${page.nbArticles > 0}">
		<c:forEach var="i" begin="0" end="${page.nbArticles-1}">
			<div style="float:left">
				<div id="options_admin">
					<p>
						<span class="options_admin" onclick="supprimerArticle(${page.articles[i].id})">Supprimer l'article</span>  
						<a href="page?modif=1&ajout=&id=${page.articles[i].id}" style="text-decoration:none; color: #6C2466"> <span class="options_admin"> Modifier</span></a>
					</p>
				</div>
				<div id="cote_gauche">
					<div id="infos_univ" class="infos">
						<p class="text_paragraph">
							Auteur : ${page.articles[i].auteur} <br/>
							Promotion : ${page.articles[i].promotionAuteur}
						</p>
					</div>
					<div id="infos_univ_details" class="infos">
						<p>
							<span class="nb_etudiants_partis" style="text-align:center">O� suis-je partis</span>
						</p>
						<p class="text_paragraph">
							Entreprise : ${page.articles[i].entreprise} <br/>
							Site de l'entreprise : <a href="" class="lien_default">${page.articles[i].urlEntreprise}</a> <br/>
							Ville : ${page.articles[i].ville} <br/>
							Pays : <img src="images/pays/canada.png"> ${page.articles[i].pays} <br/>
							Langue : ${page.articles[i].langue} <br/>
						</p>
					</div>
				</div>
				<div id="corps">
					<p class="titre_section">${page.articles[i].titre}</p>
					<p>
						<span class="nb_etudiants_partis">Ma première impression : </span>
					</p>
					<p>
						${page.articles[i].premiereImpression}
					</p>
					<p>
						<span class="nb_etudiants_partis">Comment était l'entreprise ? </span>
					</p>
					<p>
						${page.articles[i].commentImpression}
					</p>
					<p>
						<span class="nb_etudiants_partis">Et la ville ? </span>
					</p>
					<p>
						${page.articles[i].villeImpression}
					</p>
					<p>
						<span class="nb_etudiants_partis">Un conseil ?</span>
					</p>
					<p>
						${page.articles[i].conseil}
					</p>
					<p>
						<span class="nb_etudiants_partis">Mes notes : </span>
					</p>
					<p>note ville : ${page.articles[i].noteVille}
					</p>
					<p>
						L'entreprise :<c:set var="cpt" value="0" scope="request"/>
										<c:if test="${page.articles[i].noteEntreprise > 1}">
											<c:forEach var="i" begin="0" end="${page.articles[i].noteEntreprise-1}">	
												<c:set var="cpt" value="${cpt+1}"/>
												<img src="images/etoileNotation.jpg" width="25px" height="25px">
											</c:forEach>
										</c:if>
										<c:if test="${cpt < 5}">
											<c:forEach var="i" begin="0" end="${5-cpt-1}">
												<img src="images/etoileVide.png" width="25px" height="25px"/>
											</c:forEach>
										</c:if>
										<span style="color: #6C2466">${page.articles[i].noteEntreprise}/5</span> 
						 <br/>
						La ville : <c:set var="cpt" value="0" scope="request"/>
									<c:if test="${page.articles[i].noteVille > 1}">
										<c:forEach var="i" begin="0" end="${page.articles[i].noteVille-1}">	
											<c:set var="cpt" value="${cpt+1}"/>
											<img src="images/etoileNotation.jpg" width="25px" height="25px">
										</c:forEach>
									</c:if>
									<c:if test="${cpt < 5}">
										<c:forEach var="i" begin="0" end="${5-cpt-1}">
											<img src="images/etoileVide.png" width="25px" height="25px"/>
										</c:forEach>
									</c:if>
									<span style="color: #6C2466">note : ${page.articles[i].noteVille} /5</span> 
						<br/>
					</p>
					<c:if test="${page.articles[i].nbLiens > 0}">
						<p>
							<span class="nb_etudiants_partis">Les liens qui m'ont aidé : </span>
						</p>
						<p>
							<c:forEach var="j" begin="0" end="${page.articles[i].nbLiens-1}">
								${page.articles[i].liensIntitules[j]} : <a href="${page.articles[i].liens[j]}" class="lien_default">${page.articles[i].liens[j]}</a>
							</c:forEach>
						</p>
					</c:if>
						<p>
							<span class="nb_etudiants_partis">Vos commentaires : </span>
						</p>
					<form>
						<c:if test="${page.articles[i].nbCommentaires > 0}">
							<c:forEach var="j" begin="0" end="${page.articles[i].nbCommentaires}">
								<p class="commentaire">${page.articles[i].commentaires[j]}</p>
							</c:forEach>
						</c:if>
						<p>Ajouter un commentaire : <br/>
							<textarea id="comArea" name="com" cols="50" rows="10"></textarea>
						</p>
						<input type="submit" id="comSubmit" class="" value="Envoyer"/>
					</form>
				</div>
			</div>
			<p><hr class="separateur" style="margin:50px; width:90%; float:left"/></p>
		</c:forEach>
	</c:if>

	
	
	<div style="float:left">
		<div align="center">
			<p>
				<span class="options_admin">Supprimer l'article</span>  
				<a href="" style="text-decoration:none; color: #6C2466"> <span class="options_admin"> Modifier</span></a>
			</p>
		</div><p><hr class="separateur" style="margin:50px; width:90%; float:left"/></p>
		<div id="cote_gauche">
			<div id="infos_univ" class="infos">
				<p class="text_paragraph">
					Auteur : Paul Cottin <br/>
					Promotion : 2016
				</p>
			</div>
			<div id="infos_univ_details" class="infos">
				<p>
					<span class="nb_etudiants_partis" style="text-align:center">Où suis-je partis</span>
				</p>
				<p class="text_paragraph">
					Entreprise : Dassault Aviation <br/>
					Site de l'entreprise : <a href="" class="lien_default">dassault.com</a> <br/>
					Ville : Moscou <br/>
					Pays : <img src="images/pays/canada.png"> Russie <br/>
					Langue : Anglais <br/>
				</p>
			</div>
		</div>
		<div id="corps">
			<p class="titre_section">Else : Mon (2eme) stage chez Dassault Aviation</p>
			<p>
				<span class="nb_etudiants_partis">Ma première impression : </span>
			</p>
			<p>
				Mon voyage s'est déroulé super bien, c'est vraiment une entreprise formidable
			</p>
			<p>
				<span class="nb_etudiants_partis">Comment était l'entreprise ? </span>
			</p>
			<p>
				Clairement, un vrai bonheur, je repars bosser là-bas dès que je peux !
			</p>
			<p>
				<span class="nb_etudiants_partis">Et la ville ? </span>
			</p>
			<p>
				Moscou ? Mais c'était juste génial, le Kremlin je recommande vivement, le métro également est une vraie pièce de musée
			</p>
			<p>
				<span class="nb_etudiants_partis">Un conseil ?</span>
			</p>
			<p>
				Vas-y, la Russie c'est génial ! :)
			</p>
			<p>
				<span class="nb_etudiants_partis">Mes notes : </span>
			</p>
			<p>
				L'entreprise : <img src="etoile.png"/> <br/>
				La ville : <img src="etoile.png"/> <img src="etoile.png"/> <img src="etoile.png"/> <img src="etoile.png"/> <img src="etoile.png"/> <br/>
			</p>
			<p>
				<span class="nb_etudiants_partis">Les liens qui m'ont aidé : </span>
			</p>
			<p>
				Pour la bourse erasmus : <a href="" class="lien_default">Lien erasmus</a> <br/>
				Pour les bourses au mérite : <a href="" class="lien_default">Lien bourseMerite</a>
			</p>
			<p>
				<span class="nb_etudiants_partis">Vos commentaires : </span>
			</p>
			<form>
				<p class="commentaire">Mon premier commentaire</p>
				<p class="commentaire">Mon deuxième commentaire</p>
				<p>Ajouter un commentaire : <br/>
					<textarea id="comArea" name="com" cols="50" rows="10"></textarea>
				</p>
				<input type="submit" id="comSubmit" class="" value="Envoyer"/>
			</form>
		</div>
	</div>
	</body>
</html>