<%@include file="sessionValidation.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/resources/css/bootstrap.min.css" var="BoostrapCSS" />
<spring:url value="/resources/css/header.css" var="HeaderCSS" />
<spring:url value="/resources/js/bootstrap.min.js" var="BootstrapJS" />
<spring:url value="/resources/js/popper.min.js" var="PopperJS" />
<spring:url value="/resources/js/jquery.slim.min.js" var="JqueryJS" />
<spring:url value="/resources/css/footer.css" var="FooterCSS" />

<link href="${FooterCSS}" rel="stylesheet" />
<link href="${BoostrapCSS}" rel="stylesheet" />
<link href="${HeaderCSS}" rel="stylesheet" />
<script src="${BootstrapJS}" type="text/javascript"></script>
<script src="${PopperJS}" type="text/javascript"></script>
<script src="${JqueryJS}" type="text/javascript"></script>


<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
	<a class="navbar-brand" href="home">Logo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="home">INÍCIO
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> CADASTROS </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="formCliente">Clientes</a> 
					<a class="dropdown-item" href="formProduto">Produtos</a>

				</div></li>
			<li class="nav-item"><a class="nav-link" href="logout">Sair</a>
			</li>			
		</ul>
	</div>
	<div class="float-right">
		<span class="navbar-text">
<%--      			 Bem vindo, <%=session.getAttribute("email") %> --%>
    	</span>
	
	</div>
	
</nav>