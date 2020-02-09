package br.com.fti.aterminar;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientes1")
public class Clientes {
	
	@Id
	@GeneratedValue
	private int id;

	private String nome;
	
	
	private String cpf;
	
	
	private Date data_nascimento;
	
	
	@OneToMany(mappedBy = "clientes", targetEntity = Produtos.class, cascade = CascadeType.ALL, orphanRemoval = true)
	private Produtos produtos;
	
	@OneToMany(mappedBy = "clientes", targetEntity = Pedido.class, cascade = CascadeType.ALL, orphanRemoval = true)
	private Pedido pedido;
	
	public Clientes() {}


	public Clientes(int id, String nome, String cpf, Date data_nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getData_nascimento() {
		return data_nascimento;
	}


	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	};
	
	
	
	
	
}
