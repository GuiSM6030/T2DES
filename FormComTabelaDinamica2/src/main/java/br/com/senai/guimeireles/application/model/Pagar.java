package br.com.senai.guimeireles.application.model;

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

@SuppressWarnings("serial")
@Entity
public class Pagar implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "valor_total")
	private Double valorTotal;

	@ManyToOne //cardinalidade do relacionamento (m,1)
	@JoinColumn(name = "desc_id")
	private Despesas descricao;

	@ManyToMany(fetch = FetchType.EAGER)//cardinalidade do relacionamento (m,m)
	//nomeia uma tabela para receber 2 foreign key
	@JoinTable(name = "pagar_aposta", 
	joinColumns = @JoinColumn(name = "pagar_id"),
	inverseJoinColumns = @JoinColumn(name = "aposta_id"))
	private List<Produtos> produtos = new ArrayList<Produtos>();


	public Despesas getDescricao() {
		return descricao;
	}

	public void setDescricao(Despesas descricao) {
		this.descricao = descricao;
	}

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


	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", valorTotal=" + valorTotal + "]";
	}
}


