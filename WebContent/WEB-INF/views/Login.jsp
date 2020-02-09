<%@page import="javax.script.ScriptEngineManager"%>
<%@ page language="java" contentType="text/html charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<spring:url value="/resources/css/bootstrap.min.css" var="BoostrapCSS" />
<spring:url value="/resources/css/estiloLogin.css" var="EstiloLoginCSS" />
<spring:url value="/resources/css/footer.css" var="FooterCSS" />


<link href="${BoostrapCSS}" rel="stylesheet" />
<link href="${EstiloLoginCSS}" rel="stylesheet" />
<link href="${FooterCSS}" rel="stylesheet" />




</head>
<body>

	<div class="container text-center">

		<form action="verificaLogin" method="post" class="frmLogin">
			<img class="mb-4"
				src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg"
				alt="" width="72" height="72">
			<h1 class="h3 mb-3 font-weight-normal">Bem Vindo</h1>

			<input type="email" id="emailCliente" class="form-control"
				placeholder="E-mail" name="emailCliente" required autofocus>

			<input type="password" id="senhaCliente" class="form-control"
				placeholder="Senha" name="senhaCliente" required>
			<div class="checkbox mb-3">
				<label> <a href="formClienteNovo">Não tem cadastro?
						Clique aqui</a>
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2020</p>
		

			<div class="msg alert alert-warning alert-dismissible fade show"
				role="alert">
				Login inválido! Por favor, verifique sua senha e e-mail. 
				<button type="button" class="close" data-dismiss="alert" aria-label="Close">
					<span aria-hidden="true">&times;</span>					
				</button>
			</div>
		<span id="erro" hidden>${erroLogin}</span>
	
		</form>

	</div>

	<%@include file="/resources/util/footer.jsp"%>

<script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {

		
		$(".msg").hide();
		
		if($("#erro").text() == "erro"){
			$(".msg").show();
			$(".close").click(function(){
				$(".msg").hide();
			});
		} else{
			$(".msg").hide();			
		}
	

});


</script>
	
	
</body>
</html>