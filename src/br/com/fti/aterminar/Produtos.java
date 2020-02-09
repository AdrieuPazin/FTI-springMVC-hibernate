package br.com.fti.aterminar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="produtos1'")
public class Produtos {

	@Id
	@GeneratedValue
	private int id;
	
	private String descricao;
	
	private double valor;
	
	@ManyToOne 
	@JoinColumn(name = "fk_clientes")
	private Clientes clientes;
	
	@OneToOne(mappedBy = "produtos", fetch = FetchType.LAZY)
	private ItemPedido itemPedido;
	
	public Produtos() {}

	public Produtos(int id, String descricao, double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
