package br.com.fti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fti.model.dao.ClienteDAO;
import br.com.fti.model.entities.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping("/")
    public String index(){
        return "Login";
    }
	@RequestMapping("home")
    public String inicio(Model model){
		return "redirect:carregaProdutos";
    }
	
	@RequestMapping("logout")
    public String sair(HttpSession session){
		session.invalidate();
        return "redirect:/";
    }
	
	@RequestMapping("verificaLogin")
	public String valLogin(Cliente cliente, HttpSession session, Model model) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente c = clienteDAO.validaCliente(cliente);
		if (c != null) {
            session.setAttribute("usuarioLogado", c);

            return "redirect:carregaProdutos";	
		} else {
			String erro = "erro";
			model.addAttribute("erroLogin", erro);
			return "Login";
		}		
	}
	
	@RequestMapping("formClienteNovo")	
	public String formClienteNovo() {
		return "ClienteCadNovoForm";
	}
	
	@RequestMapping("formCliente")
	public String formCliente() {
		return "ClienteCadForm";
	}

	@RequestMapping("addCliente")
	public String adiciona(Cliente cliente) {
				
		ClienteDAO clienteDAO = new ClienteDAO();
		if (clienteDAO.adicionaCliente(cliente).equals("add")) {
			return "redirect:carregaProdutos";	
		} else {
			return "Erro ao adicionar cliente";
		}
		
	}
	
}
