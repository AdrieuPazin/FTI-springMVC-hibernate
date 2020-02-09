package br.com.fti.aterminar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="itemPedido1")
public class ItemPedido {

	@Id
	@GeneratedValue
	private int id;
	
	private int quantidade_item;
	
	private double valor_unitario;
	
	
	@ManyToOne
	@JoinColumn(name="fk_pedidos", nullable= false)
	private Pedido pedidos;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_produtos")
	private Produtos produtos;
	
	public ItemPedido() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade_item() {
		return quantidade_item;
	}

	public void setQuantidade_item(int quantidade_item) {
		this.quantidade_item = quantidade_item;
	}

	public double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	
	
}
