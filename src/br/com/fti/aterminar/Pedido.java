package br.com.fti.aterminar;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pedidos1")
public class Pedido {

	@Id
	@GeneratedValue
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date data_pedido;
	
	private double valor_total;
	
	@ManyToOne 
	@JoinColumn(name = "fk_clientes")
	private Clientes clientes;
	
	@OneToMany(mappedBy = "pedidos", orphanRemoval = true, targetEntity = ItemPedido.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<ItemPedido> listaItensPedido;
	
	public Pedido() {}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	
	
}
