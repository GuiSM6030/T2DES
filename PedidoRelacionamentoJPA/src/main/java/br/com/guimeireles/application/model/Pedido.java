package br.com.guimeireles.application.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "valor_total")
	private Double valorTotal;

	//escolhe como Date	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date data;

	@OneToOne
	//nomeia a tabela que vai recehber a foreing key
	@JoinColumn(name = "pagamento_id")// 
	private Pagamento pagamento;

	@ManyToOne //cardinalidade do relacionamento (m,1)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@ManyToMany(fetch = FetchType.EAGER)//cardinalidade do relacionamento (m,m)
	//nomeia uma tabela para receber 2 foreign key
	@JoinTable(name = "pedido_produto", 
	joinColumns = @JoinColumn(name = "pedido_id"),
	inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private List<Produto> produtos = new ArrayList<Produto>();


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", valorTotal=" + valorTotal + ", data="
				+ data + "]";
	}
}
