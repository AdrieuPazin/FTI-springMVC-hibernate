package br.com.fti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fti.model.dao.ProdutoDAO;
import br.com.fti.model.entities.Produto;

@Controller
public class ProdutoController {

	@RequestMapping("formProduto")
	public String formCliente(Model model) {
		
		return "ProdutoCadForm";
	}
	
	@RequestMapping("carregaProdutoEdt")
	public String carregaProdutoEdt(@RequestParam(value="id") int id, Model model) {
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto p = produtoDAO.carregaProduto(id);
		
		model.addAttribute("produtoCarregado", p);		
		
		return "ProdutoEdtForm";
	}
	@RequestMapping("delProduto")
	public String delProduto(@RequestParam(value="id") int id, Model model) {
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		long id2 = id;
		
		produtoDAO.deletaProduto(id2);
		
		
		return "redirect:carregaProdutos";
		
	}
	
	
	@RequestMapping("edtProduto")
	public String edtProduto(@RequestParam(value="id") int id, Produto p) {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		p.setId((long) id);
		produtoDAO.atualizaProduto(p);		
		
		return "redirect:carregaProdutos";
	}
	
	@RequestMapping("carregaProdutos")
	public String listProdutos(Model model) {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> list = new ArrayList<>();
		
		list = produtoDAO.carregaProduto();
		model.addAttribute("listProduto", list);
		return "Home";
	}

	@RequestMapping("addProduto")
	public String adiciona(Produto produto) {
				
		ProdutoDAO produtoDAO = new ProdutoDAO();
		if (produtoDAO.adicionaProduto(produto).equals("add")) {
			return "ProdutoAdd";	
		} else {
			return "Erro ao adicionar produto";
		}
		
	}
	
	
}
