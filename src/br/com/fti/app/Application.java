package br.com.fti.app;

import java.text.ParseException;

import br.com.fti.model.dao.ClienteDAO;
import br.com.fti.model.dao.ProdutoDAO;
import br.com.fti.model.entities.Produto;

public class Application {

	public static void main(String[] args) throws ParseException {

		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Cliente c = new Cliente();
//		
//		c.setCpfCliente("12345678912");
//		c.setDataNascCliente(sdf.parse("12/07/1994"));
//		c.setEmailCliente("teste1@teste.com");
//		c.setEnderecoCliente("Rua Teste");
//		c.setNomeCliente("Teste 1");
//		c.setSenhaCliente("123");
//		c.setSexoCliente("F");
//		c.setTelefoneCliente("33211254");
//		
//		ClienteDAO dao = new ClienteDAO();
		
//		ProdutoDAO produtoDAO = new ProdutoDAO();
//		List<Produto> list = new ArrayList<>();
//		
//		list = produtoDAO.carregaProduto();
//		
//		for (Produto p : list) {
//			System.out.println(p.getNomeProduto());
//		}
//		
		
//		
//		ProdutoDAO produtoDAO = new ProdutoDAO();
//		Produto p = produtoDAO.carregaProduto(2L);
//		
//		System.out.println(p.getNomeProduto() +" " + p.getDescricaoProduto());
//		
//		produtoDAO.deletaProduto(12);
		
		
		Produto p = new Produto();
		ClienteDAO clienteDAO = new ClienteDAO();
		
		p.setCliente(clienteDAO.carregaCliente(1));
		p.setDescricaoProduto("descri��o produto");
		p.setEstadoProduto("N");
		p.setFotoProduto("1");
		p.setNomeProduto("produto 1");
		p.setValorProduto(1);
		
		ProdutoDAO pDAO = new ProdutoDAO();
		pDAO.adicionaProduto(p);
		
		
		
		
	}

}
