<%@page import="java.util.List"%>
<%@page import="br.com.fti.model.entities.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Início</title>
</head>
<body>
<%@include file="/resources/util/header.jsp" %>

<div class="container text-center">
		<h1>Lista de Produtos</h1>
	
			<table class="table table-striped table-hover">
				<thead class="thead-dark">
					<tr>
						<th scope="col"></th>
						<th scope="col">Nome do Produto</th>
						<th scope="col">Descrição do Produto</th>
						<th scope="col">Estado do Produto</th>
						<th scope="col">Estado de Conservação</th>
						<th scope="col">Valor</th>
						<th scope="col">Foto</th>
						<th scope="col">Inserido Por</th>
						<th scope="col"></th>
						<th scope="col"> 
								<a href="formProduto" class="btn btn-primary " role="button" aria-pressed="true">Inserir Produto</a>
						</th>
					</tr>
				</thead>
				<tbody>
		<%
			int i = 1;
			List<Produto> list = (List<Produto>) request.getAttribute("listProduto");
		 	for(Produto p: list){
		%>		
				
				<tr>
					<td>					
						<%=i %>
					</td>
					<td>
						<%=p.getNomeProduto()%>
					</td>
					<td>
						<%=p.getDescricaoProduto()%>
					</td>
					<td>
						<%=p.getEstadoProduto()%>
					</td>
					<td>
						<%=p.getEstadoConservacaoProduto()%>
					</td>
					<td>
						<%=p.getValorProduto()%>
					</td>
					<td>
						<%=p.getFotoProduto()%>
					</td>
					<td>
						<%=p.getCliente().getNomeCliente()%>
					</td>
					<td>
						<a href="carregaProdutoEdt?id=<%=p.getId()%>" class="btn btn-warning " role="button" aria-pressed="true">Editar</a>
					</td>
					<td>
						<a href="javascript:delProduto(<%=p.getId()%>)" class="btn btn-danger " role="button" aria-pressed="true">Excluir</a>
					</td>
				</tr>
			<%
					i++;
		 		}
			%>
				</tbody>
		</table>
	</div>

<%@include file="/resources/util/footer.jsp" %>

<script type="text/javascript">
function delProduto(codigo) {  
    if (confirm('Deseja realmente excluir este registro?')) {  
        location.href = 'delProduto?id=' + codigo;
    }
}


</script>

</body>
</html>