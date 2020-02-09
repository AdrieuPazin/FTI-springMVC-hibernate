<%@page import="br.com.fti.model.entities.Cliente"%>
<%

	Cliente c = (Cliente) session.getAttribute("usuarioLogado");
	if(c == null){
		response.sendRedirect("Login");
	}

%>