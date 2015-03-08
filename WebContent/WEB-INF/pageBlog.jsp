<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>TN International</title>
<link href='<%=request.getContextPath() %>/CSS/style.css' rel='stylesheet' type='text/css' />
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
							<span class="nb_etudiants_partis" style="text-align:center">Où suis-je partis</span>
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
					<c:set var="n_ville" value="${page.articles[i].noteVille}"></c:set>
					<c:set var="n_entreprise" value="${page.articles[i].noteEntreprise}"></c:set>
					<c:set var="nb_com" value="${page.articles[i].nbCommentaires}"></c:set>
					<c:set var="nb_liens" value="${page.articles[i].nbLiens}"></c:set>
					<c:set var="art" value="${page.articles[i]}"></c:set>
					<p>
						L'entreprise :<c:set var="cpt" value="0" scope="request"></c:set>
										<c:if test="${n_entreprise > 1}">
											<c:forEach var="i" begin="0" end="${n_entreprise-1}">	
												<c:set var="cpt" value="${cpt+1}"></c:set>
												<img src="<%=request.getContextPath() %>/images/etoileNotation.jpg" width="25px" height="25px">
											</c:forEach>
										</c:if>
										<c:if test="${cpt < 5}">
											<c:forEach var="i" begin="0" end="${5-cpt-1}">
												<img src="<%=request.getContextPath() %>/images/etoileVide.png" width="25px" height="25px"/>
											</c:forEach>
										</c:if>
										<span style="color: #6C2466">${n_entreprise}/5</span> 
						 <br/>
						La ville : <c:set var="cpt2" value="0" scope="request"></c:set>
									<c:if test="${n_ville > 1}">
										<c:forEach var="i" begin="0" end="${n_ville-1}">	
											<c:set var="cpt2" value="${cpt2+1}"></c:set>
											<img src="<%=request.getContextPath() %>/images/etoileNotation.jpg" width="25px" height="25px">
										</c:forEach>
									</c:if>
									<c:if test="${cpt2 < 5}">
										<c:forEach var="i" begin="0" end="${5-cpt2-1}">
											<img src="<%=request.getContextPath() %>/images/etoileVide.png" width="25px" height="25px"/>
										</c:forEach>
									</c:if>
									<span style="color: #6C2466">${n_ville} /5</span> 
						<br/>
					</p>
					<c:if test="${nb_liens > 0}">
						<p>
							<span class="nb_etudiants_partis">Les liens qui m'ont aidé : </span>
						</p>
						<p>
							<c:forEach var="j" begin="0" end="${nb_liens-1}">
								${art.liensIntitule[j]} : <a href="${art.liens[j]}" class="lien_default">${art.liens[j]}</a> <br/>
							</c:forEach>
						</p>
					</c:if>
						<p>
							<span class="nb_etudiants_partis">Vos commentaires : </span>
						</p>
					<form action="page" method="post">
						<c:if test="${nb_com > 0}">
							<c:forEach var="j" begin="0" end="${nb_com-1}">
								<p class="commentaire">${art.commentaires[j]}</p>
							</c:forEach>
						</c:if>
						<p>Ajouter un commentaire : <br/>
							<textarea id="comArea" name="com" cols="50" rows="10"></textarea>
						</p>
						<input type="submit" id="comSubmit" class="ok_button" value="Envoyer"/>
						<input type="hidden" name="id" value="${art.id}"/>
					</form>
				</div>
			</div>
			<p><hr class="separateur" style="margin:50px; width:90%; float:left"/></p>
		</c:forEach>
	</c:if>
	<c:if test="${page.nbArticles == 0}">
		<p>Aucun article n'est présent dans cette catégorie</p>
		<a href="<%=request.getContextPath() %>/accueil" class="lien_default">Revenir à l'accueil</a>
	</c:if>
	</body>
</html>