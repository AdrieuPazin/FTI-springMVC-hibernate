<%@page import="br.com.fti.model.entities.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Produto</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<%@include file="/resources/util/header.jsp"%>

	<div class="container">
		<%
			Produto p = (Produto) request.getAttribute("produtoCarregado");
			if (p != null) {
		%>

		<h2 class="text-center">Atualizar Produto</h2>
		<form name="formEdtProduto" action="edtProduto?id=<%=p.getId()%>&idCliente=<%=c.getId()%>" method="POST"
			onsubmit="return validarDadosProutos()? true: false">
			<div class="form-group">
				<label>Nome do Produto:</label> <input type="text"
					class="form-control" id="nomeProduto" name="nomeProduto"
					placeholder="Informe o nome do produto"
					value="<%=p.getNomeProduto()%>" required>
			</div>
			<div class="form-group">
				<label>Descrição do Produto</label>
				<textarea rows="5" cols="100" class="form-control"
					id="descricaoProduto" name="descricaoProduto"
					placeholder="Descrição..." required><%=p.getDescricaoProduto()%></textarea>
			</div>
			<div class="form-group">
				<label>Estado do Produto</label>
				<%
					if (p.getEstadoProduto().equals("N")) {
				%>
				<div class="form-check form-check-inline">
					<input class="form-check-input estadoProduto" type="radio"
						name="estadoProduto" value="N" checked> <label
						class="form-check-label" for="inlineRadio1">Novo</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input estadoProduto" type="radio"
						name="estadoProduto" value="U"> <label
						class="form-check-label" for="inlineRadio2">Usado</label>
				</div>


				<%
					} else {
				%>
				<div class="form-check form-check-inline">
					<input class="form-check-input estadoProduto" type="radio"
						name="estadoProduto" value="N"> <label
						class="form-check-label" for="inlineRadio1">Novo</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input estadoProduto" type="radio"
						name="estadoProduto" value="U" checked> <label
						class="form-check-label" for="inlineRadio2">Usado</label>
				</div>
				<%
					}
				%>
			</div>
			<div class="form-group" id="exibeEstado">
				<label>Estado de Conservação:</label>
				<textarea rows="5" cols="100" class="form-control"
					id="estadoConservacaoProduto" name="estadoConservacaoProduto"
					placeholder="Descreva a situação do produto"><%=p.getEstadoConservacaoProduto()%></textarea>
			</div>
			<div class="form-group">
				<label>Valor do Produto:</label> <input type="text"
					class="form-control" id="valorProduto" name="valorProduto"
					placeholder="Informe o valor do produto"
					value="<%=p.getValorProduto()%>" required>
			</div>
			<div class="form-group">
				<label>Foto</label> <input type="text" class="form-control"
					id="fotoProduto" name="fotoProduto"
					placeholder="Selecione sua foto" value="<%=p.getFotoProduto()%>"
					required> 
			</div>
			
			<input class="btn btn-primary" id="btnCad" type="submit"
				value="Atualizar"></input>
		</form>
		<%
			}
		%>


	</div>
	<%@include file="/resources/util/footer.jsp"%>

	<script src="//code.jquery.com/jquery-2.1.4.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
	<script type="text/javascript">
		$(document).load(function() {

			$('#exibeEstado').hide();

			$('.estadoProduto').change(function() {
				console.log($('.estadoProduto').val());
				if ($(this).val() == 'N') {
					$('#exibeEstado').hide();
				} else {
					$('#exibeEstado').show();
					$("#estadoConservacaoProduto").css({
						"border" : "1px solid #F00",
						"padding" : "2px"
					});
					console.log("1");
					validarDadosProutos();
				}
			});

		});
		function validarDadosProutos() {
			console.log("T" + $("#estadoConservacaoProduto").val().trim() + "2"
					+ $('.estadoProduto').val());
			if ($("#estadoConservacaoProduto").val().trim() == ""
					&& $('.estadoProduto').val() == "U") {
				$("#estadoConservacaoProduto").css({
					"border" : "1px solid #F00",
					"padding" : "2px"
				});
				formCadProduto.estadoConservacaoProduto.focus();
				console.log("3");
				return false;
			} else {
				console.log("4");
				return true;
			}

		}
	</script>
</body>
</html>