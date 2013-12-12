<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'showAuthorPage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link type="text/css" href="/webapp_test/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

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
			<a href="/webapp_test/logins/ShowLoginPage.action"
				class="navbar-brand">Maktabati</a>
		</div>
		<nav class="collapse navbar-collapse bs-navbar-collapse"
			role="navigation">
		<ul class="nav navbar-nav">
			<li><a href="">Acceuil</a></li>
			<li class="active"><a href="/webapp_test/authorPage.jsp">Auteurs</a></li>
			<li><a
				href="/webapp_test/pages/ShowUserPage.action">Utilisateur</a></li>
			<li><a href="/webapp_test/book/View.action">Ouvrage</a></li>
			<li><a href="">se connecter</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="">A propos</a></li>
		</ul>
		</nav>
	</div>
	</header>
	<div class="container">
		<hr class="featurette-divider">
		<div class="row clearfix">
			<div class="col-md-4 column">
				<img alt="240x240" data-src="holder.js/240x240/auto"
					class="img-thumbnail">
				<button type="button" class="btn btn-primary btn-block">des
					boutton ici</button>
			</div>
			<div class="col-md-8 column">
				<h3 class="text-center">h3. le nom de l'auteur</h3>
				<p>
					ici c la biographie . <br>Lorem ipsum dolor sit amet, <strong>consectetur
						adipiscing elit</strong>. Aliquam eget sapien sapien. Curabitur in metus
					urna. In hac habitasse platea dictumst. Phasellus eu sem sapien,
					sed vestibulum velit. Nam purus nibh, lacinia non faucibus et,
					pharetra in dolor. Sed iaculis posuere diam ut cursus. <em>Morbi
						commodo sodales nisi id sodales. Proin consectetur, nisi id
						commodo imperdiet, metus nunc consequat lectus, id bibendum diam
						velit et dui.</em> Proin massa magna, vulputate nec bibendum nec,
					posuere nec lacus. <small>Aliquam mi erat, aliquam vel
						luctus eu, pharetra quis elit. Nulla euismod ultrices massa, et
						feugiat ipsum consequat eu.</small>
				</p>
				<blockquote>
					<p>
						<strong>c une citation de l'auteur ...</strong>Lorem ipsum dolor
						sit amet, consectetur adipiscing elit. Integer posuere.
					</p>
					<small>Someone famous <cite>Source Title</cite></small>
				</blockquote>
			</div>
		</div>
		<hr class="featurette-divider">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="media">
					<a href="#" class="pull-left"><img
						data-src="holder.js/64x64/auto" class="media-object" alt=""></a>
					<div class="media-body">
						<h4 class="media-heading">son ouvre X</h4>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum
						in vulputate at, tempus viverra turpis.
					</div>
				</div>
				<div class="media">
					<a href="#" class="pull-left"><img
						data-src="holder.js/64x64/auto" class="media-object" alt=""></a>
					<div class="media-body">
						<h4 class="media-heading">son ouvre y</h4>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum
						in vulputate at, tempus viverra turpis.
					</div>
				</div>
				<div class="media">
					<a href="#" class="pull-left"><img
						data-src="holder.js/64x64/auto" class="media-object" alt=""></a>
					<div class="media-body">
						<h4 class="media-heading">son ouvre z</h4>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum
						in vulputate at, tempus viverra turpis.
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="/webapp_test/dist/js/bootstrap.min.js"></script>
	<script src="/webapp_test/docs-assets/js/holder.js"></script>
</body>
</html>
