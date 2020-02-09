<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Cliente</title>

<spring:url value="/resources/js/bootstrap.min.js" var="BootstrapJS" />
<spring:url value="/resources/js/popper.min.js" var="PopperJS" />
<spring:url value="/resources/js/jquery.slim.min.js" var="JqueryJS" />
<spring:url value="/resources/css/bootstrap.min.css" var="BoostrapCSS" />
<spring:url value="/resources/css/footer.css" var="FooterCSS" />

<link href="${BoostrapCSS}" rel="stylesheet" />
<link href="${FooterCSS}" rel="stylesheet" />

</head>
<body>
<%@include file="/resources/util/header.jsp" %>

 <div class="container">

	<h2 class="text-center">Cadastrar Cliente</h2>
	<form name="formCadCliente"action="addCliente" method="POST" onsubmit="return validarDadosCliente()? true: false">				
				  <div class="form-group">
				    <label >Nome:</label>
				    <input type="text" class="form-control" id="nomeCliente" name = "nomeCliente" placeholder="Informe seu nome" required >
				  </div>
				  <div class="form-group">
				    <label >CPF</label>
				    <input type="text" class="form-control" id="cpfCliente" name="cpfCliente" placeholder="Informe seu CPF" required>
				  </div>
				  <div class="form-group">
				    <label >Data de Nascimento:</label>
				    <input type="text" class="form-control" id="dataNascCliente" name="dataNascCliente" required>
				  </div>
				  <div class="form-group">
				    <label >Endereço:</label>
				    <input type="text" class="form-control" id="enderecoCliente" name="enderecoCliente" placeholder="Informe seu endereço" required>
				  </div>
				  <div class="form-group">
				    	<label >Sexo:</label>
					    <div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="sexoCliente" id="sexoCliente" value="M" checked>
						  <label class="form-check-label" for="inlineRadio1">Masculino</label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="sexoCliente" id="sexoCliente" value="N">
						  <label class="form-check-label" for="inlineRadio2">Feminino</label>
						</div>
				 </div>
				  <div class="form-group">
				    <label >Telefone:</label>
				    <input type="text" class="form-control" id="telefoneCliente" name="telefoneCliente" placeholder="Informe seu telefone" required>
				  </div>
				  <div class="form-group">
				    <label >E-mail:</label>
				    <input type="email" class="form-control" id="emailCliente" name="emailCliente" placeholder="Informe seu e-mail" required>
				  </div>
				  <div class="form-group">
				    <label >Senha:</label>
				    <input type="password" class="form-control" id="senhaCliente" name="senhaCliente" placeholder="Entre com sua senha" required>
				  </div>
				   <div class="form-group">
				    <label >Senha:</label>
				    <input type="password" class="form-control" id="senhaCliente2" name="senhaCliente2" placeholder="Repita sua senha" required>
				  </div>
				  
				  <div class="msg alert alert-warning alert-dismissible fade show" role="alert">  
		 				Verifique as suas senhas! Elas precisam ser iguais!
					<button type="button" class="close" data-dismiss="alert" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				  <input type="submit" onclick="validarDadosCliente()" class="btn btn-primary" id="btnCadastrar" value="Cadastrar"></input>
				  
				  
		</form>
</div>

<%@include file="/resources/util/footer.jsp" %>

<script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('#dataNascCliente').mask('99/99/9999');

    $('#cpfCliente').mask('999.999.999-99');

    $('#telefoneCliente').mask('(99) 9999-9999');
    
	$(".msg").hide();
		
});

function validarDadosCliente(){
	
	var senha1 = $("#senhaCliente").val();
	var senha2 = $("#senhaCliente2").val();
	console.log("entrou na função");
	if(senha1 == senha2 && senha1 != ""){
		return true;
	}else {
		$(".msg").show();
		$(".close").click(function(){
			$(".msg").hide();
		});
		return false;
		
	}
}

</script>

</body>
</html>