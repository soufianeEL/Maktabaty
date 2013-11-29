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
				il y a qlq chose ça va pas<a href="#" class="alert-link">alert
					link</a>
			</div>
			<div class="col-md-5 column">
				<img alt="380x440" data-src="holder.js/380x420/auto"> <br>
				<br>
				<button type="button" href="#update" data-toggle="modal"
					class="btn btn-default">modifier cet ouvrage</button>
				<button type="button" href="#create" data-toggle="modal"
					class="btn btn-default">Ajouter un ouvrage</button>
				<button type="button" class="btn btn-default">Default</button>
			</div>
			<div class="modal fade" id="update" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<s:form cssClass="modal-content" action="" method="post"
						enctype="multipart/form-data">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">Modifier Un Ouvrage</h4>
						</div>
						<div class="modal-body" style="text-align: center;">
							<div class="row">
								<label class="col-sm-3 control-label">Titre :</label>
								<div class="col-sm-6">
									<input type="text" name="nom" class="form-control"
									value="" required>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">ISBN :</label>
								<div class="col-sm-6">
									<input type="text" name="prenom" class="form-control" 
									value="" required>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">Résume :</label>
								<div class="col-sm-6">
									<textarea class="form-control" rows="3" >dfgh</textarea>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">En Stock :</label>
								<div class="col-sm-3">
									<input type="number" class="form-control" value="">
								</div>
								&nbsp;&nbsp;&nbsp; 
								<label class="col-sm-2 control-label">Total:</label>
								<div class="col-sm-3">
									<input type="number" value="" class="form-control">
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">Auteur :</label>
								<div class="col-sm-6">
									<select class="form-control" name="" required>
										<option></option>
										<option>0</option>
										<option>1</option>
									</select>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">Editeur :</label>
								<div class="col-sm-6">
									<select class="form-control" name="" required>
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
			<div class="modal fade" id="create" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<s:form cssClass="modal-content" action="" method="post"
						enctype="multipart/form-data">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">Ajouter Un Ouvrage</h4>
						</div>
						<div class="modal-body" style="text-align: center;">
							<div class="row">
								<label class="col-sm-3 control-label">Titre :</label>
								<div class="col-sm-6">
									<input type="text" name="nom" class="form-control" required>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">ISBN :</label>
								<div class="col-sm-6">
									<input type="text" name="prenom" class="form-control" required>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">Résume :</label>
								<div class="col-sm-6">
									<textarea class="form-control" rows="3"></textarea>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">En Stock :</label>
								<div class="col-sm-3">
									<input type="number" class="form-control">
								</div>
								&nbsp;&nbsp;&nbsp; <label class="col-sm-2 control-label">Total
									:</label>
								<div class="col-sm-3">
									<input type="number" class="form-control">
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">Auteur :</label>
								<div class="col-sm-6">
									<select class="form-control" name="" required>
										<option></option>
										<option>0</option>
										<option>1</option>
									</select>
								</div>
							</div>
							<div class="row">
								<label class="col-sm-3 control-label">Editeur :</label>
								<div class="col-sm-6">
									<select class="form-control" name="" required>
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
			<div class="col-md-7 column">
				<h2 class="text-center">
					<s:property value="book.titre" />
				</h2>
				<br>
				<p>
					<strong>Le Résumé Ici : </strong>
					<s:property value="book.resume" />
					<br> <em>Morbi commodo sodales nisi id metus n.</em><br>
					<small>Aliquam mi erat, aliquam vel luctus eeu.</small>
				</p>
				<br>
				<h4>
					A propos de "
					<s:property value="book.titre" />
					" :
				</h4>
				<dl class="dl-horizontal">
					<dt>ISBN</dt>
					<dd>
						<s:property value="book.isbn" />
					</dd>
					<dt>Prix</dt>
					<dd>
						Pour pour acheter :
						<s:property value="book.prix" />
						DH
					</dd>
					<dd>
						Pour Emprinter :
						<s:property value="book.prix" />
						- 40% DH
					</dd>
					<dt>En Stock</dt>
					<dd>
						<s:property value="book.enStock" />
					</dd>
					<dt>Le Total</dt>
					<dd>
						<s:property value="book.total" />
					</dd>
					<dt>Auteur</dt>
					<dd>
						<s:property value="author.nom" />
					</dd>
					<dt>Editeur</dt>
					<dd>
						<s:property value="publisher.nom" />
					</dd>
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
