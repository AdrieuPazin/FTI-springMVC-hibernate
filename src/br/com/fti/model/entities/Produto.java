package br.com.fti.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nomeProduto;
	
	@Column(nullable = false)
	private String descricaoProduto;
	
	@Column(nullable = false)
	private String estadoProduto;
	
	private String estadoConservacaoProduto;
	
	@Column(nullable = false)
	private double valorProduto;
	
	@Column(nullable = false)
	private String fotoProduto;
	
//	@ManyToOne
//	@JoinColumn(name="fk_cod_cliente")
//	private Cliente cliente;
	
	public Produto() {}
	
	public Produto(Long id, String nomeProduto, String descricaoProduto, String estadoProduto,
			String estadoConservacaoProduto, double valorProduto, String fotoProduto) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.estadoProduto = estadoProduto;
		this.estadoConservacaoProduto = estadoConservacaoProduto;
		this.valorProduto = valorProduto;
		this.fotoProduto = fotoProduto;
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getEstadoProduto() {
		return estadoProduto;
	}

	public void setEstadoProduto(String estadoProduto) {
		this.estadoProduto = estadoProduto;
	}

	public String getEstadoConservacaoProduto() {
		return estadoConservacaoProduto;
	}

	public void setEstadoConservacaoProduto(String estadoConservacaoProduto) {
		this.estadoConservacaoProduto = estadoConservacaoProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getFotoProduto() {
		return fotoProduto;
	}

	public void setFotoProduto(String fotoProduto) {
		this.fotoProduto = fotoProduto;
	}

//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
//	
	

}






