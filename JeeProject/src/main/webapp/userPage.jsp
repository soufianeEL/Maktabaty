<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

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

<title>My JSP 'showUserPage.jsp' starting page</title>

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
			<li><a href="/webapp_test/authorPage.jsp">Auteurs</a></li>
			<li class="active"><a
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
		<div class="alert alert-dismissable alert-info">
			<button type="button" class="close" data-dismiss="alert"
				aria-hidden="true">×</button>
			ici une notification <a href="#" class="alert-link">alert link</a>
		</div>

		<div class="row clearfix">
			<div class="col-md-8 column">
				<h3 class="text-center">Vos informations !!</h3>
				<dl>
					<dt>Nom :</dt>
					<dd>
						<s:property value="user.nom" />
					</dd>
					<dt>Prénom :</dt>
					<dd>
						<s:property value="user.prenom" />
					</dd>
					<dt>Age :</dt>
					<dd>
						<s:property value="user.age" />
					</dd>
					<dt>Email :</dt>
					<dd>
						<s:property value="user.email" />
					</dd>
					<dt>Profession :</dt>
					<dd>
						<s:property value="user.profession" />
					</dd>
					<dt>Crédit :</dt>
					<dd>
						<s:property value="user.credit" />
					</dd>
					<dt>Date d'inscription :</dt>
					<dd>
						<s:property value="user.dateInscription" />
					</dd>
				</dl>
			</div>
			<div class="col-md-4 column">
				<img alt="240x240" data-src="holder.js/240x240/auto"
					class="img-thumbnail"> <a id="modal-287614"
					href="#modal-container-287614" role="button" class="btn"
					data-toggle="modal">Modifier Image</a><br>

				<div class="modal fade" id="modal-container-287614" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<s:form cssClass="modal-content" action="" method="post"
							enctype="multipart/form-data">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">image et luplode
									ici</h4>
							</div>
							<div class="modal-body">


								<label for="exampleInputFile">File input</label> <input
									type="file" name="upload" id="exampleInputFile">
								<p class="help-block">Max 1 Mb AND Taille 64x64 !!</p>

							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
								<button type="submit" class="btn btn-primary">Save
									changes</button>
							</div>
						</s:form>

					</div>

				</div>

				<a id="modal-449056" href="#modal-container-449056" role="button"
					class="btn" data-toggle="modal">modifier profil</a><br>

				<div class="modal fade" id="modal-container-449056" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<s:form cssClass="modal-content"
							action="/cruds/User_update.action" method="update">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">le profil ici</h4>
							</div>
							<div class="modal-body">

								<div class="row">
									<label class="col-sm-3 control-label">Nom :</label>
									<div class="col-sm-6">
										<input type="text" name="nom" class="form-control"
											value="<s:property value="user.nom" />" required>
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">Prénom :</label>
									<div class="col-sm-6">
										<input type="text" name="prenom" class="form-control"
											value="<s:property value="user.prenom" />">
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">Age :</label>
									<div class="col-sm-6">
										<input type="number" name="age" class="form-control"
											value="<s:property value="user.age" />">
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">Email :</label>
									<div class="col-sm-6">
										<input type="email" name="email" class="form-control"
											value="<s:property value="user.email" />" required>
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">profession :</label>
									<div class="col-sm-6">
										<input type="text" name="profession" class="form-control"
											value="<s:property value="user.profession" />">
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">statut :</label>
									<div class="col-sm-6">
										<select class="form-control" name="statut"
											value="<s:property value="user.statut" />" required>
											<option></option>
											<option>0</option>
											<option>1</option>
										</select>
									</div>
								</div>

							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
								<button type="submit" class="btn btn-primary">Save
									changes</button>
							</div>
						</s:form>

					</div>

				</div>

				<a id="modal-53920" href="#modal-container-53920" role="button"
					class="btn" data-toggle="modal">Ajouter un utilisateur</a><br>

				<div class="modal fade" id="modal-container-53920" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<s:form cssClass="modal-content"
							action="/cruds/User_create.action" method="POST">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">info ici</h4>
							</div>
							<div class="modal-body">

								<div class="row">
									<label class="col-sm-3 control-label">Nom :</label>
									<div class="col-sm-6">
										<input type="text" name="nom" class="form-control" required>
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">Prénom :</label>
									<div class="col-sm-6">
										<input type="text" name="prenom" class="form-control">
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">Age :</label>
									<div class="col-sm-6">
										<input type="number" name="age" class="form-control">
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">Email :</label>
									<div class="col-sm-6">
										<input type="email" name="email" class="form-control" required>
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">profession :</label>
									<div class="col-sm-6">
										<input type="text" name="profession" class="form-control">
									</div>
								</div>
								<div class="row">
									<label class="col-sm-3 control-label">statut :</label>
									<div class="col-sm-6">
										<select class="form-control" name="statut" required>
											<option></option>
											<option>0</option>
											<option>1</option>
										</select>
									</div>
								</div>

							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
								<button type="submit" class="btn btn-primary">Save
									changes</button>
							</div>
						</s:form>

					</div>

				</div>

			</div>
		</div>
		<hr class="featurette-divider">
		<div class="row clearfix">
			<div class="col-md-4 column">
				<h2>Heading</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn" href="#">View details »</a>
				</p>
			</div>
			<div class="col-md-4 column">
				<h2>Heading</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn" href="#">View details »</a>
				</p>
			</div>
			<div class="col-md-4 column">
				<h2>Heading</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn" href="#">View details »</a>
				</p>
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
