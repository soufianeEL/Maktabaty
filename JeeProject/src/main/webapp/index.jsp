<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
				<a href="../" class="navbar-brand">Maktabati</a>
			</div>
			<nav class="collapse navbar-collapse bs-navbar-collapse"
				role="navigation">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Acceuil</a></li>
					<li><a href="#">Auteurs</a></li>
					<li><a href="#">Components</a></li>
					<li><a href="#">Recherche Avancé</a></li>
					<li><a href="#">se connecter</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="../about">A propos</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<div class="container">

		<div class="starter-template">
			<h1>Bootstrap starter template</h1>
			<p class="lead">
				Use this document as a way to quickly start any new project.<br>
				All you get is this text and a mostly barebones HTML document.
			</p>
			
			<br>
			
			<img class="img-thumbnail" alt="140x140" style="width: 250px; height: 340px;" src="/webapp_test/dist/image.png">
			<img class="img-thumbnail" alt="140x140" style="width: 250px; height: 340px;" src="/webapp_test/dist/image.png">
			<img class="img-thumbnail" alt="140x140" style="width: 250px; height: 340px;" src="/webapp_test/dist/image.png">
			
		</div>

	</div>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/webapp_test/dist/js/jquery-1.10.2.min.js"></script>
	<script src="/webapp_test/dist/js/bootstrap.min.js"></script>
</body>
</html>