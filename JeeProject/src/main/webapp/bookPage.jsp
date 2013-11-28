<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>My JSP 'bookPage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- Bootstrap core CSS -->
<link type="text/css" href="/webapp_test/dist/css/bootstrap.min.css"
	rel="stylesheet">


</head>

<body>
	<hr class="featurette-divider">
	<div class="container">
		<div class="row clearfix">
			<div class="alert alert-success alert-dismissable">
				<button type="button" class="close" data-dismiss="alert"
					aria-hidden="true">×</button>
				il y a qlq chose ça va pas<a href="#" class="alert-link">alert link</a>
			</div>
			<div class="col-md-5 column">
				<img alt="380x440" data-src="holder.js/380x420/auto"> <br>
				<br>
				<button type="button" class="btn btn-default">Default</button>
				<button type="button" class="btn btn-default">Default</button>
				<button type="button" class="btn btn-default">Default</button>
			</div>
			<div class="col-md-7 column">
				<h2 class="text-center">
					<s:property value="book.titre" />
				</h2><br>
				<p>
					<strong>Le Résumé Ici : </strong>
					<s:property value="book.resume" /><br>
					<em>Morbi commodo sodales nisi id metus n.</em><br>
					<small>Aliquam mi erat, aliquam vel luctus eeu.</small>
				</p>
				<br>
				<h4>A propos de "<s:property value="book.titre" />" :</h4>
				<dl class="dl-horizontal">
					<dt>ISBN</dt>
					<dd><s:property value="book.isbn" /></dd>
					<dt>Prix</dt>
					<dd>Pour pour acheter : <s:property value="book.prix" /> DH</dd>
					<dd>Pour Emprinter : <s:property value="book.prix" />- 40% DH</dd>
					<dt>En Stock</dt>
					<dd><s:property value="book.enStock" /></dd>
					<dt>Le Total</dt>
					<dd><s:property value="book.total" /></dd>
					<dt>Auteur</dt>
					<dd><s:property value="author.nom" /></dd>
					<dt>Editeur</dt>
					<dd><s:property value="publisher.nom" /></dd>
				</dl>
			</div>
		</div>
		<hr class="featurette-divider">
		<h4>si l'utilisateur n'est connecter .. sinon on affiche une from
			pour ecrire un comm et voter.. :</h4>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form role="form" class="form-inline">
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label><input
							type="email" class="form-control" id="exampleInputEmail1">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label><input
							type="password" class="form-control" id="exampleInputPassword1">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
				<h4>donc ici les comm et les vote des autre :</h4>
				<div class="media well">
					<a href="#" class="pull-left"><img
						data-src="holder.js/70x70/auto" class="media-object" alt=""></a>
					<div class="media-body">
						<h4 class="media-heading">Nested media heading</h4>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum
						in vulputate at, tempus viverra turpis.
						<div class="media">
							<a href="#" class="pull-left"><img
								data-src="holder.js/64x64/auto" class="media-object" alt=""></a>
							<div class="media-body">
								<h4 class="media-heading">Nested media heading</h4>
								Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
								scelerisque ante sollicitudin commodo. Cras purus odio,
								vestibulum in vulputate at, tempus viverra turpis.
							</div>
						</div>
					</div>
				</div>
				<div class="media well">
					<a href="#" class="pull-left"><img
						data-src="holder.js/70x70/auto" class="media-object" alt=""></a>
					<div class="media-body">
						<h4 class="media-heading">Nested media heading</h4>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum
						in vulputate at, tempus viverra turpis.
						<div class="media">
							<a href="#" class="pull-left"><img
								data-src="holder.js/64x64/auto" class="media-object" alt=""></a>
							<div class="media-body">
								<h4 class="media-heading">Nested media heading</h4>
								Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
								scelerisque ante sollicitudin commodo. Cras purus odio,
								vestibulum in vulputate at, tempus viverra turpis.
							</div>
						</div>
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
