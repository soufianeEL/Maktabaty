<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE html>
<html lang="en">
<head>
<title>Accueil</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">


<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
<link rel="shortcut icon" type="text/css"
	href="/webapp_test/docs-assets/ico/favicon.png">
<!-- Bootstrap core CSS -->

<link type="text/css" href="/webapp_test/dist/css/bootstrap.min.css"
	rel="stylesheet">
	
<link type="text/css" href="/webapp_test/dist/css/docs.css"
	rel="stylesheet">


</head>

<body>
<body>
	<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav"
		role="banner">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target=".bs-navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="/webapp_test/logins/ShowLoginPage.action" class="navbar-brand active">Maktabati</a>
			</div>
			<nav class="collapse navbar-collapse bs-navbar-collapse"
				role="navigation">
				<ul class="nav navbar-nav">
					<li class=""><a href="">Acceuil</a></li>
					<li><a href="#">Auteur</a></li>
					<li><a href="#">Utilisateur</a></li>
					<li><a href="#">Ouvrage</a></li>
					<li><a href="#">se connecter</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">A propos</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<main class="bs-masthead" id="content" role="main">


	<div class="container">

		<h1>Maktabati</h1>
		<p class="lead">Application JEE de gestion d'une Bibliothèque</p>
		<h2>Avec l'integration des framwork : Hibernate - Spring - Struts </h2>
		<h3>Projet Encadré par Mr: Touil</h3>
		<p>
			<a href="/webapp_test/book/ViewAll.action" class="btn btn-outline-inverse btn-lg"">Voir
				L'application</a> <a href="https://github.com/soufianeEL/Maktabaty"
				class="btn btn-outline-inverse btn-lg">code source de l'app</a>
		</p>

	</div>

	</main>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/webapp_test/dist/js/jquery-1.10.2.min.js"></script>
	<script src="/webapp_test/dist/js/bootstrap.min.js"></script>
</body>
</html>