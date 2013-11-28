<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <title>loginPage.html</title>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
   
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
    <link rel="shortcut icon" type="text/css" href="/webapp_test/docs-assets/ico/favicon.png">
    <!-- Bootstrap core CSS -->
    <link type="text/css" href="/webapp_test/dist/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link type="text/css" href="/webapp_test/dist/signin.css" rel="stylesheet">

  </head>
  
  <body>
    <div class="container">
	  
	  <s:actionerror/>
	  <s:form cssClass="form-signin" action="/securens/authentificateUser.action">
	  	<h2 class="form-signin-heading">Please sign in</h2>
	  	<s:textfield cssClass="form-control" placeholder="Email address" name="userName" />
	  	<s:password cssClass="form-control" placeholder="Password" name="password" />
	  	<s:submit value="Sign in" cssClass="btn btn-lg btn-primary btn-block"/>
	  	
	  </s:form>
      <!--  form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="userName" placeholder="Email address" required autofocus>
        <input type="password" class="form-control" name="password" placeholder="Password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form -->

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
