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

<title>My JSP 'showBookPage.jsp' starting page</title>

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
			<div class="col-md-5 column">
				<img alt="380x440" data-src="holder.js/380x420/auto"> <br>
				<br>
				<button type="button" class="btn btn-default">Default</button>
				<button type="button" class="btn btn-default">Default</button>
				<button type="button" class="btn btn-default">Default</button>
			</div>
			<div class="col-md-7 column">
				<h3 class="text-center">h3. le titre de l'ouvrage</h3>
				<p>
					<strong>Résumé ici</strong> Lorem ipsum dolor sit amet. Aliquam
					eget sapien sapien. Curabitur in metus urna. In hac habitasse
					platea dictumst. Phasellus eu sem sapien, sed vestibulum velit. Nam
					purus nibh, lacinia non faucibus et, pharetra in dolor. Sed iaculis
					posuere diam ut cursus. <em>Morbi commodo sodales nisi id
						sodales. Proin consectetur, nisi id commodo imperdiet, metus nunc
						consequat lectus, id bibendum diam velit et dui.</em> Proin massa
					magna, vulputate nec bibendum nec, posuere nec lacus. <small>Aliquam
						mi erat, aliquam vel luctus eu, pharetra quis elit. Nulla euismod
						ultrices massa, et feugiat ipsum consequat eu.</small>
				</p>
				<br>
				<h4>les info qui existe dans la bdd :</h4>
				<dl class="dl-horizontal">
					<dt>Descriptions</dt>
					<dd>A description list is perfect for defining terms.</dd>
					<dt>Euismod</dt>
					<dd>Vestibulum id ligula porta felis euismod semper eget
						lacinia odio sem nec elit.</dd>
					<dd>Donec id elit non mi porta gravida at eget metus.</dd>
					<dt>Malesuada porta</dt>
					<dd>Etiam porta sem malesuada magna mollis euismod.</dd>
					<dt>Felis euismod semper eget lacinia</dt>
					<dd>Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</dd>
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
