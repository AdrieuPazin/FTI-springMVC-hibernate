package br.com.fti.model.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="clientes")
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nomeCliente;
	
	private String cpfCliente;
	
	@Temporal (TemporalType.DATE)
	private Date dataNascCliente;
	
	private String enderecoCliente;
	
	private String sexoCliente;
	
	private String telefoneCliente;
	
	private String emailCliente;
	
	private String senhaCliente;
	
//	@OneToMany(mappedBy = "clientes", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	private List<Produto> listaProduto;
//	
	
	public Cliente() {}
	
	public Cliente(Long id, String nomeCliente, String cpfCliente, Date dataNascCliente, String enderecoCliente,
			String sexoCliente, String telefoneCliente, String emailCliente, String senhaCliente) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.dataNascCliente = dataNascCliente;
		this.enderecoCliente = enderecoCliente;
		this.sexoCliente = sexoCliente;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Date getDataNascCliente() {
		return dataNascCliente;
	}

	public void setDataNascCliente(Date dataNascCliente) {
		this.dataNascCliente = dataNascCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

//	public List<Produto> getListaProduto() {
//		return listaProduto;
//	}
//
//	public void setListaProduto(List<Produto> listaProduto) {
//		this.listaProduto = listaProduto;
//	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente
				+ ", dataNascCliente=" + dataNascCliente + ", enderecoCliente=" + enderecoCliente + ", sexoCliente="
				+ sexoCliente + ", telefoneCliente=" + telefoneCliente + ", emailCliente=" + emailCliente
				+ ", senhaCliente=" + senhaCliente + "]";
	}
	
	
	
	
	
	
	
}

